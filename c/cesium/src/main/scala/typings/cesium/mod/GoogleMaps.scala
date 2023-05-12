package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GoogleMaps {
  
  @JSImport("cesium", "GoogleMaps")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets the default Google Maps API key.
    */
  @JSImport("cesium", "GoogleMaps.defaultApiKey")
  @js.native
  def defaultApiKey: String = js.native
  inline def defaultApiKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultApiKey")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the default Google Map Tiles API endpoint.
    */
  @JSImport("cesium", "GoogleMaps.mapTilesApiEndpoint")
  @js.native
  def mapTilesApiEndpoint: String | Resource = js.native
  inline def mapTilesApiEndpoint_=(x: String | Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapTilesApiEndpoint")(x.asInstanceOf[js.Any])
}
