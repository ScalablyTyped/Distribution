package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSelectorSettings extends js.Object {
  var AudioLanguageSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioLanguageSelection] = js.native
  var AudioPidSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioPidSelection] = js.native
}

object AudioSelectorSettings {
  @scala.inline
  def apply(AudioLanguageSelection: AudioLanguageSelection = null, AudioPidSelection: AudioPidSelection = null): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioLanguageSelection != null) __obj.updateDynamic("AudioLanguageSelection")(AudioLanguageSelection.asInstanceOf[js.Any])
    if (AudioPidSelection != null) __obj.updateDynamic("AudioPidSelection")(AudioPidSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSelectorSettings]
  }
}

