package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoDataPrimitive extends js.Object {
  /** The number of vertex points used to define the polygon. */
  var NumPoints: java.lang.String
  /** A unique ID associated with this polygon primitive. */
  var PrimitiveID: java.lang.String
  /**
    * A comma-delimited sequence starting with the version number of the polygon set followed by a list of compressed polygon
    * "rings" (closed paths represented by sequences of latitude and-longitude points).
    */
  var Shape: java.lang.String
  /**
    * An ID identifying the data provider that supplied the data. This ID number will reference one of the sources listed in the
    * array of CopyrightSources in the Copyright property of the GeoDataResultSet object.
    */
  var SourceID: java.lang.String
}

