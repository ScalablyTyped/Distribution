package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnarchiveFindingsRequest extends js.Object {
  /**
    * An array of strings that lists the unique identifiers for the findings to reactivate.
    */
  var findingIds: listOfString = js.native
}

object UnarchiveFindingsRequest {
  @scala.inline
  def apply(findingIds: listOfString): UnarchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(findingIds = findingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnarchiveFindingsRequest]
  }
}

