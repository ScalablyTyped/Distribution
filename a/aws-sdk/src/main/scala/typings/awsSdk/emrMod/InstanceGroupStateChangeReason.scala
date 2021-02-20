package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupStateChangeReason extends StObject {
  
  /**
    * The programmable code for the state change reason.
    */
  var Code: js.UndefOr[InstanceGroupStateChangeReasonCode] = js.native
  
  /**
    * The status change reason description.
    */
  var Message: js.UndefOr[String] = js.native
}
object InstanceGroupStateChangeReason {
  
  @scala.inline
  def apply(): InstanceGroupStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupStateChangeReason]
  }
  
  @scala.inline
  implicit class InstanceGroupStateChangeReasonMutableBuilder[Self <: InstanceGroupStateChangeReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: InstanceGroupStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
