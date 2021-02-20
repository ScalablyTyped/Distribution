package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flat extends StObject {
  
  var closed: js.UndefOr[Boolean] = js.native
  
  var faceForward: js.UndefOr[Boolean] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var fragmentShaderSource: js.UndefOr[String] = js.native
  
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.native
  
  var translucent: js.UndefOr[Boolean] = js.native
  
  var vertexShaderSource: js.UndefOr[String] = js.native
}
object Flat {
  
  @scala.inline
  def apply(): Flat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flat]
  }
  
  @scala.inline
  implicit class FlatMutableBuilder[Self <: Flat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setFaceForward(value: Boolean): Self = StObject.set(x, "faceForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceForwardUndefined: Self = StObject.set(x, "faceForward", js.undefined)
    
    @scala.inline
    def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    @scala.inline
    def setFragmentShaderSource(value: String): Self = StObject.set(x, "fragmentShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentShaderSourceUndefined: Self = StObject.set(x, "fragmentShaderSource", js.undefined)
    
    @scala.inline
    def setRenderState(value: typings.cesium.mod.RenderState): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderStateUndefined: Self = StObject.set(x, "renderState", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    @scala.inline
    def setVertexShaderSource(value: String): Self = StObject.set(x, "vertexShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexShaderSourceUndefined: Self = StObject.set(x, "vertexShaderSource", js.undefined)
  }
}
