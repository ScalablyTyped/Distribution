package typings.backbone.mod

import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "ajax")
@js.native
object ajax extends js.Object {
  def apply(): JQueryXHR = js.native
  def apply(options: JQueryAjaxSettings): JQueryXHR = js.native
}

