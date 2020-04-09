package typings.clownface.contextMod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("clownface/lib/Context", JSImport.Namespace)
@js.native
class ^[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] protected () extends js.Object {
  def this(dataset: D, graph: js.UndefOr[scala.Nothing], value: js.Any) = this()
  def this(dataset: D, graph: QuadGraph, value: js.Any) = this()
}

