package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomaticInputFailoverSettings extends js.Object {
  /**
    * Input preference when deciding which input to make active when a previously failed input has recovered.
    */
  var InputPreference: js.UndefOr[typings.awsSdk.medialiveMod.InputPreference] = js.native
  /**
    * The input ID of the secondary input in the automatic input failover pair.
    */
  var SecondaryInputId: string = js.native
}

object AutomaticInputFailoverSettings {
  @scala.inline
  def apply(SecondaryInputId: string): AutomaticInputFailoverSettings = {
    val __obj = js.Dynamic.literal(SecondaryInputId = SecondaryInputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticInputFailoverSettings]
  }
  @scala.inline
  implicit class AutomaticInputFailoverSettingsOps[Self <: AutomaticInputFailoverSettings] (val x: Self) extends AnyVal {
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
    def setSecondaryInputId(value: string): Self = this.set("SecondaryInputId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputPreference(value: InputPreference): Self = this.set("InputPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPreference: Self = this.set("InputPreference", js.undefined)
  }
  
}

