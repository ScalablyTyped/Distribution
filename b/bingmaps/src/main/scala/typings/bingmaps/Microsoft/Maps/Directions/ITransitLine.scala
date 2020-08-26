package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransitLine extends js.Object {
  /** The short name for the transit line. */
  var abbreviatedName: String = js.native
  /** The ID of the agency that owns the transit line. */
  var agencyId: Double = js.native
  /** The name of the agency that owns the transit line. */
  var agencyName: String = js.native
  /** The URL of the website of the agency that owns the transit line. */
  var agencyUrl: String = js.native
  /** Phone number for the transit agency. */
  var phoneNumber: String = js.native
  /** Information about the provider of this transit line data. */
  var providerInfo: String = js.native
  /** The uri for the transit agencies website. */
  var uri: String = js.native
  /** The full name of this transit line. */
  var verboseName: String = js.native
}

object ITransitLine {
  @scala.inline
  def apply(
    abbreviatedName: String,
    agencyId: Double,
    agencyName: String,
    agencyUrl: String,
    phoneNumber: String,
    providerInfo: String,
    uri: String,
    verboseName: String
  ): ITransitLine = {
    val __obj = js.Dynamic.literal(abbreviatedName = abbreviatedName.asInstanceOf[js.Any], agencyId = agencyId.asInstanceOf[js.Any], agencyName = agencyName.asInstanceOf[js.Any], agencyUrl = agencyUrl.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], providerInfo = providerInfo.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], verboseName = verboseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransitLine]
  }
  @scala.inline
  implicit class ITransitLineOps[Self <: ITransitLine] (val x: Self) extends AnyVal {
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
    def setAbbreviatedName(value: String): Self = this.set("abbreviatedName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgencyId(value: Double): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgencyName(value: String): Self = this.set("agencyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgencyUrl(value: String): Self = this.set("agencyUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderInfo(value: String): Self = this.set("providerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerboseName(value: String): Self = this.set("verboseName", value.asInstanceOf[js.Any])
  }
  
}

