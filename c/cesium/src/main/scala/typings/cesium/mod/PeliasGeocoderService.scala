package typings.cesium.mod

import typings.cesium.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PeliasGeocoderService")
@js.native
open class PeliasGeocoderService protected () extends StObject {
  def this(url: String) = this()
  def this(url: Resource) = this()
  
  /**
    * Gets the credit to display after a geocode is performed. Typically this is used to credit
    * the geocoder service.
    */
  val credit: js.UndefOr[Credit] = js.native
  
  /**
    * @param query - The query to be sent to the geocoder service
    * @param [type = GeocodeType.SEARCH] - The type of geocode to perform.
    */
  def geocode(query: String): js.Promise[js.Array[Result]] = js.native
  def geocode(query: String, `type`: GeocodeType): js.Promise[js.Array[Result]] = js.native
  
  /**
    * The Resource used to access the Pelias endpoint.
    */
  val url: Resource = js.native
}
