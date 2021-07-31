package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var slicePartitions: js.UndefOr[Double] = js.undefined
  
  var stackPartitions: js.UndefOr[Double] = js.undefined
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}
object Radius {
  
  @scala.inline
  def apply(): Radius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit class RadiusMutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSlicePartitions(value: Double): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
    
    @scala.inline
    def setStackPartitions(value: Double): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
