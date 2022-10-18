package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashSortBy extends StObject {
  
  def apply[T](iteratees: Many[ValueIteratee[T]]): LodashSortBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratees: Many[ValueIteratee[T]], collection: typings.cypress.typesLodashMod.List[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __): LodashSortBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, collection: T): LodashSortBy2x2[T] = js.native
  def apply[T](iteratees: __, collection: typings.cypress.typesLodashMod.List[T]): LodashSortBy1x2[T] = js.native
}
