package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsSubscription extends StObject {
  
  /**
    * The ARN of a standard.
    */
  var StandardsArn: NonEmptyString
  
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: StandardsInputParameterMap
  
  /**
    * The status of the standards subscription.
    */
  var StandardsStatus: typings.awsSdk.securityhubMod.StandardsStatus
  
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString
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
  implicit class StandardsSubscriptionMutableBuilder[Self <: StandardsSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsInput(value: StandardsInputParameterMap): Self = StObject.set(x, "StandardsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsStatus(value: StandardsStatus): Self = StObject.set(x, "StandardsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "StandardsSubscriptionArn", value.asInstanceOf[js.Any])
  }
}
