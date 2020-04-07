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
    samplingMode: Int | Double = null,
    scene: Nullable[Scene] = null
  ): IHtmlElementTextureOptions = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipMaps)) __obj.updateDynamic("generateMipMaps")(generateMipMaps.asInstanceOf[js.Any])
    if (samplingMode != null) __obj.updateDynamic("samplingMode")(samplingMode.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHtmlElementTextureOptions]
  }
}

