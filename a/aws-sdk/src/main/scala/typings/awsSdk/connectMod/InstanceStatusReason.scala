package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatusReason extends StObject {
  
  /**
    * The message.
    */
  var Message: js.UndefOr[String] = js.native
}
object InstanceStatusReason {
  
  @scala.inline
  def apply(): InstanceStatusReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusReason]
  }
  
  @scala.inline
  implicit class InstanceStatusReasonMutableBuilder[Self <: InstanceStatusReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
