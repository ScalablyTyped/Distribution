package typings.cesium.anon

import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credit extends StObject {
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var requestMetadata: js.UndefOr[Boolean] = js.undefined
  
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
  
  var url: Resource | String | (js.Promise[Resource | String])
}
object Credit {
  
  inline def apply(url: Resource | String | (js.Promise[Resource | String])): Credit = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credit]
  }
  
  extension [Self <: Credit](x: Self) {
    
    inline def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setRequestMetadata(value: Boolean): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    inline def setRequestVertexNormals(value: Boolean): Self = StObject.set(x, "requestVertexNormals", value.asInstanceOf[js.Any])
    
    inline def setRequestVertexNormalsUndefined: Self = StObject.set(x, "requestVertexNormals", js.undefined)
    
    inline def setRequestWaterMask(value: Boolean): Self = StObject.set(x, "requestWaterMask", value.asInstanceOf[js.Any])
    
    inline def setRequestWaterMaskUndefined: Self = StObject.set(x, "requestWaterMask", js.undefined)
    
    inline def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
