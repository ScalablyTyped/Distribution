package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultRetentionPolicyResponse extends js.Object {
  /**
    * The retention policy description.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The retention policy folder configurations.
    */
  var FolderConfigurations: js.UndefOr[typings.awsSdk.workmailMod.FolderConfigurations] = js.native
  /**
    * The retention policy ID.
    */
  var Id: js.UndefOr[ShortString] = js.native
  /**
    * The retention policy name.
    */
  var Name: js.UndefOr[ShortString] = js.native
}

object GetDefaultRetentionPolicyResponse {
  @scala.inline
  def apply(
    Description: String = null,
    FolderConfigurations: FolderConfigurations = null,
    Id: ShortString = null,
    Name: ShortString = null
  ): GetDefaultRetentionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FolderConfigurations != null) __obj.updateDynamic("FolderConfigurations")(FolderConfigurations.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultRetentionPolicyResponse]
  }
}

