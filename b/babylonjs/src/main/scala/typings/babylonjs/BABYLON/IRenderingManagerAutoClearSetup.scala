package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderingManagerAutoClearSetup extends StObject {
  
  /**
    * Defines whether or not autoclear is enable.
    */
  var autoClear: Boolean
  
  /**
    * Defines whether or not to autoclear the depth buffer.
    */
  var depth: Boolean
  
  /**
    * Defines whether or not to autoclear the stencil buffer.
    */
  var stencil: Boolean
}
object IRenderingManagerAutoClearSetup {
  
  inline def apply(autoClear: Boolean, depth: Boolean, stencil: Boolean): IRenderingManagerAutoClearSetup = {
    val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderingManagerAutoClearSetup]
  }
  
  extension [Self <: IRenderingManagerAutoClearSetup](x: Self) {
    
    inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
  }
}
