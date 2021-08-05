package typings.cordovaPluginEmailComposer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var email: CordovaPluginEmailComposer
}
object CordovaPlugins {
  
  inline def apply(email: CordovaPluginEmailComposer): CordovaPlugins = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setEmail(value: CordovaPluginEmailComposer): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
