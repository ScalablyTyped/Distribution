package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelingJobDataSource extends js.Object {
  
  /**
    * The Amazon S3 location of the input data objects.
    */
  var S3DataSource: js.UndefOr[LabelingJobS3DataSource] = js.native
  
  /**
    * An Amazon SNS data source used for streaming labeling jobs.
    */
  var SnsDataSource: js.UndefOr[LabelingJobSnsDataSource] = js.native
}
object LabelingJobDataSource {
  
  @scala.inline
  def apply(): LabelingJobDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobDataSource]
  }
  
  @scala.inline
  implicit class LabelingJobDataSourceOps[Self <: LabelingJobDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3DataSource(value: LabelingJobS3DataSource): Self = this.set("S3DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DataSource: Self = this.set("S3DataSource", js.undefined)
    
    @scala.inline
    def setSnsDataSource(value: LabelingJobSnsDataSource): Self = this.set("SnsDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsDataSource: Self = this.set("SnsDataSource", js.undefined)
  }
}
