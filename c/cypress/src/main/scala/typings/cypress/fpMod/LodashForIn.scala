package typings.cypress.fpMod

import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForIn extends js.Object {
  def apply[T](iteratee: js.Function1[/* value */ T, _]): LodashForIn1x1[T] = js.native
  def apply[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: __): LodashForIn2x2[T] = js.native
  def apply[T](iteratee: __, `object`: T): LodashForIn1x2[T] = js.native
}

