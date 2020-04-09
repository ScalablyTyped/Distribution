package typings.clownface.contextMod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
trait Context[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] extends js.Object {
  var dataset: D
  var graph: js.UndefOr[QuadGraph] = js.undefined
  var term: T
}

object Context {
  @scala.inline
  def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */](dataset: D, term: T, graph: QuadGraph = null): Context[D, T] = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[D, T]]
  }
}

