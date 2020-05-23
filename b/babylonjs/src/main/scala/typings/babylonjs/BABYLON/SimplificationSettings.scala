package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplificationSettings extends ISimplificationSettings

object SimplificationSettings {
  @scala.inline
  def apply(distance: Double, quality: Double, optimizeMesh: js.UndefOr[Boolean] = js.undefined): SimplificationSettings = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeMesh)) __obj.updateDynamic("optimizeMesh")(optimizeMesh.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplificationSettings]
  }
}

