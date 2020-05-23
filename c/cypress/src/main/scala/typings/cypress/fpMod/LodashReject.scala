package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIterateeCustom
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReject extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](predicate: __): LodashReject2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashReject2x2[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashReject1x2[T] = js.native
}

