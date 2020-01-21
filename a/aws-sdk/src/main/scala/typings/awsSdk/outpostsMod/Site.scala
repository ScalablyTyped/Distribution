package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  var AccountId: js.UndefOr[typings.awsSdk.outpostsMod.AccountId] = js.native
  var Description: js.UndefOr[SiteDescription] = js.native
  var Name: js.UndefOr[SiteName] = js.native
  var SiteId: js.UndefOr[typings.awsSdk.outpostsMod.SiteId] = js.native
}

object Site {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    Description: SiteDescription = null,
    Name: SiteName = null,
    SiteId: SiteId = null
  ): Site = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
}

