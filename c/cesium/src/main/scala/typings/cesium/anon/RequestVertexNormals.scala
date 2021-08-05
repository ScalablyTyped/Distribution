package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestVertexNormals extends StObject {
  
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
}
object RequestVertexNormals {
  
  inline def apply(): RequestVertexNormals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestVertexNormals]
  }
  
  extension [Self <: RequestVertexNormals](x: Self) {
    
    inline def setRequestVertexNormals(value: Boolean): Self = StObject.set(x, "requestVertexNormals", value.asInstanceOf[js.Any])
    
    inline def setRequestVertexNormalsUndefined: Self = StObject.set(x, "requestVertexNormals", js.undefined)
    
    inline def setRequestWaterMask(value: Boolean): Self = StObject.set(x, "requestWaterMask", value.asInstanceOf[js.Any])
    
    inline def setRequestWaterMaskUndefined: Self = StObject.set(x, "requestWaterMask", js.undefined)
  }
}
