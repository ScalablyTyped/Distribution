package typings.clownface.clownfaceMod

import typings.rdfDashJs.rdfDashJsMod.BlankNode
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import typings.rdfDashJs.rdfDashJsMod.Literal
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeClownface[D /* <: DatasetCore[Quad] */, T /* <: Term */] extends Clownface[D, T] {
  def blankNode(values: js.Array[String]): SafeClownface[D, BlankNode] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null]): SafeClownface[D, Literal] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: String): SafeClownface[D, Literal] = js.native
  def literal(values: js.Array[Boolean | String | Double | Term | Null], languageOrDatatype: NamedNode): SafeClownface[D, Literal] = js.native
  def namedNode(values: js.Array[String | NamedNode]): SafeClownface[D, NamedNode] = js.native
  def node[X /* <: Term */](values: js.Array[Boolean | String | Double | Term | Null]): SafeClownface[D, X] = js.native
  def node[X /* <: Term */](values: js.Array[Boolean | String | Double | Term | Null], options: NodeOptions): SafeClownface[D, X] = js.native
}

