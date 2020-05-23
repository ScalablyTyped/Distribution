package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveFindingsRequest extends js.Object {
  /**
    * An array of strings that lists the unique identifiers for the findings to archive.
    */
  var findingIds: listOfString = js.native
}

object ArchiveFindingsRequest {
  @scala.inline
  def apply(findingIds: listOfString): ArchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(findingIds = findingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveFindingsRequest]
  }
}

