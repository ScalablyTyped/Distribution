package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransitLine extends js.Object {
  /** The short name for the transit line. */
  var abbreviatedName: java.lang.String
  /** The ID of the agency that owns the transit line. */
  var agencyId: scala.Double
  /** The name of the agency that owns the transit line. */
  var agencyName: java.lang.String
  /** The URL of the website of the agency that owns the transit line. */
  var agencyUrl: java.lang.String
  /** Phone number for the transit agency. */
  var phoneNumber: java.lang.String
  /** Information about the provider of this transit line data. */
  var providerInfo: java.lang.String
  /** The uri for the transit agencies website. */
  var uri: java.lang.String
  /** The full name of this transit line. */
  var verboseName: java.lang.String
}

object ITransitLine {
  @scala.inline
  def apply(
    abbreviatedName: java.lang.String,
    agencyId: scala.Double,
    agencyName: java.lang.String,
    agencyUrl: java.lang.String,
    phoneNumber: java.lang.String,
    providerInfo: java.lang.String,
    uri: java.lang.String,
    verboseName: java.lang.String
  ): ITransitLine = {
    val __obj = js.Dynamic.literal(abbreviatedName = abbreviatedName, agencyId = agencyId, agencyName = agencyName, agencyUrl = agencyUrl, phoneNumber = phoneNumber, providerInfo = providerInfo, uri = uri, verboseName = verboseName)
  
    __obj.asInstanceOf[ITransitLine]
  }
}

