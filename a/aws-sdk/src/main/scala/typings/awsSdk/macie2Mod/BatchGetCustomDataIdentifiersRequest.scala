package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCustomDataIdentifiersRequest extends js.Object {
  /**
    * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information about.
    */
  var ids: js.UndefOr[listOfString] = js.native
}

object BatchGetCustomDataIdentifiersRequest {
  @scala.inline
  def apply(ids: listOfString = null): BatchGetCustomDataIdentifiersRequest = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCustomDataIdentifiersRequest]
  }
}

