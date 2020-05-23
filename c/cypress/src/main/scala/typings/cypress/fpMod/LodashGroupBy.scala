package typings.cypress.fpMod

import typings.cypress.lodashMod.Dictionary
import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGroupBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashGroupBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Dictionary[js.Array[T]] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashGroupBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashGroupBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashGroupBy1x2[T] = js.native
}

