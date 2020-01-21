package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTriggersResponse extends js.Object {
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * The names of all triggers in the account, or the triggers with the specified tags.
    */
  var TriggerNames: js.UndefOr[TriggerNameList] = js.native
}

object ListTriggersResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, TriggerNames: TriggerNameList = null): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TriggerNames != null) __obj.updateDynamic("TriggerNames")(TriggerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTriggersResponse]
  }
}

