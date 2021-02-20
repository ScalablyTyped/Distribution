package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStateChangeReason extends StObject {
  
  /**
    * The programmable code for the state change reason.
    */
  var Code: js.UndefOr[InstanceStateChangeReasonCode] = js.native
  
  /**
    * The status change reason description.
    */
  var Message: js.UndefOr[String] = js.native
}
object InstanceStateChangeReason {
  
  @scala.inline
  def apply(): InstanceStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStateChangeReason]
  }
  
  @scala.inline
  implicit class InstanceStateChangeReasonMutableBuilder[Self <: InstanceStateChangeReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: InstanceStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
