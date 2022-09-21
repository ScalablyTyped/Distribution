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
    * The status of the standard subscription. The status values are as follows:    PENDING - Standard is in the process of being enabled.    READY - Standard is enabled.    INCOMPLETE - Standard could not be enabled completely. Some controls may not be available.    DELETING - Standard is in the process of being disabled.    FAILED - Standard could not be disabled.  
    */
  var StandardsStatus: typings.awsSdk.securityhubMod.StandardsStatus
  
  /**
    * The reason for the current status.
    */
  var StandardsStatusReason: js.UndefOr[typings.awsSdk.securityhubMod.StandardsStatusReason] = js.undefined
  
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString
}
object StandardsSubscription {
  
  inline def apply(
    StandardsArn: NonEmptyString,
    StandardsInput: StandardsInputParameterMap,
    StandardsStatus: StandardsStatus,
    StandardsSubscriptionArn: NonEmptyString
  ): StandardsSubscription = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn.asInstanceOf[js.Any], StandardsInput = StandardsInput.asInstanceOf[js.Any], StandardsStatus = StandardsStatus.asInstanceOf[js.Any], StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscription]
  }
  
  extension [Self <: StandardsSubscription](x: Self) {
    
    inline def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    inline def setStandardsInput(value: StandardsInputParameterMap): Self = StObject.set(x, "StandardsInput", value.asInstanceOf[js.Any])
    
    inline def setStandardsStatus(value: StandardsStatus): Self = StObject.set(x, "StandardsStatus", value.asInstanceOf[js.Any])
    
    inline def setStandardsStatusReason(value: StandardsStatusReason): Self = StObject.set(x, "StandardsStatusReason", value.asInstanceOf[js.Any])
    
    inline def setStandardsStatusReasonUndefined: Self = StObject.set(x, "StandardsStatusReason", js.undefined)
    
    inline def setStandardsSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "StandardsSubscriptionArn", value.asInstanceOf[js.Any])
  }
}
