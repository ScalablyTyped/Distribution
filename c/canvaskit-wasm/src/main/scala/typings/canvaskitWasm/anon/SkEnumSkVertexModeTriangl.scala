package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkVertexMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkVertexMode, {  TriangleFan :canvaskit-wasm.canvaskit-wasm.SkVertexMode,   Triangles :canvaskit-wasm.canvaskit-wasm.SkVertexMode,   TrianglesStrip :canvaskit-wasm.canvaskit-wasm.SkVertexMode}> */
@js.native
trait SkEnumSkVertexModeTriangl extends js.Object {
  val TriangleFan: SkVertexMode = js.native
  val Triangles: SkVertexMode = js.native
  val TrianglesStrip: SkVertexMode = js.native
  val values: js.Array[SkVertexMode] = js.native
}

object SkEnumSkVertexModeTriangl {
  @scala.inline
  def apply(
    TriangleFan: SkVertexMode,
    Triangles: SkVertexMode,
    TrianglesStrip: SkVertexMode,
    values: js.Array[SkVertexMode]
  ): SkEnumSkVertexModeTriangl = {
    val __obj = js.Dynamic.literal(TriangleFan = TriangleFan.asInstanceOf[js.Any], Triangles = Triangles.asInstanceOf[js.Any], TrianglesStrip = TrianglesStrip.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkVertexModeTriangl]
  }
  @scala.inline
  implicit class SkEnumSkVertexModeTrianglOps[Self <: SkEnumSkVertexModeTriangl] (val x: Self) extends AnyVal {
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
    def setTriangleFan(value: SkVertexMode): Self = this.set("TriangleFan", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangles(value: SkVertexMode): Self = this.set("Triangles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrianglesStrip(value: SkVertexMode): Self = this.set("TrianglesStrip", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkVertexMode*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkVertexMode]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

