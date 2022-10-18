package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ListOfRecursiveArraysOrValues
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFlatMapDepth1x4[T] extends StObject {
  
  def apply(iteratee: __, depth: Double): LodashFlatMapDepth1x6[T] = js.native
  def apply[TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LodashFlatMapDepth1x5[TResult] = js.native
  def apply[TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
}
