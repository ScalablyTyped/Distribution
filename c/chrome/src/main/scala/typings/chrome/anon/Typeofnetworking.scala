package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofnetworking extends StObject {
  
  ////////////////////
  // Notifications
  ////////////////////
  /**
    * Use the networking.config API to authenticate to captive portals.
    * Permissions:  "networking.config"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val config: Typeofconfig
}
object Typeofnetworking {
  
  inline def apply(config: Typeofconfig): Typeofnetworking = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetworking]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofnetworking] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: Typeofconfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
