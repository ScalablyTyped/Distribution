package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View[TModel /* <: Model */]
  extends backboneLib.backboneMod.EventSignatures {
  @JSName("$el")
  var $el: jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  var attributes: js.Any = js.native
  var cid: java.lang.String = js.native
  var className: java.lang.String = js.native
  var collection: Collection[TModel] = js.native
  var el: js.Any = js.native
  var id: java.lang.String = js.native
  var model: TModel = js.native
  var tagName: java.lang.String = js.native
  @JSName("$")
  def $(selector: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  @JSName("$")
  def $(selector: js.Any): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def _ensureElement(): scala.Unit = js.native
  def delegate(eventName: java.lang.String, selector: java.lang.String, listener: js.Function): View[TModel] = js.native
  def delegateEvents(): js.Any = js.native
  def delegateEvents(events: EventsHash): js.Any = js.native
  /**
    * Events hash or a method returning the events hash that maps events/selectors to methods on your View.
    * For assigning events as object hash, do it like this: this.events = <any>{ "event:selector": callback, ... };
    * That works only if you set it in the constructor or the initialize method.
    **/
  def events(): EventsHash = js.native
  def initialize(): scala.Unit = js.native
  def initialize(options: ViewOptions[TModel]): scala.Unit = js.native
  def remove(): View[TModel] = js.native
  def render(): View[TModel] = js.native
  def setElement(element: jqueryLib.JQuery[stdLib.HTMLElement]): View[TModel] = js.native
  def setElement(element: jqueryLib.JQuery[stdLib.HTMLElement], delegate: scala.Boolean): View[TModel] = js.native
  def setElement(element: js.Any): View[TModel] = js.native
  //template: (json, options?) => string;
  def setElement(element: stdLib.HTMLElement): View[TModel] = js.native
  def setElement(element: stdLib.HTMLElement, delegate: scala.Boolean): View[TModel] = js.native
  def undelegate(eventName: java.lang.String): View[TModel] = js.native
  def undelegate(eventName: java.lang.String, selector: java.lang.String): View[TModel] = js.native
  def undelegate(eventName: java.lang.String, selector: java.lang.String, listener: js.Function): View[TModel] = js.native
  def undelegateEvents(): js.Any = js.native
}

