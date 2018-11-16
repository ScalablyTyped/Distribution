package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISuggestionResult extends js.Object {
  /** A structured address object for the result.  */
  var address: IAddress
  /** A LocationRect that can be used to set the map view over the result. */
  var bestView: LocationRect
  /** Unique entity id to be used for searching the entity. */
  var entityId: java.lang.String
  /** The sub type of result; Address, RoadBlock, PopulatedPlace, CountryRegion, etc. */
  var entitySubType: java.lang.String
  /** The type of the result; Address, Place */
  var entityType: java.lang.String
  /** A nicely formatted suggestion string for the result based on market. */
  var formattedSuggestion: java.lang.String
  /**
          * The coordinate of the result. This value is only returned for place (city, landmarks) results and not for addresses.
          * Street addresses will need to be geocoded to get their location.
          */
  var location: Location
  /** A secondary title that provides additional context to the title value of the suggestion. **/
  var subtitle: java.lang.String
  /** The display title for the result (i.e. “Redmond”). */
  var title: java.lang.String
}

