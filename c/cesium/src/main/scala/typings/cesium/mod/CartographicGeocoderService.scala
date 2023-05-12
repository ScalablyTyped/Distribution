package typings.cesium.mod

import typings.cesium.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CartographicGeocoderService")
@js.native
open class CartographicGeocoderService () extends StObject {
  
  /**
    * Gets the credit to display after a geocode is performed. Typically this is used to credit
    * the geocoder service.
    */
  val credit: js.UndefOr[Credit] = js.native
  
  /**
    * @param query - The query to be sent to the geocoder service
    */
  def geocode(query: String): js.Promise[js.Array[Result]] = js.native
}
