package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.PropertyPath
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashSet extends StObject {
  
  def apply(path: PropertyPath): LodashSet1x1 = js.native
  def apply(path: PropertyPath, value: Any): LodashSet1x3 = js.native
  def apply(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5 = js.native
  def apply(path: __, value: Any): LodashSet1x2 = js.native
  def apply(path: __, value: Any, `object`: js.Object): LodashSet2x6 = js.native
  def apply(path: __, value: __, `object`: js.Object): LodashSet2x4 = js.native
  def apply[T /* <: js.Object */](path: PropertyPath, value: Any, `object`: T): T = js.native
  def apply[TResult](path: PropertyPath, value: Any, `object`: js.Object): TResult = js.native
  def apply[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T] = js.native
  def apply[T /* <: js.Object */](path: __, value: Any, `object`: T): LodashSet1x6[T] = js.native
  def apply[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T] = js.native
}
