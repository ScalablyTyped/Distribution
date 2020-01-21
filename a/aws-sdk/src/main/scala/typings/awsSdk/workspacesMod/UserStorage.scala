package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStorage extends js.Object {
  /**
    * The size of the user storage.
    */
  var Capacity: js.UndefOr[NonEmptyString] = js.native
}

object UserStorage {
  @scala.inline
  def apply(Capacity: NonEmptyString = null): UserStorage = {
    val __obj = js.Dynamic.literal()
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStorage]
  }
}

