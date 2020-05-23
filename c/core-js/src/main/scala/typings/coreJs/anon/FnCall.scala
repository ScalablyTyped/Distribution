package typings.coreJs.anon

import typings.coreJs.Function
import typings.coreJs.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(target: Function): Unit = js.native
  def apply(target: Object, targetKey: String): Unit = js.native
  def apply(target: Object, targetKey: js.Symbol): Unit = js.native
}

