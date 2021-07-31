package typings.cordovaPluginEmailComposer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var email: CordovaPluginEmailComposer
}
object CordovaPlugins {
  
  @scala.inline
  def apply(email: CordovaPluginEmailComposer): CordovaPlugins = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: CordovaPluginEmailComposer): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
