package typings.backbone.mod

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "View")
@js.native
open class View[TModel /* <: js.UndefOr[Model[Any, ModelSetOptions, Any]] */, TElement /* <: Element */] () extends StObject {
  def this(options: ViewOptions[TModel, TElement]) = this()
  
  @JSName("$")
  def $(selector: String): JQuery[HTMLElement] = js.native
  
  @JSName("$el")
  var $el: JQuery[HTMLElement] = js.native
  
  /* protected */ def _createElement(tagName: String): Unit = js.native
  
  /* protected */ def _ensureElement(): Unit = js.native
  
  /* protected */ def _removeElement(): Unit = js.native
  
  /* protected */ def _setAttributes(attributes: Record[String, Any]): Unit = js.native
  
  /* protected */ def _setElement(el: TElement): Unit = js.native
  /* protected */ def _setElement(el: JQuery[HTMLElement]): Unit = js.native
  
  var attributes: Record[String, Any] = js.native
  
  var cid: String = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collection: Collection[Any] = js.native
  
  def delegate(eventName: String, selector: String, listener: ViewEventListener): this.type = js.native
  
  def delegateEvents(): this.type = js.native
  def delegateEvents(events: Result[EventsHash]): this.type = js.native
  
  var el: TElement = js.native
  
  /**
    * Events hash or a method returning the events hash that maps events/selectors to methods on your View.
    * For assigning events as object hash, do it like this: this.events = <any>{ "event:selector": callback, ... };
    * That works only if you set it in the constructor or the initialize method.
    */
  def events(): EventsHash = js.native
  
  var id: js.UndefOr[String] = js.native
  
  def initialize(): Unit = js.native
  def initialize(options: ViewOptions[TModel, TElement]): Unit = js.native
  
  // A conditional type used here to prevent `TS2532: Object is possibly 'undefined'`
  var model: js.UndefOr[TModel] = js.native
  
  /**
    * For use with views as ES classes. If you define a preinitialize
    * method, it will be invoked when the view is first created, before any
    * instantiation logic is run.
    * @see https://backbonejs.org/#View-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(options: ViewOptions[TModel, TElement]): Unit = js.native
  
  def remove(): this.type = js.native
  
  def render(): this.type = js.native
  
  def setElement(element: TElement): this.type = js.native
  def setElement(element: JQuery[HTMLElement]): this.type = js.native
  
  var tagName: String = js.native
  
  def undelegate(eventName: String): this.type = js.native
  def undelegate(eventName: String, selector: String): this.type = js.native
  def undelegate(eventName: String, selector: String, listener: ViewEventListener): this.type = js.native
  def undelegate(eventName: String, selector: Unit, listener: ViewEventListener): this.type = js.native
  
  def undelegateEvents(): this.type = js.native
}
object View {
  
  @JSImport("backbone", "View")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Do not use, prefer TypeScript's extend functionality.
    */
  /* static member */
  inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
}
