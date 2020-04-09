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
  def apply(SecondaryInputId: string, InputPreference: InputPreference = null): AutomaticInputFailoverSettings = {
    val __obj = js.Dynamic.literal(SecondaryInputId = SecondaryInputId.asInstanceOf[js.Any])
    if (InputPreference != null) __obj.updateDynamic("InputPreference")(InputPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticInputFailoverSettings]
  }
}

