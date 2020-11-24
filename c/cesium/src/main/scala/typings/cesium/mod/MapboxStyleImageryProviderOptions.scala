package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxStyleImageryProviderOptions extends MapboxProviderCommonOptions {
  
  /**
    * The public access token for the imagery.
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * Determines if tiles are rendered at a @2x scale factor
    */
  var scaleFactor: js.UndefOr[Boolean] = js.native
  
  /**
    * The Mapbox Style ID.
    */
  var styleId: String = js.native
  
  /**
    * The size of the image tiles
    * @default 512
    */
  var tilesize: js.UndefOr[Double] = js.native
  
  /**
    * The Mapbox server url
    * @default 'https://api.mapbox.com/styles/v1/'
    */
  var url: js.UndefOr[Resource | String] = js.native
  
  /**
    * The username of the map account.
    * @default 'mapbox'
    */
  var username: js.UndefOr[String] = js.native
}
object MapboxStyleImageryProviderOptions {
  
  @scala.inline
  def apply(styleId: String): MapboxStyleImageryProviderOptions = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxStyleImageryProviderOptions]
  }
  
  @scala.inline
  implicit class MapboxStyleImageryProviderOptionsOps[Self <: MapboxStyleImageryProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Boolean): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    
    @scala.inline
    def setTilesize(value: Double): Self = this.set("tilesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilesize: Self = this.set("tilesize", js.undefined)
    
    @scala.inline
    def setUrl(value: Resource | String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
