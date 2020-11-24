package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelingJobSnsDataSource extends js.Object {
  
  /**
    * The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to send new data objects to a streaming labeling job. If you specify an input topic for SnsTopicArn in InputConfig, you must specify a value for SnsTopicArn in OutputConfig.
    */
  var SnsTopicArn: typings.awsSdk.sagemakerMod.SnsTopicArn = js.native
}
object LabelingJobSnsDataSource {
  
  @scala.inline
  def apply(SnsTopicArn: SnsTopicArn): LabelingJobSnsDataSource = {
    val __obj = js.Dynamic.literal(SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobSnsDataSource]
  }
  
  @scala.inline
  implicit class LabelingJobSnsDataSourceOps[Self <: LabelingJobSnsDataSource] (val x: Self) extends AnyVal {
    
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
    def setSnsTopicArn(value: SnsTopicArn): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
  }
}
