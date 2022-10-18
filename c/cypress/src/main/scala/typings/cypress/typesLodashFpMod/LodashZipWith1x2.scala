package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashZipWith1x2[T1] extends StObject {
  
  def apply[T2](iteratee: __, arrays2: typings.cypress.typesLodashMod.List[T2]): LodashZipWith1x6[T1, T2] = js.native
  def apply[T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]): LodashZipWith1x3[T2, TResult] = js.native
  def apply[T2, TResult](
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult],
    arrays2: typings.cypress.typesLodashMod.List[T2]
  ): js.Array[TResult] = js.native
}
