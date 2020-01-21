package typings.azureArmResource.subscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * The display name of the location.
    */
  val displayName: js.UndefOr[String] = js.undefined
  /**
    * The fully qualified ID of the location. For example,
    * /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The latitude of the location.
    */
  val latitude: js.UndefOr[String] = js.undefined
  /**
    * The longitude of the location.
    */
  val longitude: js.UndefOr[String] = js.undefined
  /**
    * The location name.
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * The subscription ID.
    */
  val subscriptionId: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    displayName: String = null,
    id: String = null,
    latitude: String = null,
    longitude: String = null,
    name: String = null,
    subscriptionId: String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subscriptionId != null) __obj.updateDynamic("subscriptionId")(subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

