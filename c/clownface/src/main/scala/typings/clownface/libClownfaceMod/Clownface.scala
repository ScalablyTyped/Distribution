package typings.clownface.libClownfaceMod

import typings.clownface.clownfaceMod.SafeClownface
import typings.clownface.clownfaceMod.SingleContextClownface
import typings.rdfDashJs.rdfDashJsMod.BlankNode
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clownface[D /* <: DatasetCore[Quad] */, T /* <: Term */]
  extends typings.clownface.clownfaceMod.Clownface[D, T] {
  def blankNode(value: String): SingleContextClownface[D, BlankNode] = js.native
  @JSName("blankNode")
  def blankNode_SafeClownface(values: js.Array[String]): SafeClownface[D, BlankNode] = js.native
}

