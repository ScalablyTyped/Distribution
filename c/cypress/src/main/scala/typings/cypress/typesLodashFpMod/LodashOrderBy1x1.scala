package typings.cypress.typesLodashFpMod

import typings.cypress.cypressStrings.asc
import typings.cypress.cypressStrings.desc
import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy1x1[T] extends StObject {
  
  def apply(orders: Many[Boolean | asc | desc]): LodashOrderBy1x3[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: js.Object): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: typings.cypress.typesLodashMod.List[T]): js.Array[T] = js.native
  def apply(orders: __): LodashOrderBy1x5[T] = js.native
  def apply(orders: __, collection: typings.cypress.typesLodashMod.List[T]): LodashOrderBy1x5[T] = js.native
  def apply[T1 /* <: js.Object */](orders: __, collection: T1): LodashOrderBy3x5[T] = js.native
}
