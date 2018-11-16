package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", JSImport.Namespace)
@js.native
object backboneModMembers extends js.Object {
  @JSName("$")
  var $: jqueryLib.JQueryStatic = js.native
  var emulateHTTP: scala.Boolean = js.native
  var emulateJSON: scala.Boolean = js.native
  var history: backboneLib.backboneMod.BackboneNs.History = js.native
  def ajax(): jqueryLib.JQueryXHR = js.native
  def ajax(options: jqueryLib.JQueryAjaxSettings): jqueryLib.JQueryXHR = js.native
  // Utility
  def noConflict(): backboneLib.Anon_History = js.native
  // SYNC
  def sync(
    method: java.lang.String,
    model: backboneLib.backboneMod.BackboneNs.Collection[backboneLib.backboneMod.BackboneNs.Model]
  ): js.Any = js.native
  // SYNC
  def sync(
    method: java.lang.String,
    model: backboneLib.backboneMod.BackboneNs.Collection[backboneLib.backboneMod.BackboneNs.Model],
    options: jqueryLib.JQueryAjaxSettings
  ): js.Any = js.native
  // SYNC
  def sync(method: java.lang.String, model: backboneLib.backboneMod.BackboneNs.Model): js.Any = js.native
  // SYNC
  def sync(
    method: java.lang.String,
    model: backboneLib.backboneMod.BackboneNs.Model,
    options: jqueryLib.JQueryAjaxSettings
  ): js.Any = js.native
}

