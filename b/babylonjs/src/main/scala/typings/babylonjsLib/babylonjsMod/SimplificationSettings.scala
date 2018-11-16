package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to specify simplification options
     * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
     */
@JSImport("babylonjs", "SimplificationSettings")
@js.native
class SimplificationSettings protected ()
  extends babylonjsLib.BABYLONNs.SimplificationSettings {
  /**
           * Creates a SimplificationSettings
           * @param quality expected quality
           * @param distance distance when this optimized version should be used
           * @param optimizeMesh already optimized mesh
           */
  def this(/** expected quality */
  quality: scala.Double, /** distance when this optimized version should be used */
  distance: scala.Double) = this()
  /**
           * Creates a SimplificationSettings
           * @param quality expected quality
           * @param distance distance when this optimized version should be used
           * @param optimizeMesh already optimized mesh
           */
  def this(/** expected quality */
  quality: scala.Double, /** distance when this optimized version should be used */
  distance: scala.Double, /** already optimized mesh  */
  optimizeMesh: scala.Boolean) = this()
}

