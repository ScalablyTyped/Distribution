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
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailablePortSpeedsVarargs(value: PortSpeed*): Self = this.set("availablePortSpeeds", js.Array(value :_*))
    @scala.inline
    def setAvailablePortSpeeds(value: AvailablePortSpeeds): Self = this.set("availablePortSpeeds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailablePortSpeeds: Self = this.set("availablePortSpeeds", js.undefined)
    @scala.inline
    def setAvailableProvidersVarargs(value: ProviderName*): Self = this.set("availableProviders", js.Array(value :_*))
    @scala.inline
    def setAvailableProviders(value: ProviderList): Self = this.set("availableProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableProviders: Self = this.set("availableProviders", js.undefined)
    @scala.inline
    def setLocationCode(value: LocationCode): Self = this.set("locationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationCode: Self = this.set("locationCode", js.undefined)
    @scala.inline
    def setLocationName(value: LocationName): Self = this.set("locationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

