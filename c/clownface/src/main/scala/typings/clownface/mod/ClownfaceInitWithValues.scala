package typings.clownface.mod

import typings.clownface.contextMod.Context
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined clownface.clownface.ClownfaceInit<D> & {  value  :std.Array<string>} */
trait ClownfaceInitWithValues[D /* <: DatasetCore[Quad, Quad] */] extends js.Object {
  var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.undefined
  var dataset: js.UndefOr[D] = js.undefined
  var graph: js.UndefOr[QuadGraph] = js.undefined
  var value: js.Array[String]
}

object ClownfaceInitWithValues {
  @scala.inline
  def apply[D](
    value: js.Array[String],
    _context: js.Array[Context[D, Term]] = null,
    dataset: D = null,
    graph: QuadGraph = null
  ): ClownfaceInitWithValues[D] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (_context != null) __obj.updateDynamic("_context")(_context.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClownfaceInitWithValues[D]]
  }
}

