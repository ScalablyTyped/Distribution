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
  def apply[D /* <: DatasetCore[Quad] */, T /* <: Term */](options: ClownfaceInit[D, T]): Clownface[D, T] = js.native
  def apply[D /* <: DatasetCore[Quad] */, T /* <: Term */](options: ClownfaceInitWithNodes[D, T]): SafeClownface[D, T] = js.native
}

