package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceInput extends js.Object {
  
  /**
    * The ARN of the CloudWatch resource that you want to view tags for. The ARN format of an alarm is arn:aws:cloudwatch:Region:account-id:alarm:alarm-name   The ARN format of a Contributor Insights rule is arn:aws:cloudwatch:Region:account-id:insight-rule:insight-rule-name   For more information about ARN format, see  Resource Types Defined by Amazon CloudWatch in the Amazon Web Services General Reference.
    */
  var ResourceARN: AmazonResourceName = js.native
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceInputOps[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceARN(value: AmazonResourceName): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
  }
}
