package typings.cordovaPluginCanvascamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends StObject {
  
  /**
    * cordova-plugin-device-name interface
    */
  var CanvasCamera: typings.cordovaPluginCanvascamera.CanvasCamera = js.native
}
object CordovaPlugins {
  
  @scala.inline
  def apply(CanvasCamera: CanvasCamera): CordovaPlugins = {
    val __obj = js.Dynamic.literal(CanvasCamera = CanvasCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasCamera(value: CanvasCamera): Self = StObject.set(x, "CanvasCamera", value.asInstanceOf[js.Any])
  }
}
