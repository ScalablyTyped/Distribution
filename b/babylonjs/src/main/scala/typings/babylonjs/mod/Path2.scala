package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Path2")
@js.native
class Path2 protected ()
  extends typings.babylonjs.legacyMod.Path2 {
  /**
    * Creates a Path2 object from the starting 2D coordinates x and y.
    * @param x the starting points x value
    * @param y the starting points y value
    */
  def this(x: Double, y: Double) = this()
}
/* static members */
@JSImport("babylonjs", "Path2")
@js.native
object Path2 extends js.Object {
  
  /**
    * Creates a new path starting from an x and y position
    * @param x starting x value
    * @param y starting y value
    * @returns a new Path2 starting at the coordinates (x, y).
    */
  def StartingAt(x: Double, y: Double): typings.babylonjs.mathPathMod.Path2 = js.native
}
