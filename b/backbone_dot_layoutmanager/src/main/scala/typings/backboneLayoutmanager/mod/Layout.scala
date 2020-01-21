package typings.backboneLayoutmanager.mod

import typings.backbone.mod.Model
import typings.backbone.mod.View
import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Layout")
@js.native
class Layout[TModel /* <: Model */] () extends View[TModel] {
  def this(options: LayoutOptions[TModel]) = this()
  var template: String = js.native
  def afterRender(): Unit = js.native
  def async(): js.Function1[/* compiled */ js.Function1[/* context */ js.Any, Unit], Unit] = js.native
  def beforeRender(): Unit = js.native
  def cleanup(): Unit = js.native
  def fetchTemplate(path: String): js.Function1[/* context */ js.Any, String] = js.native
  def getAllOptions(): LayoutOptions[TModel] = js.native
  def getView(): js.Any = js.native
  def getView(fn: js.Any): js.Any = js.native
  def getViews(): js.Array[_] = js.native
  def getViews(fn: js.Any): js.Array[_] = js.native
  def insertView(selector: js.Any): js.Any = js.native
  def insertView(selector: js.Any, view: js.Any): js.Any = js.native
   // return view;
  def insertViews(views: js.Any): Layout[TModel] = js.native
  def promise(): JQueryPromise[_] = js.native
  def removeView(fn: js.Any): Layout[TModel] = js.native
   // return this
  def renderViews(): Layout[TModel] = js.native
   // return this
  def setView[U](name: js.Any, view: U): U = js.native
  def setView[U](name: js.Any, view: U, insert: Boolean): U = js.native
   // return view
  def setViews(views: js.Any): Layout[TModel] = js.native
   // return this
  def `then`(fn: js.Function0[Unit]): Unit = js.native
}

/* static members */
@JSImport("backbone", "Layout")
@js.native
object Layout extends js.Object {
  def cache(path: String): js.Any = js.native
  def cache(path: String, contents: js.Any): js.Any = js.native
  def cleanViews(views: js.Any): Unit = js.native
  def configure(options: LayoutManagerOptions): Unit = js.native
  def setupView(views: js.Any): Unit = js.native
  def setupView(views: js.Any, options: LayoutOptions[Model]): Unit = js.native
}

