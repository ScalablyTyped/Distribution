package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduce1x1[T, TResult] extends StObject {
  
  def apply(accumulator: TResult): LodashReduce1x3[T, TResult] = js.native
  def apply(accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply(accumulator: TResult, collection: typings.cypress.typesLodashMod.List[T]): TResult = js.native
  def apply(accumulator: __): LodashReduce1x5[TResult] = js.native
  def apply(accumulator: __, collection: js.Array[T]): LodashReduce1x5[TResult] = js.native
  def apply(accumulator: __, collection: typings.cypress.typesLodashMod.List[T]): LodashReduce2x5[TResult] = js.native
}
