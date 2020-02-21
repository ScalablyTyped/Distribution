package typings.clownface.clownfaceMod

import typings.clownface.mod.ClownfaceInit
import typings.clownface.mod.WithSingleTerm
import typings.clownface.mod.WithSingleValue
import typings.clownface.mod.WithTerms
import typings.clownface.mod.WithValues
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface/lib/Clownface", JSImport.Namespace)
@js.native
class ^[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] protected () extends Clownface[D, T] {
  def this(options: (ClownfaceInit[DatasetCore[Quad, Quad], Term]) with (Partial[WithSingleTerm[T] | WithTerms[T]]) with (Partial[WithSingleValue | WithValues])) = this()
}

