package typings.cordovaPluginInappbrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cordova extends StObject {
  
  var InAppBrowser: typings.cordovaPluginInappbrowser.InAppBrowser = js.native
}
object Cordova {
  
  @scala.inline
  def apply(InAppBrowser: InAppBrowser): Cordova = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  @scala.inline
  implicit class CordovaMutableBuilder[Self <: Cordova] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInAppBrowser(value: InAppBrowser): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
  }
}
