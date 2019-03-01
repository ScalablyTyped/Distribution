package typings
package cordovaDashPluginDashMediaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  iOS optional parameters for media.play
  *  See https://github.com/apache/cordova-plugin-media#ios-quirks
  */
trait IosPlayOptions extends js.Object {
  var numberOfLoops: js.UndefOr[scala.Double] = js.undefined
  var playAudioWhenScreenIsLocked: js.UndefOr[scala.Boolean] = js.undefined
}

object IosPlayOptions {
  @scala.inline
  def apply(
    numberOfLoops: scala.Int | scala.Double = null,
    playAudioWhenScreenIsLocked: js.UndefOr[scala.Boolean] = js.undefined
  ): IosPlayOptions = {
    val __obj = js.Dynamic.literal()
    if (numberOfLoops != null) __obj.updateDynamic("numberOfLoops")(numberOfLoops.asInstanceOf[js.Any])
    if (!js.isUndefined(playAudioWhenScreenIsLocked)) __obj.updateDynamic("playAudioWhenScreenIsLocked")(playAudioWhenScreenIsLocked)
    __obj.asInstanceOf[IosPlayOptions]
  }
}

