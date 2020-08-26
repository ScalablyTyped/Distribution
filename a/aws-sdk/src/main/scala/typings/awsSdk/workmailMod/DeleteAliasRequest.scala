package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAliasRequest extends js.Object {
  /**
    * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single entries (the list is transformed into a set).
    */
  var Alias: EmailAddress = js.native
  /**
    * The identifier for the member (user or group) from which to have the aliases removed.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the user exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DeleteAliasRequest {
  @scala.inline
  def apply(Alias: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasRequest]
  }
  @scala.inline
  implicit class DeleteAliasRequestOps[Self <: DeleteAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: EmailAddress): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

