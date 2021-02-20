package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusReason extends StObject {
  
  /**
    * The corresponding description for the status reason code.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A code that represents a reason for the control status. For the list of status reason codes and their meanings, see Standards-related information in the ASFF in the AWS Security Hub User Guide. 
    */
  var ReasonCode: NonEmptyString = js.native
}
object StatusReason {
  
  @scala.inline
  def apply(ReasonCode: NonEmptyString): StatusReason = {
    val __obj = js.Dynamic.literal(ReasonCode = ReasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReason]
  }
  
  @scala.inline
  implicit class StatusReasonMutableBuilder[Self <: StatusReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setReasonCode(value: NonEmptyString): Self = StObject.set(x, "ReasonCode", value.asInstanceOf[js.Any])
  }
}
