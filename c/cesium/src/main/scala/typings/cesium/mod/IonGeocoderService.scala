package typings.cesium.mod

import typings.cesium.anon.AccessToken
import typings.cesium.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "IonGeocoderService")
@js.native
open class IonGeocoderService protected () extends StObject {
  def this(options: AccessToken) = this()
  
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
}
