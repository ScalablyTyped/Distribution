package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ListOfRecursiveArraysOrValues
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFlatMapDeep extends StObject {
  
  def apply(iteratee: String): js.Array[Any] = js.native
  def apply(iteratee: String, collection: js.Object): js.Array[Any] = js.native
  def apply(iteratee: js.Object): LodashFlatMapDeep4x1 = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: __): LodashFlatMapDeep3x2 = js.native
  def apply(iteratee: __, collection: js.Object): LodashFlatMapDeep3x2 = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMapDeep2x2[T] = js.native
  def apply[T](iteratee: __, collection: typings.cypress.typesLodashMod.List[T]): LodashFlatMapDeep1x2[T] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDeep2x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    collection: typings.cypress.typesLodashMod.List[T]
  ): js.Array[TResult] = js.native
}
