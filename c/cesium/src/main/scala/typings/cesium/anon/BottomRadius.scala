package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomRadius extends StObject {
  
  var bottomRadius: Double
  
  var length: Double
  
  var slices: js.UndefOr[Double] = js.undefined
  
  var topRadius: Double
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}
object BottomRadius {
  
  @scala.inline
  def apply(bottomRadius: Double, length: Double, topRadius: Double): BottomRadius = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRadius]
  }
  
  @scala.inline
  implicit class BottomRadiusMutableBuilder[Self <: BottomRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomRadius(value: Double): Self = StObject.set(x, "bottomRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    @scala.inline
    def setTopRadius(value: Double): Self = StObject.set(x, "topRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
