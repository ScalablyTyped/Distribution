package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAddress extends js.Object {
  /**
          * The street line of an address. The addressLine property is the most precise, official line for an address relative to the postal agency
          * servicing the area specified by the locality or postalCode properties.
          */
  var addressLine: java.lang.String
  /**
          * The subdivision name within the country or region for an address. This element is also commonly treated as the first order administrative
          * subdivision. An example is a US state, such as “Oregon”.
          */
  var adminDistrict: java.lang.String
  /** The country or region name of the address. */
  var countryRegion: java.lang.String
  /** A string specifying the two-letter ISO country code. */
  var countryRegionISO2: java.lang.String
  /** The second, third, or fourth order subdivision within a country, dependency, or region. An example is a US county, such as “King”. */
  var district: java.lang.String
  /** A nicely formatted address string for the result. */
  var formattedAddress: java.lang.String
  /** The locality, such as the primary city, that corresponds to an address. An example is “Seattle”. */
  var locality: java.lang.String
  /** The post code, postal code, or ZIP code of an address. An example is a US ZIP code, such as “98152”. */
  var postalCode: java.lang.String
}

