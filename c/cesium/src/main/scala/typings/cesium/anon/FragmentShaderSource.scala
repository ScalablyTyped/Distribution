package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentShaderSource extends StObject {
  
  var fragmentShaderSource: js.UndefOr[String] = js.native
  
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.native
  
  var translucent: js.UndefOr[Boolean] = js.native
  
  var vertexShaderSource: js.UndefOr[String] = js.native
}
object FragmentShaderSource {
  
  @scala.inline
  def apply(): FragmentShaderSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentShaderSource]
  }
  
  @scala.inline
  implicit class FragmentShaderSourceMutableBuilder[Self <: FragmentShaderSource] (val x: Self) extends AnyVal {
    
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
