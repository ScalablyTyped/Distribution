package typings.cesium.anon

import typings.cesium.mod.Resource
import typings.cesium.mod.TileDiscardPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  var channel: Double
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var maximumLevel: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  
  var url: Resource | String
}
object Channel {
  
  @scala.inline
  def apply(channel: Double, url: Resource | String): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
    
    @scala.inline
    def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
