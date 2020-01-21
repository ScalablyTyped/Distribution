package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioLanguageSelection extends js.Object {
  /**
    * Selects a specific three-letter language code from within an audio source.
    */
  var LanguageCode: string = js.native
  /**
    * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can't find one with the same language.
    */
  var LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy] = js.native
}

object AudioLanguageSelection {
  @scala.inline
  def apply(LanguageCode: string, LanguageSelectionPolicy: AudioLanguageSelectionPolicy = null): AudioLanguageSelection = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    if (LanguageSelectionPolicy != null) __obj.updateDynamic("LanguageSelectionPolicy")(LanguageSelectionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioLanguageSelection]
  }
}

