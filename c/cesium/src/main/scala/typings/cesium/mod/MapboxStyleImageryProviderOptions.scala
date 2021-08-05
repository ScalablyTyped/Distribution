package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxStyleImageryProviderOptions
  extends StObject
     with MapboxProviderCommonOptions {
  
  /**
    * The public access token for the imagery.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if tiles are rendered at a @2x scale factor
    */
  var scaleFactor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Mapbox Style ID.
    */
  var styleId: String
  
  /**
    * The size of the image tiles
    * @default 512
    */
  var tilesize: js.UndefOr[Double] = js.undefined
  
  /**
    * The Mapbox server url
    * @default 'https://api.mapbox.com/styles/v1/'
    */
  var url: js.UndefOr[Resource | String] = js.undefined
  
  /**
    * The username of the map account.
    * @default 'mapbox'
    */
  var username: js.UndefOr[String] = js.undefined
}
object MapboxStyleImageryProviderOptions {
  
  inline def apply(styleId: String): MapboxStyleImageryProviderOptions = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxStyleImageryProviderOptions]
  }
  
  extension [Self <: MapboxStyleImageryProviderOptions](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setScaleFactor(value: Boolean): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    inline def setTilesize(value: Double): Self = StObject.set(x, "tilesize", value.asInstanceOf[js.Any])
    
    inline def setTilesizeUndefined: Self = StObject.set(x, "tilesize", js.undefined)
    
    inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
