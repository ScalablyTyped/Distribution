package typings.builderDashUtil.builderDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", "use")
@js.native
object use extends js.Object {
  def apply[T, R](value: T, task: js.Function1[/* it */ T, R]): R | Null = js.native
  def apply[T, R](value: Null, task: js.Function1[/* it */ T, R]): R | Null = js.native
}

