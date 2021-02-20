package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteListenerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString = js.native
}
object DeleteListenerRequest {
  
  @scala.inline
  def apply(ListenerArn: GenericString): DeleteListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteListenerRequest]
  }
  
  @scala.inline
  implicit class DeleteListenerRequestMutableBuilder[Self <: DeleteListenerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
