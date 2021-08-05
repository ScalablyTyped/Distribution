package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStandardsControlRequest extends StObject {
  
  /**
    * The updated status of the security standard control.
    */
  var ControlStatus: js.UndefOr[typings.awsSdk.securityhubMod.ControlStatus] = js.undefined
  
  /**
    * A description of the reason why you are disabling a security standard control. If you are disabling a control, then this is required.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the security standard control to enable or disable.
    */
  var StandardsControlArn: NonEmptyString
}
object UpdateStandardsControlRequest {
  
  inline def apply(StandardsControlArn: NonEmptyString): UpdateStandardsControlRequest = {
    val __obj = js.Dynamic.literal(StandardsControlArn = StandardsControlArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStandardsControlRequest]
  }
  
  extension [Self <: UpdateStandardsControlRequest](x: Self) {
    
    inline def setControlStatus(value: ControlStatus): Self = StObject.set(x, "ControlStatus", value.asInstanceOf[js.Any])
    
    inline def setControlStatusUndefined: Self = StObject.set(x, "ControlStatus", js.undefined)
    
    inline def setDisabledReason(value: NonEmptyString): Self = StObject.set(x, "DisabledReason", value.asInstanceOf[js.Any])
    
    inline def setDisabledReasonUndefined: Self = StObject.set(x, "DisabledReason", js.undefined)
    
    inline def setStandardsControlArn(value: NonEmptyString): Self = StObject.set(x, "StandardsControlArn", value.asInstanceOf[js.Any])
  }
}
