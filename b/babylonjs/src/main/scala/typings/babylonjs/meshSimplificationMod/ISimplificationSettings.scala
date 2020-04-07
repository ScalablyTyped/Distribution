package typings.babylonjs.meshSimplificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimplificationSettings extends js.Object {
  /**
    * Gets or sets the distance when this optimized version should be used
    */
  var distance: Double
  /**
    * Gets an already optimized mesh
    */
  var optimizeMesh: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the expected quality
    */
  var quality: Double
}

object ISimplificationSettings {
  @scala.inline
  def apply(distance: Double, quality: Double, optimizeMesh: js.UndefOr[Boolean] = js.undefined): ISimplificationSettings = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeMesh)) __obj.updateDynamic("optimizeMesh")(optimizeMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationSettings]
  }
}

