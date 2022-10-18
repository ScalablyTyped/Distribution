package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Path2")
@js.native
open class Path2 protected ()
  extends typings.babylonjs.mathsIndexMod.Path2 {
  /**
    * Creates a Path2 object from the starting 2D coordinates x and y.
    * @param x the starting points x value
    * @param y the starting points y value
    */
  def this(x: Double, y: Double) = this()
}
/* static members */
object Path2 {
  
  @JSImport("babylonjs/index", "Path2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new path starting from an x and y position
    * @param x starting x value
    * @param y starting y value
    * @returns a new Path2 starting at the coordinates (x, y).
    */
  inline def StartingAt(x: Double, y: Double): typings.babylonjs.mathsMathDotpathMod.Path2 = (^.asInstanceOf[js.Dynamic].applyDynamic("StartingAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotpathMod.Path2]
}
