package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumCorner extends StObject {
  
  var maximumCorner: Cartesian3 = js.native
  
  var minimumCorner: Cartesian3 = js.native
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}
object MaximumCorner {
  
  @scala.inline
  def apply(maximumCorner: Cartesian3, minimumCorner: Cartesian3): MaximumCorner = {
    val __obj = js.Dynamic.literal(maximumCorner = maximumCorner.asInstanceOf[js.Any], minimumCorner = minimumCorner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumCorner]
  }
  
  @scala.inline
  implicit class MaximumCornerMutableBuilder[Self <: MaximumCorner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumCorner(value: Cartesian3): Self = StObject.set(x, "maximumCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCorner(value: Cartesian3): Self = StObject.set(x, "minimumCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
