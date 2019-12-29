package typings.clownface.clownfaceMod

import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[D /* <: DatasetCore[Quad] */](options: (ClownfaceInit[D, Term]) with (WithTerm | WithValue)): SafeClownface[D, Term] = js.native
}

