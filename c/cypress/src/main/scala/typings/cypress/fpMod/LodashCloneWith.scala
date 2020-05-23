package typings.cypress.fpMod

import typings.cypress.lodashMod.CloneWithCustomizer
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCloneWith extends js.Object {
  def apply[T](customizer: __, value: T): LodashCloneWith1x2[T] = js.native
  def apply[T, TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult]): LodashCloneWith1x1[T, TResult] = js.native
  def apply[T, TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult], value: T): TResult = js.native
}

