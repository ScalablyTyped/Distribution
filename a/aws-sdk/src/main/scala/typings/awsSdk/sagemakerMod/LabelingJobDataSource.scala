package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelingJobDataSource extends StObject {
  
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
  implicit class LabelingJobDataSourceMutableBuilder[Self <: LabelingJobDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3DataSource(value: LabelingJobS3DataSource): Self = StObject.set(x, "S3DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DataSourceUndefined: Self = StObject.set(x, "S3DataSource", js.undefined)
    
    @scala.inline
    def setSnsDataSource(value: LabelingJobSnsDataSource): Self = StObject.set(x, "SnsDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsDataSourceUndefined: Self = StObject.set(x, "SnsDataSource", js.undefined)
  }
}
