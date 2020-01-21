package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * The available port speeds for the location.
    */
  var availablePortSpeeds: js.UndefOr[AvailablePortSpeeds] = js.native
  /**
    * The name of the service provider for the location.
    */
  var availableProviders: js.UndefOr[ProviderList] = js.native
  /**
    * The code for the location.
    */
  var locationCode: js.UndefOr[LocationCode] = js.native
  /**
    * The name of the location. This includes the name of the colocation partner and the physical site of the building.
    */
  var locationName: js.UndefOr[LocationName] = js.native
  /**
    * The AWS Region for the location.
    */
  var region: js.UndefOr[Region] = js.native
}

object Location {
  @scala.inline
  def apply(
    availablePortSpeeds: AvailablePortSpeeds = null,
    availableProviders: ProviderList = null,
    locationCode: LocationCode = null,
    locationName: LocationName = null,
    region: Region = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (availablePortSpeeds != null) __obj.updateDynamic("availablePortSpeeds")(availablePortSpeeds.asInstanceOf[js.Any])
    if (availableProviders != null) __obj.updateDynamic("availableProviders")(availableProviders.asInstanceOf[js.Any])
    if (locationCode != null) __obj.updateDynamic("locationCode")(locationCode.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

