package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.ValueIteratorTypeGuard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFilter1x2[T] extends StObject {
  
  def apply(predicate: ValueIterateeCustom[T, Boolean]): js.Array[T] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.Array[S] = js.native
}
