package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFluidRenderingRenderObject extends StObject {
  
  /** object rendered as a fluid */
  var `object`: FluidRenderingObject
  
  /** target renderer used to render the fluid object */
  var targetRenderer: FluidRenderingTargetRenderer
}
object IFluidRenderingRenderObject {
  
  inline def apply(`object`: FluidRenderingObject, targetRenderer: FluidRenderingTargetRenderer): IFluidRenderingRenderObject = {
    val __obj = js.Dynamic.literal(targetRenderer = targetRenderer.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFluidRenderingRenderObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFluidRenderingRenderObject] (val x: Self) extends AnyVal {
    
    inline def setObject(value: FluidRenderingObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setTargetRenderer(value: FluidRenderingTargetRenderer): Self = StObject.set(x, "targetRenderer", value.asInstanceOf[js.Any])
  }
}
