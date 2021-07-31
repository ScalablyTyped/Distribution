package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestVertexNormals extends StObject {
  
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
}
object RequestVertexNormals {
  
  @scala.inline
  def apply(): RequestVertexNormals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestVertexNormals]
  }
  
  @scala.inline
  implicit class RequestVertexNormalsMutableBuilder[Self <: RequestVertexNormals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestVertexNormals(value: Boolean): Self = StObject.set(x, "requestVertexNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestVertexNormalsUndefined: Self = StObject.set(x, "requestVertexNormals", js.undefined)
    
    @scala.inline
    def setRequestWaterMask(value: Boolean): Self = StObject.set(x, "requestWaterMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestWaterMaskUndefined: Self = StObject.set(x, "requestWaterMask", js.undefined)
  }
}
