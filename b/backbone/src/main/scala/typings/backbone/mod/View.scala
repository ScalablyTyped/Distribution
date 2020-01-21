package typings.backbone.mod

import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "View")
@js.native
class View[TModel /* <: Model */] () extends js.Object {
  def this(options: ViewOptions[TModel]) = this()
  @JSName("$el")
  var $el: JQuery_[HTMLElement] = js.native
  var attributes: js.Any = js.native
  var cid: String = js.native
  var className: String = js.native
  var collection: Collection[TModel] = js.native
  var el: js.Any = js.native
  var id: String = js.native
  var model: TModel = js.native
  var tagName: String = js.native
  @JSName("$")
  def $(selector: String): JQuery_[HTMLElement] = js.native
  @JSName("$")
  def $(selector: js.Any): JQuery_[HTMLElement] = js.native
  def _ensureElement(): Unit = js.native
  def delegate(eventName: String, selector: String, listener: js.Function): View[TModel] = js.native
  def delegateEvents(): js.Any = js.native
  def delegateEvents(events: EventsHash): js.Any = js.native
  /**
    * Events hash or a method returning the events hash that maps events/selectors to methods on your View.
    * For assigning events as object hash, do it like this: this.events = <any>{ "event:selector": callback, ... };
    * That works only if you set it in the constructor or the initialize method.
    **/
  def events(): EventsHash = js.native
  def initialize(): Unit = js.native
  def initialize(options: ViewOptions[TModel]): Unit = js.native
  /**
    * For use with views as ES classes. If you define a preinitialize
    * method, it will be invoked when the view is first created, before any
    * instantiation logic is run.
    * @see https://backbonejs.org/#View-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(options: ViewOptions[TModel]): Unit = js.native
  def remove(): View[TModel] = js.native
  def render(): View[TModel] = js.native
  def setElement(element: js.Any): View[TModel] = js.native
  def setElement(element: JQuery_[HTMLElement]): View[TModel] = js.native
  def setElement(element: JQuery_[HTMLElement], delegate: Boolean): View[TModel] = js.native
  //template: (json, options?) => string;
  def setElement(element: HTMLElement): View[TModel] = js.native
  def setElement(element: HTMLElement, delegate: Boolean): View[TModel] = js.native
  def undelegate(eventName: String): View[TModel] = js.native
  def undelegate(eventName: String, selector: String): View[TModel] = js.native
  def undelegate(eventName: String, selector: String, listener: js.Function): View[TModel] = js.native
  def undelegateEvents(): js.Any = js.native
}

/* static members */
@JSImport("backbone", "View")
@js.native
object View extends js.Object {
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

