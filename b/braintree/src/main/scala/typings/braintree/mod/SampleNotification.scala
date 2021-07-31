package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleNotification extends StObject {
  
  var bt_payload: String
  
  var bt_signature: String
}
object SampleNotification {
  
  @scala.inline
  def apply(bt_payload: String, bt_signature: String): SampleNotification = {
    val __obj = js.Dynamic.literal(bt_payload = bt_payload.asInstanceOf[js.Any], bt_signature = bt_signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleNotification]
  }
  
  @scala.inline
  implicit class SampleNotificationMutableBuilder[Self <: SampleNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBt_payload(value: String): Self = StObject.set(x, "bt_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBt_signature(value: String): Self = StObject.set(x, "bt_signature", value.asInstanceOf[js.Any])
  }
}
