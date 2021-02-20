package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectionsErrorEventArgs extends StObject {
  
  /** The error message. */
  var message: String = js.native
  
  /** The code which identifies the error that occurred. */
  var responseCode: RouteResponseCode = js.native
}
object IDirectionsErrorEventArgs {
  
  @scala.inline
  def apply(message: String, responseCode: RouteResponseCode): IDirectionsErrorEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsErrorEventArgs]
  }
  
  @scala.inline
  implicit class IDirectionsErrorEventArgsMutableBuilder[Self <: IDirectionsErrorEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: RouteResponseCode): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
  }
}
