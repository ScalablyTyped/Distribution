package typings.bingmaps.global.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.PointCompression")
@js.native
class PointCompression ()
  extends typings.bingmaps.Microsoft.Maps.PointCompression
/* static members */
@JSGlobal("Microsoft.Maps.PointCompression")
@js.native
object PointCompression extends js.Object {
  
  /**
    * Decodes a collection of locations from a compressed string.
    * @param value Compressed string to decode.
    * @returns An array of locations that have been decoded from the compressed string. 
    */
  def decode(value: String): js.Array[typings.bingmaps.Microsoft.Maps.Location] = js.native
  
  /**
    * Compresses an array of locations into a string.
    * @param locations Collection of coordinates to compress.
    * @returns A compressed string representing an array of locations.
    */
  def encode(locations: js.Array[typings.bingmaps.Microsoft.Maps.Location]): String = js.native
}
