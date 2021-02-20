package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipsoid extends StObject {
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.native
  
  var requestVertexNormals: js.UndefOr[Boolean] = js.native
  
  var requestWaterMask: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
}
object Ellipsoid {
  
  @scala.inline
  def apply(url: String): Ellipsoid = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipsoid]
  }
  
  @scala.inline
  implicit class EllipsoidMutableBuilder[Self <: Ellipsoid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setProxy(value: typings.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRequestVertexNormals(value: Boolean): Self = StObject.set(x, "requestVertexNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestVertexNormalsUndefined: Self = StObject.set(x, "requestVertexNormals", js.undefined)
    
    @scala.inline
    def setRequestWaterMask(value: Boolean): Self = StObject.set(x, "requestWaterMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestWaterMaskUndefined: Self = StObject.set(x, "requestWaterMask", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
