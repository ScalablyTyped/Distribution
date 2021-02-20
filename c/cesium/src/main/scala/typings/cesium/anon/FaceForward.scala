package typings.cesium.anon

import typings.cesium.mod.MaterialAppearance.MaterialSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceForward extends StObject {
  
  var closed: js.UndefOr[Boolean] = js.native
  
  var faceForward: js.UndefOr[Boolean] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var fragmentShaderSource: js.UndefOr[String] = js.native
  
  var material: js.UndefOr[typings.cesium.mod.Material] = js.native
  
  var materialSupport: js.UndefOr[MaterialSupport] = js.native
  
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.native
  
  var translucent: js.UndefOr[Boolean] = js.native
  
  var vertexShaderSource: js.UndefOr[String] = js.native
}
object FaceForward {
  
  @scala.inline
  def apply(): FaceForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceForward]
  }
  
  @scala.inline
  implicit class FaceForwardMutableBuilder[Self <: FaceForward] (val x: Self) extends AnyVal {
    
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
    def setMaterial(value: typings.cesium.mod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialSupport(value: MaterialSupport): Self = StObject.set(x, "materialSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialSupportUndefined: Self = StObject.set(x, "materialSupport", js.undefined)
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
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
