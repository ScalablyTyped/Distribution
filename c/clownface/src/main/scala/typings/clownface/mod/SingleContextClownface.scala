package typings.clownface.mod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleContextClownface[D /* <: DatasetCore[Quad] */, T /* <: Term */] extends SafeClownface[D, T] {
  @JSName("term")
  val term_SingleContextClownface: T = js.native
  @JSName("value")
  val value_SingleContextClownface: String = js.native
}

