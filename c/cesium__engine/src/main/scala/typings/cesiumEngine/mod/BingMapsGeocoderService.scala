package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Culture
import typings.cesiumEngine.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "BingMapsGeocoderService")
@js.native
open class BingMapsGeocoderService protected () extends StObject {
  def this(options: Culture) = this()
  
  /**
    * Gets the credit to display after a geocode is performed. Typically this is used to credit
    * the geocoder service.
    */
  val credit: js.UndefOr[Credit] = js.native
  
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
