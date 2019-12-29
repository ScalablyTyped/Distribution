package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastKey extends js.Object {
  def apply[T](predicate: ValueIteratee[T]): LodashFindLastKey1x1[T] = js.native
  def apply[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): js.UndefOr[String] = js.native
  def apply[T](predicate: __): LodashFindLastKey1x2[T] = js.native
  def apply[T](predicate: __, `object`: T): LodashFindLastKey1x2[T] = js.native
}

