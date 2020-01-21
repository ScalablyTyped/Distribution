package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkVertexMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriangleFan extends js.Object {
  var TriangleFan: SkVertexMode
  var Triangles: SkVertexMode
  var TrianglesStrip: SkVertexMode
}

object AnonTriangleFan {
  @scala.inline
  def apply(TriangleFan: SkVertexMode, Triangles: SkVertexMode, TrianglesStrip: SkVertexMode): AnonTriangleFan = {
    val __obj = js.Dynamic.literal(TriangleFan = TriangleFan.asInstanceOf[js.Any], Triangles = Triangles.asInstanceOf[js.Any], TrianglesStrip = TrianglesStrip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriangleFan]
  }
}

