package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Viewport")
@js.native
class Viewport protected ()
  extends typings.babylonjs.legacyMod.Viewport {
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
}
