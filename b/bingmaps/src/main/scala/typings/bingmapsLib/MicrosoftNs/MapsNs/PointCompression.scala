package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.PointCompression")
@js.native
class PointCompression () extends js.Object

@JSGlobal("Microsoft.Maps.PointCompression")
@js.native
object PointCompression extends js.Object {
  /**
          * Decodes a collection of locations from a compressed string.
          * @param value Compressed string to decode.
          * @returns An array of locations that have been decoded from the compressed string. 
          */
  def decode(value: java.lang.String): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  /**
          * Compresses an array of locations into a string.
          * @param locations Collection of coordinates to compress.
          * @returns A compressed string representing an array of locations.
          */
  def encode(locations: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location]): java.lang.String = js.native
}

