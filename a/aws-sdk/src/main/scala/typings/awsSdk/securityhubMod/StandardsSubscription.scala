package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardsSubscription extends js.Object {
  
  /**
    * The ARN of a standard.
    */
  var StandardsArn: NonEmptyString = js.native
  
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: StandardsInputParameterMap = js.native
  
  /**
    * The status of the standards subscription.
    */
  var StandardsStatus: typings.awsSdk.securityhubMod.StandardsStatus = js.native
  
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString = js.native
}
object StandardsSubscription {
  
  @scala.inline
  def apply(
    StandardsArn: NonEmptyString,
    StandardsInput: StandardsInputParameterMap,
    StandardsStatus: StandardsStatus,
    StandardsSubscriptionArn: NonEmptyString
  ): StandardsSubscription = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn.asInstanceOf[js.Any], StandardsInput = StandardsInput.asInstanceOf[js.Any], StandardsStatus = StandardsStatus.asInstanceOf[js.Any], StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscription]
  }
  
  @scala.inline
  implicit class StandardsSubscriptionOps[Self <: StandardsSubscription] (val x: Self) extends AnyVal {
    
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
    def setStandardsArn(value: NonEmptyString): Self = this.set("StandardsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsInput(value: StandardsInputParameterMap): Self = this.set("StandardsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsStatus(value: StandardsStatus): Self = this.set("StandardsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsSubscriptionArn(value: NonEmptyString): Self = this.set("StandardsSubscriptionArn", value.asInstanceOf[js.Any])
  }
}
