package typings.babylonjs.babylonjsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/index", "SimplificationSettings")
@js.native
class SimplificationSettings protected ()
  extends typings.babylonjs.meshSimplificationMod.SimplificationSettings {
  /**
    * Creates a SimplificationSettings
    * @param quality expected quality
    * @param distance distance when this optimized version should be used
    * @param optimizeMesh already optimized mesh
    */
  def this(
    /** expected quality */
  quality: Double,
    /** distance when this optimized version should be used */
  distance: Double
  ) = this()
  def this(
    /** expected quality */
  quality: Double,
    /** distance when this optimized version should be used */
  distance: Double,
    /** already optimized mesh  */
  optimizeMesh: Boolean
  ) = this()
}

