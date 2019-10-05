package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransitLine extends js.Object {
  /** The short name for the transit line. */
  var abbreviatedName: String
  /** The ID of the agency that owns the transit line. */
  var agencyId: Double
  /** The name of the agency that owns the transit line. */
  var agencyName: String
  /** The URL of the website of the agency that owns the transit line. */
  var agencyUrl: String
  /** Phone number for the transit agency. */
  var phoneNumber: String
  /** Information about the provider of this transit line data. */
  var providerInfo: String
  /** The uri for the transit agencies website. */
  var uri: String
  /** The full name of this transit line. */
  var verboseName: String
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
    val __obj = js.Dynamic.literal(abbreviatedName = abbreviatedName, agencyId = agencyId, agencyName = agencyName, agencyUrl = agencyUrl, phoneNumber = phoneNumber, providerInfo = providerInfo, uri = uri, verboseName = verboseName)
  
    __obj.asInstanceOf[ITransitLine]
  }
}

