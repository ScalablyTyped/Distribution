package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSelector extends js.Object {
  /**
    * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.  Selector names should be unique per input.
    */
  var Name: stringMin1 = js.native
  /**
    * The audio selector settings.
    */
  var SelectorSettings: js.UndefOr[AudioSelectorSettings] = js.native
}

object AudioSelector {
  @scala.inline
  def apply(Name: stringMin1, SelectorSettings: AudioSelectorSettings = null): AudioSelector = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (SelectorSettings != null) __obj.updateDynamic("SelectorSettings")(SelectorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSelector]
  }
}

