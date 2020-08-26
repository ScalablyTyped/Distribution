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
  def apply(): AudioSelectorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorGroup]
  }
  @scala.inline
  implicit class AudioSelectorGroupOps[Self <: AudioSelectorGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioSelectorNamesVarargs(value: stringMin1*): Self = this.set("AudioSelectorNames", js.Array(value :_*))
    @scala.inline
    def setAudioSelectorNames(value: listOfStringMin1): Self = this.set("AudioSelectorNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioSelectorNames: Self = this.set("AudioSelectorNames", js.undefined)
  }
  
}

