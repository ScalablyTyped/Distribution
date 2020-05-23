package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSelectorSettings extends js.Object {
  var AudioLanguageSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioLanguageSelection] = js.native
  var AudioPidSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioPidSelection] = js.native
  var AudioTrackSelection: js.UndefOr[typings.awsSdk.medialiveMod.AudioTrackSelection] = js.native
}

object AudioSelectorSettings {
  @scala.inline
  def apply(
    AudioLanguageSelection: AudioLanguageSelection = null,
    AudioPidSelection: AudioPidSelection = null,
    AudioTrackSelection: AudioTrackSelection = null
  ): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioLanguageSelection != null) __obj.updateDynamic("AudioLanguageSelection")(AudioLanguageSelection.asInstanceOf[js.Any])
    if (AudioPidSelection != null) __obj.updateDynamic("AudioPidSelection")(AudioPidSelection.asInstanceOf[js.Any])
    if (AudioTrackSelection != null) __obj.updateDynamic("AudioTrackSelection")(AudioTrackSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSelectorSettings]
  }
}

