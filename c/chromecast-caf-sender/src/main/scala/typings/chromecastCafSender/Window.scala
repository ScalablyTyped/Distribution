package typings.chromecastCafSender

import typings.chromecastCafSender.anon.Typeofcast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Global object
////////////////////
trait Window extends StObject {
  
  def __onGCastApiAvailable(available: Boolean): Unit
  
  var cast: Typeofcast
}
object Window {
  
  inline def apply(__onGCastApiAvailable: Boolean => Unit, cast: Typeofcast): Window = {
    val __obj = js.Dynamic.literal(__onGCastApiAvailable = js.Any.fromFunction1(__onGCastApiAvailable), cast = cast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setCast(value: Typeofcast): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    inline def set__onGCastApiAvailable(value: Boolean => Unit): Self = StObject.set(x, "__onGCastApiAvailable", js.Any.fromFunction1(value))
  }
}
