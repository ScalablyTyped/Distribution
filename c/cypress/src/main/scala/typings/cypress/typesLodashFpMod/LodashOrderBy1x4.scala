package typings.cypress.typesLodashFpMod

import typings.cypress.cypressStrings.asc
import typings.cypress.cypressStrings.desc
import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.NotVoid
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy1x4[T] extends StObject {
  
  def apply(iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x5[T] = js.native
  def apply(iteratees: Many[js.Function1[/* value */ T, NotVoid]]): LodashOrderBy1x5[T] = js.native
  def apply(iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: Many[Boolean | asc | desc]): js.Array[T] = js.native
  def apply(iteratees: Many[ValueIteratee[T]], orders: Many[Boolean | asc | desc]): js.Array[T] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T] = js.native
}
