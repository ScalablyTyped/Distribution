package typings.babylonjs

import typings.babylonjs.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisableAnimation extends js.Object {
  /**
    * Disable the mesh's animation sequence
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable lighting on the material or the ring and arrow
    */
  var disableLighting: js.UndefOr[Boolean] = js.undefined
  /**
    * Border color for the teleportation area
    */
  var teleportationBorderColor: js.UndefOr[String] = js.undefined
  /**
    * Fill color of the teleportation area
    */
  var teleportationFillColor: js.UndefOr[String] = js.undefined
  /**
    * Override the default material of the torus and arrow
    */
  var torusArrowMaterial: js.UndefOr[Material] = js.undefined
}

object AnonDisableAnimation {
  @scala.inline
  def apply(
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableLighting: js.UndefOr[Boolean] = js.undefined,
    teleportationBorderColor: String = null,
    teleportationFillColor: String = null,
    torusArrowMaterial: Material = null
  ): AnonDisableAnimation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLighting)) __obj.updateDynamic("disableLighting")(disableLighting.asInstanceOf[js.Any])
    if (teleportationBorderColor != null) __obj.updateDynamic("teleportationBorderColor")(teleportationBorderColor.asInstanceOf[js.Any])
    if (teleportationFillColor != null) __obj.updateDynamic("teleportationFillColor")(teleportationFillColor.asInstanceOf[js.Any])
    if (torusArrowMaterial != null) __obj.updateDynamic("torusArrowMaterial")(torusArrowMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisableAnimation]
  }
}

