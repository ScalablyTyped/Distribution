package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  /**
    * The date and time that the site was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The description of the site.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The location of the site.
    */
  var Location: js.UndefOr[typings.awsSdk.networkmanagerMod.Location] = js.native
  /**
    * The Amazon Resource Name (ARN) of the site.
    */
  var SiteArn: js.UndefOr[String] = js.native
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
  /**
    * The state of the site.
    */
  var State: js.UndefOr[SiteState] = js.native
  /**
    * The tags for the site.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Site {
  @scala.inline
  def apply(
    CreatedAt: DateTime = null,
    Description: String = null,
    GlobalNetworkId: String = null,
    Location: Location = null,
    SiteArn: String = null,
    SiteId: String = null,
    State: SiteState = null,
    Tags: TagList = null
  ): Site = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlobalNetworkId != null) __obj.updateDynamic("GlobalNetworkId")(GlobalNetworkId.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (SiteArn != null) __obj.updateDynamic("SiteArn")(SiteArn.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
}

