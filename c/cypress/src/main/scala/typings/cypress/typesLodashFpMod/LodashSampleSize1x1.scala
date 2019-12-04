package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSampleSize1x1 extends js.Object {
  def apply[T](): js.Array[T] = js.native
  def apply[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](collection: Dictionary[T]): js.Array[T] = js.native
  def apply[T](collection: List[T]): js.Array[T] = js.native
  def apply[T](collection: NumericDictionary[T]): js.Array[T] = js.native
}

