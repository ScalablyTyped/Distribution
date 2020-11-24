package typings.clownface.mod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clownface", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInit[D]): AnyPointer[AnyContext, D] = js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValue[D]): AnyPointer[Literal, D] = js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValues[D]): AnyPointer[js.Array[Literal], D] = js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term | js.Array[Term] */](options: ClownfaceInitWithTerms[T, D]): AnyPointer[T, D] = js.native
  def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: AnyContext */](other: AnyPointer[T, D]): AnyPointer[T, D] = js.native
}
