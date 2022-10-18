package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebGL Context Compatability
  *
  * ref: https://immersive-web.github.io/webxr/#contextcompatibility
  */
trait WebGLContextAttributes extends StObject {
  
  var xrCompatible: js.UndefOr[Boolean] = js.undefined
}
object WebGLContextAttributes {
  
  inline def apply(): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextAttributes]
  }
  
  extension [Self <: WebGLContextAttributes](x: Self) {
    
    inline def setXrCompatible(value: Boolean): Self = StObject.set(x, "xrCompatible", value.asInstanceOf[js.Any])
    
    inline def setXrCompatibleUndefined: Self = StObject.set(x, "xrCompatible", js.undefined)
  }
}
