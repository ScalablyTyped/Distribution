package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.MemoIteratorCapped
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduce1x2[TResult] extends StObject {
  
  def apply[T /* <: js.Object */](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduce3x3[T, TResult] = js.native
  def apply[T /* <: js.Object */](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](callback: MemoIteratorCapped[T, TResult], collection: js.Array[T]): TResult = js.native
  def apply[T](callback: MemoIteratorCapped[T, TResult], collection: typings.cypress.typesLodashMod.List[T]): TResult = js.native
  def apply[T /* <: js.Object */](callback: __): LodashReduce3x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: __, collection: T): LodashReduce3x6[T, TResult] = js.native
  def apply[T](callback: __, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def apply[T](callback: __, collection: typings.cypress.typesLodashMod.List[T]): LodashReduce2x6[T, TResult] = js.native
}
