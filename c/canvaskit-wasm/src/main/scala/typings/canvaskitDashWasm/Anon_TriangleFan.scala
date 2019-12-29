package typings.canvaskitDashWasm

import typings.canvaskitDashWasm.canvaskitDashWasmMod.SkVertexMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TriangleFan extends js.Object {
  var TriangleFan: SkVertexMode
  var Triangles: SkVertexMode
  var TrianglesStrip: SkVertexMode
}

object Anon_TriangleFan {
  @scala.inline
  def apply(TriangleFan: SkVertexMode, Triangles: SkVertexMode, TrianglesStrip: SkVertexMode): Anon_TriangleFan = {
    val __obj = js.Dynamic.literal(TriangleFan = TriangleFan.asInstanceOf[js.Any], Triangles = Triangles.asInstanceOf[js.Any], TrianglesStrip = TrianglesStrip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TriangleFan]
  }
}

