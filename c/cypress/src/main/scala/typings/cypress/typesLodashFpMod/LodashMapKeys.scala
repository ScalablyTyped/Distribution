package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapKeys extends js.Object {
  def apply(iteratee: ValueIteratee[String]): LodashMapKeys2x1 = js.native
  def apply[T /* <: js.Object */](iteratee: ValueIteratee[String], `object`: T): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratee: ValueIteratee[Double], `object`: List[T]): Dictionary[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashMapKeys2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, `object`: T): LodashMapKeys2x2[T] = js.native
  def apply[T](iteratee: __, `object`: List[T]): LodashMapKeys1x2[T] = js.native
}

