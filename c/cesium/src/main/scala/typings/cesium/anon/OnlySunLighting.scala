package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlySunLighting extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var onlySunLighting: js.UndefOr[Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var textureUrl: js.UndefOr[String] = js.undefined
}
object OnlySunLighting {
  
  @scala.inline
  def apply(): OnlySunLighting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlySunLighting]
  }
  
  @scala.inline
  implicit class OnlySunLightingMutableBuilder[Self <: OnlySunLighting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setOnlySunLighting(value: Boolean): Self = StObject.set(x, "onlySunLighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlySunLightingUndefined: Self = StObject.set(x, "onlySunLighting", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTextureUrl(value: String): Self = StObject.set(x, "textureUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureUrlUndefined: Self = StObject.set(x, "textureUrl", js.undefined)
  }
}
