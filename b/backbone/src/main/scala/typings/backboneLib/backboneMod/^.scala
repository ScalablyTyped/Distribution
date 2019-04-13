package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: jqueryLib.JQueryStatic = js.native
  val Events: backboneLib.backboneMod.Events = js.native
  var emulateHTTP: scala.Boolean = js.native
  var emulateJSON: scala.Boolean = js.native
  var history: History = js.native
  def ajax(): jqueryLib.JQueryXHR = js.native
  def ajax(options: jqueryLib.JQueryAjaxSettings): jqueryLib.JQueryXHR = js.native
  // Utility
  def noConflict(): backboneLib.Anon_ = js.native
  def sync(method: java.lang.String, model: Collection[Model]): js.Any = js.native
  def sync(method: java.lang.String, model: Collection[Model], options: jqueryLib.JQueryAjaxSettings): js.Any = js.native
  // SYNC
  def sync(method: java.lang.String, model: Model): js.Any = js.native
  def sync(method: java.lang.String, model: Model, options: jqueryLib.JQueryAjaxSettings): js.Any = js.native
}

