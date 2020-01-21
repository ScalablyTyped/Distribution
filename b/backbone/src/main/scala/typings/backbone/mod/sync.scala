package typings.backbone.mod

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "sync")
@js.native
object sync extends js.Object {
  def apply(method: String, model: Collection[Model]): js.Any = js.native
  def apply(method: String, model: Collection[Model], options: JQueryAjaxSettings): js.Any = js.native
  // SYNC
  def apply(method: String, model: Model): js.Any = js.native
  def apply(method: String, model: Model, options: JQueryAjaxSettings): js.Any = js.native
}

