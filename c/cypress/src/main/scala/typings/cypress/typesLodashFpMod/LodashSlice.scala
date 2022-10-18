package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashSlice extends StObject {
  
  def apply(start: Double): LodashSlice1x1 = js.native
  def apply(start: Double, end: Double): LodashSlice1x3 = js.native
  def apply(start: __, end: Double): LodashSlice1x2 = js.native
  def apply[T](start: Double, end: Double, array: typings.cypress.typesLodashMod.List[T]): js.Array[T] = js.native
  def apply[T](start: Double, end: __): LodashSlice1x5[T] = js.native
  def apply[T](start: Double, end: __, array: typings.cypress.typesLodashMod.List[T]): LodashSlice1x5[T] = js.native
  def apply[T](start: __, end: Double, array: typings.cypress.typesLodashMod.List[T]): LodashSlice1x6[T] = js.native
  def apply[T](start: __, end: __): LodashSlice1x4[T] = js.native
  def apply[T](start: __, end: __, array: typings.cypress.typesLodashMod.List[T]): LodashSlice1x4[T] = js.native
}
