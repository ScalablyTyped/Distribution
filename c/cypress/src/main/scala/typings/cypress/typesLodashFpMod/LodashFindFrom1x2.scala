package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.ValueIteratorTypeGuard
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFindFrom1x2 extends StObject {
  
  def apply[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.cypress.typesLodashMod.List[T]): js.UndefOr[T] = js.native
  def apply[T](predicate: __): LodashFindFrom1x6[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashFindFrom3x6[T] = js.native
  def apply[T](predicate: __, collection: typings.cypress.typesLodashMod.List[T]): LodashFindFrom1x6[T] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindFrom1x3[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: typings.cypress.typesLodashMod.List[T]): js.UndefOr[S] = js.native
}
