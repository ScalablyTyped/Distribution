package typings.clownface.libClownfaceMod

import typings.clownface.clownfaceMod.ClownfaceInit
import typings.clownface.clownfaceMod.WithTerm
import typings.clownface.clownfaceMod.WithValue
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Term
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface/lib/Clownface", JSImport.Namespace)
@js.native
class ^[D /* <: DatasetCore[Quad] */, T /* <: Term */] protected () extends Clownface[D, T] {
  def this(options: (ClownfaceInit[DatasetCore[Quad], Term]) with Partial[WithTerm] with Partial[WithValue]) = this()
}

