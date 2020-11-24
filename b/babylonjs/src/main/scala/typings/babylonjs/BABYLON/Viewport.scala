package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewport extends js.Object {
  
  /** viewport height */
  var height: Double = js.native
  
  /**
    * Creates a new viewport using absolute sizing (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @returns a new Viewport
    */
  def toGlobal(renderWidth: Double, renderHeight: Double): Viewport = js.native
  
  /**
    * Stores absolute viewport value into a target viewport (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @param ref defines the target viewport
    * @returns the current viewport
    */
  def toGlobalToRef(renderWidth: Double, renderHeight: Double, ref: Viewport): Viewport = js.native
  
  /**viewport width */
  var width: Double = js.native
  
  /** viewport left coordinate */
  var x: Double = js.native
  
  /** viewport top coordinate */
  var y: Double = js.native
}
object Viewport {
  
  @scala.inline
  def apply(
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
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToGlobal(value: (Double, Double) => Viewport): Self = this.set("toGlobal", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToGlobalToRef(value: (Double, Double, Viewport) => Viewport): Self = this.set("toGlobalToRef", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
