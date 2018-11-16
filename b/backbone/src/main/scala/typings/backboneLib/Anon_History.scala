package typings
package backboneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_History extends js.Object {
  @JSName("$")
  var $: jqueryLib.JQueryStatic = js.native
  var Collection: ScalablyTyped.runtime.Instantiable2[
    /* models */ js.UndefOr[
      /* models */ js.Array[backboneLib.backboneMod.BackboneNs.Model] | js.Array[js.Object]
    ], 
    /* options */ js.UndefOr[/* options */ js.Any], 
    backboneLib.backboneMod.BackboneNs.Collection[js.Object]
  ] = js.native
  var Events: ScalablyTyped.runtime.Instantiable0[backboneLib.backboneMod.BackboneNs.Events] = js.native
  var History: ScalablyTyped.runtime.Instantiable0[backboneLib.backboneMod.BackboneNs.History] = js.native
  var Model: ScalablyTyped.runtime.Instantiable2[
    /* attributes */ js.UndefOr[/* attributes */ js.Any], 
    /* options */ js.UndefOr[/* options */ js.Any], 
    backboneLib.backboneMod.BackboneNs.Model
  ] = js.native
  var ModelBase: ScalablyTyped.runtime.Instantiable0[backboneLib.backboneMod.BackboneNs.ModelBase] = js.native
  var Router: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ backboneLib.backboneMod.BackboneNs.RouterOptions], 
    backboneLib.backboneMod.BackboneNs.Router
  ] = js.native
  var View: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ backboneLib.backboneMod.BackboneNs.ViewOptions[backboneLib.backboneMod.BackboneNs.Model]
    ], 
    backboneLib.backboneMod.BackboneNs.View[js.Object]
  ] = js.native
  var emulateHTTP: scala.Boolean = js.native
  var emulateJSON: scala.Boolean = js.native
  var history: backboneLib.backboneMod.BackboneNs.History = js.native
  def ajax(): jqueryLib.JQueryXHR = js.native
  def ajax(options: jqueryLib.JQueryAjaxSettings): jqueryLib.JQueryXHR = js.native
  // Utility
  def noConflict(): /* import warning: Failed type conversion: TsTypeQuery(TsQIdent(List(TsIdentLibrarySimple(backbone), TsIdentModule(None,List(backbone)), TsIdentNamespace(Backbone)))) */js.Any = js.native
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

