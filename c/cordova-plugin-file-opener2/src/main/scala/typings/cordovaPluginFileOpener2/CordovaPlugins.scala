package typings.cordovaPluginFileOpener2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var fileOpener2: CordovaPluginsFileOpener2
}
object CordovaPlugins {
  
  @scala.inline
  def apply(fileOpener2: CordovaPluginsFileOpener2): CordovaPlugins = {
    val __obj = js.Dynamic.literal(fileOpener2 = fileOpener2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileOpener2(value: CordovaPluginsFileOpener2): Self = StObject.set(x, "fileOpener2", value.asInstanceOf[js.Any])
  }
}
