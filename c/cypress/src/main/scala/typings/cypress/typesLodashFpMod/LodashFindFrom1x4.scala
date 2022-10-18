package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.ValueIteratorTypeGuard
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFindFrom1x4[T] extends StObject {
  
  def apply(predicate: ValueIterateeCustom[T, Boolean]): LodashFindFrom2x5[T] = js.native
  def apply(predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  def apply(predicate: __, fromIndex: Double): LodashFindFrom1x6[T] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindFrom1x5[S] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
}
