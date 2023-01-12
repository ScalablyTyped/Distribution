package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  /** viewport height */
  var height: Double
  
  /**
    * Creates a new viewport using absolute sizing (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @returns a new Viewport
    */
  def toGlobal(renderWidth: Double, renderHeight: Double): Viewport
  
  /**
    * Stores absolute viewport value into a target viewport (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @param ref defines the target viewport
    * @returns the current viewport
    */
  def toGlobalToRef(renderWidth: Double, renderHeight: Double, ref: Viewport): Viewport
  
  /**viewport width */
  var width: Double
  
  /** viewport left coordinate */
  var x: Double
  
  /** viewport top coordinate */
  var y: Double
}
object Viewport {
  
  inline def apply(
    height: Double,
    toGlobal: (Double, Double) => Viewport,
    toGlobalToRef: (Double, Double, Viewport) => Viewport,
    width: Double,
    x: Double,
    y: Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], toGlobal = js.Any.fromFunction2(toGlobal), toGlobalToRef = js.Any.fromFunction3(toGlobalToRef), width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setToGlobal(value: (Double, Double) => Viewport): Self = StObject.set(x, "toGlobal", js.Any.fromFunction2(value))
    
    inline def setToGlobalToRef(value: (Double, Double, Viewport) => Viewport): Self = StObject.set(x, "toGlobalToRef", js.Any.fromFunction3(value))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
