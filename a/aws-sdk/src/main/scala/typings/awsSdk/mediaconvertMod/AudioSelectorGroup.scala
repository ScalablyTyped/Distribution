package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSelectorGroup extends js.Object {
  /**
    * Name of an Audio Selector within the same input to include in the group.  Audio selector names are standardized, based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be repeated to add any number of audio selectors to the group.
    */
  var AudioSelectorNames: js.UndefOr[listOfStringMin1] = js.native
}

object AudioSelectorGroup {
  @scala.inline
  def apply(AudioSelectorNames: listOfStringMin1 = null): AudioSelectorGroup = {
    val __obj = js.Dynamic.literal()
    if (AudioSelectorNames != null) __obj.updateDynamic("AudioSelectorNames")(AudioSelectorNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSelectorGroup]
  }
}

