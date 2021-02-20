package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableCheckIfAllPixelsAreTransparent extends StObject {
  
  var disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.native
  
  var missingImageUrl: Resource | String = js.native
  
  var pixelsToCheck: js.Array[Cartesian2] = js.native
}
object DisableCheckIfAllPixelsAreTransparent {
  
  @scala.inline
  def apply(missingImageUrl: Resource | String, pixelsToCheck: js.Array[Cartesian2]): DisableCheckIfAllPixelsAreTransparent = {
    val __obj = js.Dynamic.literal(missingImageUrl = missingImageUrl.asInstanceOf[js.Any], pixelsToCheck = pixelsToCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableCheckIfAllPixelsAreTransparent]
  }
  
  @scala.inline
  implicit class DisableCheckIfAllPixelsAreTransparentMutableBuilder[Self <: DisableCheckIfAllPixelsAreTransparent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableCheckIfAllPixelsAreTransparent(value: Boolean): Self = StObject.set(x, "disableCheckIfAllPixelsAreTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCheckIfAllPixelsAreTransparentUndefined: Self = StObject.set(x, "disableCheckIfAllPixelsAreTransparent", js.undefined)
    
    @scala.inline
    def setMissingImageUrl(value: Resource | String): Self = StObject.set(x, "missingImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsToCheck(value: js.Array[Cartesian2]): Self = StObject.set(x, "pixelsToCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsToCheckVarargs(value: Cartesian2*): Self = StObject.set(x, "pixelsToCheck", js.Array(value :_*))
  }
}
