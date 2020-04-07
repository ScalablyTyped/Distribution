package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoTextureSettings extends js.Object {
  /**
    * Applies `autoplay` to video, if specified
    */
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically updates internal texture from video at every frame in the render loop
    */
  var autoUpdateTexture: Boolean
  /**
    * Applies `loop` to video, if specified
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * Image src displayed during the video loading or until the user interacts with the video.
    */
  var poster: js.UndefOr[String] = js.undefined
}

object VideoTextureSettings {
  @scala.inline
  def apply(
    autoUpdateTexture: Boolean,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    poster: String = null
  ): VideoTextureSettings = {
    val __obj = js.Dynamic.literal(autoUpdateTexture = autoUpdateTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTextureSettings]
  }
}

