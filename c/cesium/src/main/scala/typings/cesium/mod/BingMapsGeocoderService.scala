package typings.cesium.mod

import typings.cesium.anon.Culture
import typings.cesium.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BingMapsGeocoderService")
@js.native
open class BingMapsGeocoderService protected () extends StObject {
  def this(options: Culture) = this()
  
  /**
    * @param query - The query to be sent to the geocoder service
    */
  def geocode(query: String): js.Promise[js.Array[Result]] = js.native
  
  /**
    * The key for the Bing geocoder service
    */
  val key: String = js.native
  
  /**
    * The URL endpoint for the Bing geocoder service
    */
  val url: String = js.native
}
