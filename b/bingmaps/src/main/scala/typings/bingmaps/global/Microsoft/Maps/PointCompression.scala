package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.PointCompression")
@js.native
class PointCompression ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.PointCompression
/* static members */
object PointCompression {
  
  @JSGlobal("Microsoft.Maps.PointCompression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decodes a collection of locations from a compressed string.
    * @param value Compressed string to decode.
    * @returns An array of locations that have been decoded from the compressed string. 
    */
  inline def decode(value: String): js.Array[typings.bingmaps.Microsoft.Maps.Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  
  /**
    * Compresses an array of locations into a string.
    * @param locations Collection of coordinates to compress.
    * @returns A compressed string representing an array of locations.
    */
  inline def encode(locations: js.Array[typings.bingmaps.Microsoft.Maps.Location]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(locations.asInstanceOf[js.Any]).asInstanceOf[String]
}
