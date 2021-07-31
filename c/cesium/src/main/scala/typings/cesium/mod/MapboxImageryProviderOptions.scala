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
  
  @scala.inline
  def apply(mapId: String): MapboxImageryProviderOptions = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxImageryProviderOptions]
  }
  
  @scala.inline
  implicit class MapboxImageryProviderOptionsMutableBuilder[Self <: MapboxImageryProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
