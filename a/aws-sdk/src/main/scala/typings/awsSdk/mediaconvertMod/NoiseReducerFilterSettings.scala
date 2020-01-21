package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerFilterSettings extends js.Object {
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[integerMin0Max3] = js.native
}

object NoiseReducerFilterSettings {
  @scala.inline
  def apply(Strength: Int | Double = null): NoiseReducerFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (Strength != null) __obj.updateDynamic("Strength")(Strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseReducerFilterSettings]
  }
}

