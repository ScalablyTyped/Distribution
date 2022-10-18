package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFlatMap extends StObject {
  
  def apply(iteratee: String): LodashFlatMap3x1 = js.native
  def apply(iteratee: String, collection: js.Object): js.Array[Any] = js.native
  def apply(iteratee: js.Object): LodashFlatMap4x1 = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: __): LodashFlatMap3x2 = js.native
  def apply(iteratee: __, collection: js.Object): LodashFlatMap3x2 = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMap2x2[T] = js.native
  def apply[T](iteratee: __, collection: typings.cypress.typesLodashMod.List[T]): LodashFlatMap1x2[T] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ]
  ): LodashFlatMap2x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, Many[TResult]],
    collection: typings.cypress.typesLodashMod.List[T]
  ): js.Array[TResult] = js.native
}
