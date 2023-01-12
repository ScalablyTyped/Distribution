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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestVertexNormals] (val x: Self) extends AnyVal {
    
    inline def setRequestVertexNormals(value: Boolean): Self = StObject.set(x, "requestVertexNormals", value.asInstanceOf[js.Any])
    
    inline def setRequestVertexNormalsUndefined: Self = StObject.set(x, "requestVertexNormals", js.undefined)
    
    inline def setRequestWaterMask(value: Boolean): Self = StObject.set(x, "requestWaterMask", value.asInstanceOf[js.Any])
    
    inline def setRequestWaterMaskUndefined: Self = StObject.set(x, "requestWaterMask", js.undefined)
  }
}
