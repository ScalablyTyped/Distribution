package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMetadata extends js.Object {
  /**
    * The ID of the user group.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[GroupNameType] = js.native
}

object GroupMetadata {
  @scala.inline
  def apply(Id: IdType = null, Name: GroupNameType = null): GroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMetadata]
  }
}

