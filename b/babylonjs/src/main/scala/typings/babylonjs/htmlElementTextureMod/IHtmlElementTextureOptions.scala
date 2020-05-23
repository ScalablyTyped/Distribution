package typings.babylonjs.htmlElementTextureMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlElementTextureOptions extends js.Object {
  /**
    * Defines the engine instance to use the texture with. It is not mandatory if you define a scene.
    */
  var engine: Nullable[ThinEngine]
  /**
    * Defines wether mip maps should be created or not.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the sampling mode of the texture.
    */
  var samplingMode: js.UndefOr[Double] = js.undefined
  /**
    * Defines the scene the texture belongs to. It is not mandatory if you define an engine.
    */
  var scene: Nullable[Scene]
}

object IHtmlElementTextureOptions {
  @scala.inline
  def apply(
    engine: Nullable[ThinEngine] = null,
    generateMipMaps: js.UndefOr[Boolean] = js.undefined,
    samplingMode: js.UndefOr[Double] = js.undefined,
    scene: Nullable[Scene] = null
  ): IHtmlElementTextureOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipMaps)) __obj.updateDynamic("generateMipMaps")(generateMipMaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingMode)) __obj.updateDynamic("samplingMode")(samplingMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHtmlElementTextureOptions]
  }
}

