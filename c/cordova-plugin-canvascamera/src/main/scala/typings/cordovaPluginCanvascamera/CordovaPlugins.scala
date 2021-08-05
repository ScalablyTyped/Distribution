package typings.cordovaPluginCanvascamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  /**
    * cordova-plugin-device-name interface
    */
  var CanvasCamera: typings.cordovaPluginCanvascamera.CanvasCamera
}
object CordovaPlugins {
  
  inline def apply(CanvasCamera: CanvasCamera): CordovaPlugins = {
    val __obj = js.Dynamic.literal(CanvasCamera = CanvasCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setCanvasCamera(value: CanvasCamera): Self = StObject.set(x, "CanvasCamera", value.asInstanceOf[js.Any])
  }
}
