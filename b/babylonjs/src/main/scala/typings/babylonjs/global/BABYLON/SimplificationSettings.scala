package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SimplificationSettings")
@js.native
class SimplificationSettings protected ()
  extends typings.babylonjs.BABYLON.SimplificationSettings {
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
  /**
    * Gets or sets the distance when this optimized version should be used
    */
  /* CompleteClass */
  override var distance: Double = js.native
  /**
    * Gets or sets the expected quality
    */
  /* CompleteClass */
  override var quality: Double = js.native
}

