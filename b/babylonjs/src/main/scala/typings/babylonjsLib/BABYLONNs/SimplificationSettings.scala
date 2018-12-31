package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to specify simplification options
  * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
  */
@JSGlobal("BABYLON.SimplificationSettings")
@js.native
class SimplificationSettings protected () extends ISimplificationSettings {
  /**
    * Creates a SimplificationSettings
    * @param quality expected quality
    * @param distance distance when this optimized version should be used
    * @param optimizeMesh already optimized mesh
    */
  def this(/** expected quality */
  quality: scala.Double, /** distance when this optimized version should be used */
  distance: scala.Double) = this()
  def this(/** expected quality */
  quality: scala.Double, /** distance when this optimized version should be used */
  distance: scala.Double, /** already optimized mesh  */
  optimizeMesh: scala.Boolean) = this()
  /**
    * Gets or sets the distance when this optimized version should be used
    */
  /* CompleteClass */
  override var distance: scala.Double = js.native
  /**
    * Gets or sets the expected quality
    */
  /* CompleteClass */
  override var quality: scala.Double = js.native
}

