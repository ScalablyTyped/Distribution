package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashGetOr5x2 extends StObject {
  
  def apply[TDefault](defaultValue: TDefault): LodashGetOr5x3[TDefault] = js.native
  def apply[T](defaultValue: __): LodashGetOr5x6[T] = js.native
  def apply[T](defaultValue: __, `object`: NumericDictionary[T]): LodashGetOr5x6[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, `object`: NumericDictionary[T]): T | TDefault = js.native
}
