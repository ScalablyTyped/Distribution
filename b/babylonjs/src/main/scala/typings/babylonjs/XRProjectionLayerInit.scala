package typings.babylonjs

import typings.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRProjectionLayerInit extends StObject {
  
  //  Default  "texture";
  var colorFormat: GLenum
  
  //  Default 0x1908, RGBA
  var depthFormat: GLenum
  
  //  Default 0x1902, DEPTH_COMPONENT
  var scaleFactor: Double
  
  var textureType: XRTextureType
}
object XRProjectionLayerInit {
  
  inline def apply(colorFormat: GLenum, depthFormat: GLenum, scaleFactor: Double, textureType: XRTextureType): XRProjectionLayerInit = {
    val __obj = js.Dynamic.literal(colorFormat = colorFormat.asInstanceOf[js.Any], depthFormat = depthFormat.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], textureType = textureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRProjectionLayerInit]
  }
  
  extension [Self <: XRProjectionLayerInit](x: Self) {
    
    inline def setColorFormat(value: GLenum): Self = StObject.set(x, "colorFormat", value.asInstanceOf[js.Any])
    
    inline def setDepthFormat(value: GLenum): Self = StObject.set(x, "depthFormat", value.asInstanceOf[js.Any])
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setTextureType(value: XRTextureType): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
  }
}
