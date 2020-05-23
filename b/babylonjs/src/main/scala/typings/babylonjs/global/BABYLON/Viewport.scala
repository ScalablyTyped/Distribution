package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Viewport")
@js.native
class Viewport protected ()
  extends typings.babylonjs.BABYLON.Viewport {
  /**
    * Creates a Viewport object located at (x, y) and sized (width, height)
    * @param x defines viewport left coordinate
    * @param y defines viewport top coordinate
    * @param width defines the viewport width
    * @param height defines the viewport height
    */
  def this(
    /** viewport left coordinate */
  x: Double,
    /** viewport top coordinate */
  y: Double,
    /**viewport width */
  width: Double,
    /** viewport height */
  height: Double
  ) = this()
  /** viewport height */
  /* CompleteClass */
  override var height: Double = js.native
  /**viewport width */
  /* CompleteClass */
  override var width: Double = js.native
  /** viewport left coordinate */
  /* CompleteClass */
  override var x: Double = js.native
  /** viewport top coordinate */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * Creates a new viewport using absolute sizing (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @returns a new Viewport
    */
  /* CompleteClass */
  override def toGlobal(renderWidth: Double, renderHeight: Double): typings.babylonjs.BABYLON.Viewport = js.native
  /**
    * Stores absolute viewport value into a target viewport (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @param ref defines the target viewport
    * @returns the current viewport
    */
  /* CompleteClass */
  override def toGlobalToRef(renderWidth: Double, renderHeight: Double, ref: typings.babylonjs.BABYLON.Viewport): typings.babylonjs.BABYLON.Viewport = js.native
}

