package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkVertexMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkVertexMode, {  TriangleFan  :canvaskit-wasm.canvaskit-wasm.SkVertexMode,   Triangles  :canvaskit-wasm.canvaskit-wasm.SkVertexMode,   TrianglesStrip  :canvaskit-wasm.canvaskit-wasm.SkVertexMode}> */
trait SkEnumSkVertexModeTriangl extends js.Object {
  val TriangleFan: SkVertexMode
  val Triangles: SkVertexMode
  val TrianglesStrip: SkVertexMode
  val values: js.Array[SkVertexMode]
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
}

