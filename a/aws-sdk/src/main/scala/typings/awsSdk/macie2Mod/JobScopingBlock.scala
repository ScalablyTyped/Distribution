package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobScopingBlock extends js.Object {
  /**
    * Reserved for future use.
    */
  var and: js.UndefOr[listOfJobScopeTerm] = js.native
}

object JobScopingBlock {
  @scala.inline
  def apply(and: listOfJobScopeTerm = null): JobScopingBlock = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(and.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobScopingBlock]
  }
}

