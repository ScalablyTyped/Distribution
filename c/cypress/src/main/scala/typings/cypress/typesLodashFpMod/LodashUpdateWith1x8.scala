package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.PropertyPath
import typings.cypress.typesLodashMod.SetWithCustomizer
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUpdateWith1x8[T] extends js.Object {
  def apply(customizer: SetWithCustomizer[T]): LodashUpdateWith1x9[T] = js.native
  def apply(customizer: SetWithCustomizer[T], path: PropertyPath): LodashUpdateWith1x11[T] = js.native
  def apply(
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): T = js.native
  def apply(customizer: SetWithCustomizer[T], path: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x13[T] = js.native
  def apply(customizer: __, path: PropertyPath): LodashUpdateWith1x10[T] = js.native
  def apply(customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x14[T] = js.native
  def apply(customizer: __, path: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x12[T] = js.native
}

