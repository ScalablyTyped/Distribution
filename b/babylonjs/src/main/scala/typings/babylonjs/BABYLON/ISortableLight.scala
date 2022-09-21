package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISortableLight extends StObject {
  
  /**
    * Defines the rendering priority of the lights. It can help in case of fallback or number of lights
    * exceeding the number allowed of the materials.
    */
  var renderPriority: Double
  
  /**
    * Gets or sets whether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
    * the current shadow generator.
    */
  var shadowEnabled: Boolean
}
object ISortableLight {
  
  inline def apply(renderPriority: Double, shadowEnabled: Boolean): ISortableLight = {
    val __obj = js.Dynamic.literal(renderPriority = renderPriority.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISortableLight]
  }
  
  extension [Self <: ISortableLight](x: Self) {
    
    inline def setRenderPriority(value: Double): Self = StObject.set(x, "renderPriority", value.asInstanceOf[js.Any])
    
    inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
  }
}
