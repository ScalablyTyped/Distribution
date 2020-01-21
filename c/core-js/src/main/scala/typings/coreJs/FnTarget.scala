package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnTarget extends js.Object {
  def apply(target: Function): Unit = js.native
  def apply(target: Object, targetKey: java.lang.String): Unit = js.native
  def apply(target: Object, targetKey: js.Symbol): Unit = js.native
}

