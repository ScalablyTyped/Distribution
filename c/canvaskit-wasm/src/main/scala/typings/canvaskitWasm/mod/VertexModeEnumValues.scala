package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexModeEnumValues extends EmbindEnum {
  
  var TriangleFan: VertexMode = js.native
  
  var Triangles: VertexMode = js.native
  
  var TrianglesStrip: VertexMode = js.native
}
object VertexModeEnumValues {
  
  @scala.inline
  def apply(
    TriangleFan: VertexMode,
    Triangles: VertexMode,
    TrianglesStrip: VertexMode,
    values: js.Array[Double]
  ): VertexModeEnumValues = {
    val __obj = js.Dynamic.literal(TriangleFan = TriangleFan.asInstanceOf[js.Any], Triangles = Triangles.asInstanceOf[js.Any], TrianglesStrip = TrianglesStrip.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexModeEnumValues]
  }
  
  @scala.inline
  implicit class VertexModeEnumValuesOps[Self <: VertexModeEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTriangleFan(value: VertexMode): Self = this.set("TriangleFan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangles(value: VertexMode): Self = this.set("Triangles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrianglesStrip(value: VertexMode): Self = this.set("TrianglesStrip", value.asInstanceOf[js.Any])
  }
}
