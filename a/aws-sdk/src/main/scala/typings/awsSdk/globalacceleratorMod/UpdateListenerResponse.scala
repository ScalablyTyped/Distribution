package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateListenerResponse extends StObject {
  
  /**
    * Information for the updated listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listener] = js.native
}
object UpdateListenerResponse {
  
  @scala.inline
  def apply(): UpdateListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateListenerResponse]
  }
  
  @scala.inline
  implicit class UpdateListenerResponseMutableBuilder[Self <: UpdateListenerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListener(value: Listener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
