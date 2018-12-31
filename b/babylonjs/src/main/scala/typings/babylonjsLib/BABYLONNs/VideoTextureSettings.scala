package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for finer control over video usage
  */
trait VideoTextureSettings extends js.Object {
  /**
    * Applies `autoplay` to video, if specified
    */
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically updates internal texture from video at every frame in the render loop
    */
  var autoUpdateTexture: scala.Boolean
  /**
    * Applies `loop` to video, if specified
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Image src displayed during the video loading or until the user interacts with the video.
    */
  var poster: js.UndefOr[java.lang.String] = js.undefined
}

