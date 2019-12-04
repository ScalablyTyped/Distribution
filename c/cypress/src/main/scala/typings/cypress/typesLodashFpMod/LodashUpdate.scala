package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.PropertyPath
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUpdate extends js.Object {
  def apply(path: PropertyPath): LodashUpdate1x1 = js.native
  def apply(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LodashUpdate1x3 = js.native
  def apply(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _], `object`: js.Object): js.Any = js.native
  def apply(path: PropertyPath, updater: __, `object`: js.Object): LodashUpdate1x5 = js.native
  def apply(path: __, updater: js.Function1[/* value */ js.Any, _]): LodashUpdate1x2 = js.native
  def apply(path: __, updater: js.Function1[/* value */ js.Any, _], `object`: js.Object): LodashUpdate1x6 = js.native
  def apply(path: __, updater: __, `object`: js.Object): LodashUpdate1x4 = js.native
}

