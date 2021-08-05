package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxImageryProviderOptions
  extends StObject
     with MapboxProviderCommonOptions {
  
  /**
    * The public access token for the imagery
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the image request
    * @default 'png'
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The Mapbox Map ID
    */
  var mapId: String
  
  /**
    * The Mapbox server url
    * @default 'https://api.mapbox.com/v4/'
    */
  var url: js.UndefOr[String] = js.undefined
}
object MapboxImageryProviderOptions {
  
  inline def apply(mapId: String): MapboxImageryProviderOptions = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxImageryProviderOptions]
  }
  
  extension [Self <: MapboxImageryProviderOptions](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
