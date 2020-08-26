package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationSummary extends js.Object {
  /**
    * The alias associated with the organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.native
  /**
    * The error message associated with the organization. It is only present if unexpected behavior has occurred with regards to the organization. It provides insight or solutions regarding unexpected behavior.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The identifier associated with the organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.workmailMod.OrganizationId] = js.native
  /**
    * The state associated with the organization.
    */
  var State: js.UndefOr[String] = js.native
}

object OrganizationSummary {
  @scala.inline
  def apply(): OrganizationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationSummary]
  }
  @scala.inline
  implicit class OrganizationSummaryOps[Self <: OrganizationSummary] (val x: Self) extends AnyVal {
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
    def setAlias(value: OrganizationName): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("Alias", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

