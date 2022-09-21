package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INative extends StObject {
  
  var Camera: INativeCameraConstructor
  
  var Canvas: INativeCanvasConstructor
  
  var DeviceInputSystem: IDeviceInputSystemConstructor
  
  var Engine: INativeEngineConstructor
  
  var Image: INativeImageConstructor
  
  var NativeDataStream: INativeDataStreamConstructor
  
  var XMLHttpRequest: Any
}
object INative {
  
  inline def apply(
    Camera: INativeCameraConstructor,
    Canvas: INativeCanvasConstructor,
    DeviceInputSystem: IDeviceInputSystemConstructor,
    Engine: INativeEngineConstructor,
    Image: INativeImageConstructor,
    NativeDataStream: INativeDataStreamConstructor,
    XMLHttpRequest: Any
  ): INative = {
    val __obj = js.Dynamic.literal(Camera = Camera.asInstanceOf[js.Any], Canvas = Canvas.asInstanceOf[js.Any], DeviceInputSystem = DeviceInputSystem.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], NativeDataStream = NativeDataStream.asInstanceOf[js.Any], XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[INative]
  }
  
  extension [Self <: INative](x: Self) {
    
    inline def setCamera(value: INativeCameraConstructor): Self = StObject.set(x, "Camera", value.asInstanceOf[js.Any])
    
    inline def setCanvas(value: INativeCanvasConstructor): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
    
    inline def setDeviceInputSystem(value: IDeviceInputSystemConstructor): Self = StObject.set(x, "DeviceInputSystem", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: INativeEngineConstructor): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setImage(value: INativeImageConstructor): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setNativeDataStream(value: INativeDataStreamConstructor): Self = StObject.set(x, "NativeDataStream", value.asInstanceOf[js.Any])
    
    inline def setXMLHttpRequest(value: Any): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
  }
}
