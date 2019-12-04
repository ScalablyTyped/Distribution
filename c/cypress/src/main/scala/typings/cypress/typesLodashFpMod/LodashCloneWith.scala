package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.CloneWithCustomizer
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCloneWith extends js.Object {
  def apply[T](customizer: __, value: T): LodashCloneWith1x2[T] = js.native
  def apply[T, TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult]): LodashCloneWith1x1[T, TResult] = js.native
  def apply[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]], value: T): TResult | T = js.native
}

