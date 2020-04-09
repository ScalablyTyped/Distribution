package typings.clownface.clownfaceMod

import typings.clownface.mod.AnyContext
import typings.clownface.mod.Clownface
import typings.clownface.mod.ClownfaceInit
import typings.clownface.mod.ClownfaceInitWithTerms
import typings.clownface.mod.ClownfaceInitWithValue
import typings.clownface.mod.ClownfaceInitWithValues
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("clownface/lib/Clownface", JSImport.Namespace)
@js.native
class ^[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] protected () extends Clownface[T, D] {
  def this(options: ClownfaceInit[D]) = this()
  def this(options: ClownfaceInitWithTerms[T | Term | js.Array[Term], D]) = this()
  def this(options: ClownfaceInitWithValue[D]) = this()
  def this(options: ClownfaceInitWithValues[D]) = this()
}

