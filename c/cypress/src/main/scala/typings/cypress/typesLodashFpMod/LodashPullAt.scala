package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAt extends StObject {
  
  def apply(indexes: Many[Double]): LodashPullAt1x1 = js.native
  def apply[T](indexes: Many[Double], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](indexes: Many[Double], array: typings.cypress.typesLodashMod.List[T]): typings.cypress.typesLodashMod.List[T] = js.native
  def apply[T](indexes: __, array: js.Array[T]): LodashPullAt1x2[T] = js.native
  def apply[T](indexes: __, array: typings.cypress.typesLodashMod.List[T]): LodashPullAt2x2[T] = js.native
}
