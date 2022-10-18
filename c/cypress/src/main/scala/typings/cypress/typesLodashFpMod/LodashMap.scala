package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashMap extends StObject {
  
  def apply(iteratee: String): LodashMap5x1 = js.native
  def apply(iteratee: js.Object): LodashMap6x1 = js.native
  def apply[T](iteratee: String, collection: Dictionary[T]): js.Array[Any] = js.native
  def apply[T](iteratee: String, collection: NumericDictionary[T]): js.Array[Any] = js.native
  def apply[T](iteratee: js.Object, collection: Dictionary[T]): js.Array[Boolean] = js.native
  def apply[T](iteratee: js.Object, collection: NumericDictionary[T]): js.Array[Boolean] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashMap3x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashMap3x2[T] = js.native
  def apply[T](iteratee: __, collection: js.Array[T]): LodashMap1x2[T] = js.native
  def apply[T](iteratee: __, collection: Dictionary[T]): LodashMap4x2[T] = js.native
  def apply[T](iteratee: __, collection: typings.cypress.typesLodashMod.List[T]): LodashMap2x2[T] = js.native
  def apply[T](iteratee: __, collection: NumericDictionary[T]): LodashMap4x2[T] = js.native
  def apply[T, K /* <: /* keyof T */ String */](iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def apply[T, K /* <: /* keyof T */ String */](iteratee: K, collection: Dictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def apply[T, K /* <: /* keyof T */ String */](iteratee: K, collection: NumericDictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): LodashMap1x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: js.Array[T]): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: typings.cypress.typesLodashMod.List[T]): js.Array[TResult] = js.native
}
