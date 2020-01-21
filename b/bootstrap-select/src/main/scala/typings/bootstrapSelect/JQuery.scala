package typings.bootstrapSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def selectpicker(): Unit = js.native
  def selectpicker(method: String, args: (String | js.Array[String])*): Unit = js.native
  def selectpicker(opts: BootstrapSelectOptions): Unit = js.native
}

