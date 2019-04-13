package typings
package backboneDotLayoutmanagerLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("backbone.Layout")
@js.native
class Layout[TModel /* <: backboneLib.backboneMod.Model */] ()
  extends backboneLib.backboneMod.View[TModel] {
  def this(options: LayoutOptions[TModel]) = this()
  var template: java.lang.String = js.native
  def afterRender(): scala.Unit = js.native
  def async(): js.Function1[/* compiled */ js.Function1[/* context */ js.Any, scala.Unit], scala.Unit] = js.native
  def beforeRender(): scala.Unit = js.native
  def cleanup(): scala.Unit = js.native
  def fetchTemplate(path: java.lang.String): js.Function1[/* context */ js.Any, java.lang.String] = js.native
  def getAllOptions(): LayoutOptions[TModel] = js.native
  def getView(): js.Any = js.native
  def getView(fn: js.Any): js.Any = js.native
  def getViews(): js.Array[_] = js.native
  def getViews(fn: js.Any): js.Array[_] = js.native
  def insertView(selector: js.Any): js.Any = js.native
  def insertView(selector: js.Any, view: js.Any): js.Any = js.native
   // return view;
  def insertViews(views: js.Any): Layout[TModel] = js.native
  def promise(): jqueryLib.JQueryPromise[_] = js.native
  def removeView(fn: js.Any): Layout[TModel] = js.native
   // return this
  def renderViews(): Layout[TModel] = js.native
   // return this
  def setView[U](name: js.Any, view: U): U = js.native
  def setView[U](name: js.Any, view: U, insert: scala.Boolean): U = js.native
   // return view
  def setViews(views: js.Any): Layout[TModel] = js.native
   // return this
  def `then`(fn: js.Function0[scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSGlobal("backbone.Layout")
@js.native
object Layout extends js.Object {
  def cache(path: java.lang.String): js.Any = js.native
  def cache(path: java.lang.String, contents: js.Any): js.Any = js.native
  def cleanViews(views: js.Any): scala.Unit = js.native
  def configure(options: backboneDotLayoutmanagerLib.backboneMod.LayoutManagerOptions): scala.Unit = js.native
  def setupView(views: js.Any): scala.Unit = js.native
  def setupView(
    views: js.Any,
    options: backboneDotLayoutmanagerLib.backboneMod.LayoutOptions[backboneLib.backboneMod.Model]
  ): scala.Unit = js.native
}

