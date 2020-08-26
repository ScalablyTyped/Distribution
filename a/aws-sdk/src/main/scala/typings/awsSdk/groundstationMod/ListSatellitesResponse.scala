package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSatellitesResponse extends js.Object {
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * List of satellites.
    */
  var satellites: js.UndefOr[SatelliteList] = js.native
}

object ListSatellitesResponse {
  @scala.inline
  def apply(): ListSatellitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSatellitesResponse]
  }
  @scala.inline
  implicit class ListSatellitesResponseOps[Self <: ListSatellitesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSatellitesVarargs(value: SatelliteListItem*): Self = this.set("satellites", js.Array(value :_*))
    @scala.inline
    def setSatellites(value: SatelliteList): Self = this.set("satellites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSatellites: Self = this.set("satellites", js.undefined)
  }
  
}

