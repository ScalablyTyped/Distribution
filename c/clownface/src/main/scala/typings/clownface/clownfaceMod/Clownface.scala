package typings.clownface.clownfaceMod

import typings.clownface.mod.SafeClownface
import typings.clownface.mod.SingleContextClownface
import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clownface[D /* <: DatasetCore[Quad] */, T /* <: Term */]
  extends typings.clownface.mod.Clownface[D, T] {
  def blankNode(value: String): SingleContextClownface[D, BlankNode] = js.native
  @JSName("blankNode")
  def blankNode_SafeClownface(values: js.Array[String]): SafeClownface[D, BlankNode] = js.native
}

