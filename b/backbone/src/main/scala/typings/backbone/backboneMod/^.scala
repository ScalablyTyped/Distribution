package typings.backbone.backboneMod

import typings.backbone.Typeofbackbone
import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryStatic
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: JQueryStatic = js.native
  val Events: typings.backbone.backboneMod.Events = js.native
  var emulateHTTP: Boolean = js.native
  var emulateJSON: Boolean = js.native
  var history: History = js.native
  def ajax(): JQueryXHR = js.native
  def ajax(options: JQueryAjaxSettings): JQueryXHR = js.native
  // Utility
  def noConflict(): Typeofbackbone = js.native
  def sync(method: String, model: Collection[Model]): js.Any = js.native
  def sync(method: String, model: Collection[Model], options: JQueryAjaxSettings): js.Any = js.native
  // SYNC
  def sync(method: String, model: Model): js.Any = js.native
  def sync(method: String, model: Model, options: JQueryAjaxSettings): js.Any = js.native
}

