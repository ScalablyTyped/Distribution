package typings.cashDom.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.cashDom.anon.Left
import typings.std.Node
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cash-dom", "Cash")
@js.native
class Cash ()
  extends /* index */ NumberDictionary[js.UndefOr[EleLoose]]
     with _Selector {
  def this(selector: Selector) = this()
  def this(selector: js.UndefOr[Selector], context: Cash) = this()
  def this(selector: js.UndefOr[Selector], context: Context) = this()
  
  def add(selector: Selector): Cash = js.native
  def add(selector: Selector, context: Context): Cash = js.native
  
  def addClass(classes: String): this.type = js.native
  
  def after(selectors: Selector*): this.type = js.native
  
  def append(selectors: Selector*): this.type = js.native
  
  def appendTo(selector: Selector): this.type = js.native
  
  def attr(): js.UndefOr[scala.Nothing] = js.native
  def attr(attrs: String): String | Null = js.native
  def attr(attrs: String, value: String): this.type = js.native
  def attr(attrs: Record[String, String]): this.type = js.native
  
  def before(selectors: Selector*): this.type = js.native
  
  def children(): Cash = js.native
  def children(comparator: Comparator): Cash = js.native
  
  def closest(): Cash = js.native
  def closest(comparator: Comparator): Cash = js.native
  
  def contents(): Cash = js.native
  
  def css(prop: String): js.UndefOr[String] = js.native
  def css(prop: String, value: String): this.type = js.native
  def css(prop: String, value: Double): this.type = js.native
  def css(props: Record[String, Double | String]): this.type = js.native
  
  def data(): js.UndefOr[Record[String, _]] = js.native
  def data(datas: Record[String, _]): this.type = js.native
  def data(name: String): js.Any = js.native
  def data(name: String, value: js.Any): this.type = js.native
  
  def detach(): this.type = js.native
  def detach(comparator: Comparator): this.type = js.native
  
  def each(callback: EachArrayCallback[EleLoose]): this.type = js.native
  
  def empty(): this.type = js.native
  
  def eq(index: Double): Cash = js.native
  
  def extend(plugins: Record[_, _]): this.type = js.native
  
  def filter(): Cash = js.native
  def filter(comparator: Comparator): Cash = js.native
  
  def find(selector: String): Cash = js.native
  
  def first(): Cash = js.native
  
  def get(): js.Array[EleLoose] = js.native
  def get(index: Double): js.UndefOr[EleLoose] = js.native
  
  def has(selector: String): Cash = js.native
  def has(selector: Node): Cash = js.native
  
  def hasClass(cls: String): Boolean = js.native
  
  def height(): Double = js.native
  def height(value: String): this.type = js.native
  def height(value: Double): this.type = js.native
  
  def hide(): this.type = js.native
  
  def html(): String = js.native
  def html(html: String): this.type = js.native
  
  def index(): Double = js.native
  def index(selector: Selector): Double = js.native
  
  def init(): Cash = js.native
  def init(selector: js.UndefOr[Selector], context: Cash): Cash = js.native
  def init(selector: js.UndefOr[Selector], context: Context): Cash = js.native
  def init(selector: Selector): Cash = js.native
  
  def innerHeight(): js.UndefOr[Double] = js.native
  
  def innerWidth(): js.UndefOr[Double] = js.native
  
  def insertAfter(selector: Selector): this.type = js.native
  
  def insertBefore(selector: Selector): this.type = js.native
  
  def is(): Boolean = js.native
  def is(comparator: Comparator): Boolean = js.native
  
  def last(): Cash = js.native
  
  var length: Double = js.native
  
  def map(callback: MapCallback[EleLoose]): Cash = js.native
  
  def next(): Cash = js.native
  def next(comparator: js.UndefOr[Comparator], _all: js.UndefOr[scala.Nothing], _until: Comparator): Cash = js.native
  def next(comparator: js.UndefOr[Comparator], _all: Boolean): Cash = js.native
  def next(comparator: js.UndefOr[Comparator], _all: Boolean, _until: Comparator): Cash = js.native
  def next(comparator: Comparator): Cash = js.native
  
  def nextAll(): Cash = js.native
  def nextAll(comparator: Comparator): Cash = js.native
  
  def nextUntil(): Cash = js.native
  def nextUntil(until: js.UndefOr[Comparator], comparator: Comparator): Cash = js.native
  def nextUntil(until: Comparator): Cash = js.native
  
  def not(): Cash = js.native
  def not(comparator: Comparator): Cash = js.native
  
  def off(): this.type = js.native
  def off(events: String): this.type = js.native
  def off(events: String, callback: EventCallback): this.type = js.native
  def off(events: String, selector: String, callback: EventCallback): this.type = js.native
  def off(events: Record[String, EventCallback]): this.type = js.native
  
  def offset(): js.UndefOr[Left] = js.native
  
  def offsetParent(): Cash = js.native
  
  def on(events: String, callback: EventCallback): this.type = js.native
  def on(events: String, data: js.Any, callback: EventCallback): this.type = js.native
  def on(events: String, selector: js.UndefOr[scala.Nothing], data: js.Any, callback: EventCallback): this.type = js.native
  def on(
    events: String,
    selector: js.UndefOr[scala.Nothing],
    data: js.Any,
    callback: EventCallback,
    _one: Boolean
  ): this.type = js.native
  def on(events: String, selector: String, callback: EventCallback): this.type = js.native
  def on(events: String, selector: String, data: js.Any, callback: EventCallback): this.type = js.native
  def on(events: String, selector: String, data: js.Any, callback: EventCallback, _one: Boolean): this.type = js.native
  def on(events: String, selector: Null, data: js.Any, callback: EventCallback): this.type = js.native
  def on(events: String, selector: Null, data: js.Any, callback: EventCallback, _one: Boolean): this.type = js.native
  def on(events: Record[String, EventCallback]): this.type = js.native
  def on(events: Record[String, EventCallback], data: js.Any): this.type = js.native
  def on(events: Record[String, EventCallback], selector: js.UndefOr[scala.Nothing], data: js.Any): this.type = js.native
  def on(events: Record[String, EventCallback], selector: String): this.type = js.native
  def on(events: Record[String, EventCallback], selector: String, data: js.Any): this.type = js.native
  def on(events: Record[String, EventCallback], selector: Null, data: js.Any): this.type = js.native
  
  def one(events: String, callback: EventCallback): this.type = js.native
  def one(events: String, data: js.Any, callback: EventCallback): this.type = js.native
  def one(events: String, selector: js.UndefOr[scala.Nothing], data: js.Any, callback: EventCallback): this.type = js.native
  def one(events: String, selector: String, callback: EventCallback): this.type = js.native
  def one(events: String, selector: String, data: js.Any, callback: EventCallback): this.type = js.native
  def one(events: String, selector: Null, data: js.Any, callback: EventCallback): this.type = js.native
  def one(events: Record[String, EventCallback]): this.type = js.native
  def one(events: Record[String, EventCallback], data: js.Any): this.type = js.native
  def one(events: Record[String, EventCallback], selector: js.UndefOr[scala.Nothing], data: js.Any): this.type = js.native
  def one(events: Record[String, EventCallback], selector: String): this.type = js.native
  def one(events: Record[String, EventCallback], selector: String, data: js.Any): this.type = js.native
  def one(events: Record[String, EventCallback], selector: Null, data: js.Any): this.type = js.native
  
  def outerHeight(): Double = js.native
  def outerHeight(includeMargins: Boolean): Double = js.native
  
  def outerWidth(): Double = js.native
  def outerWidth(includeMargins: Boolean): Double = js.native
  
  def parent(): Cash = js.native
  def parent(comparator: Comparator): Cash = js.native
  
  def parents(): Cash = js.native
  def parents(comparator: js.UndefOr[Comparator], _until: Comparator): Cash = js.native
  def parents(comparator: Comparator): Cash = js.native
  
  def parentsUntil(): Cash = js.native
  def parentsUntil(until: js.UndefOr[Comparator], comparator: Comparator): Cash = js.native
  def parentsUntil(until: Comparator): Cash = js.native
  
  def position(): js.UndefOr[Left] = js.native
  
  def prepend(selectors: Selector*): this.type = js.native
  
  def prependTo(selector: Selector): this.type = js.native
  
  def prev(): Cash = js.native
  def prev(comparator: js.UndefOr[Comparator], _all: js.UndefOr[scala.Nothing], _until: Comparator): Cash = js.native
  def prev(comparator: js.UndefOr[Comparator], _all: Boolean): Cash = js.native
  def prev(comparator: js.UndefOr[Comparator], _all: Boolean, _until: Comparator): Cash = js.native
  def prev(comparator: Comparator): Cash = js.native
  
  def prevAll(): Cash = js.native
  def prevAll(comparator: Comparator): Cash = js.native
  
  def prevUntil(): Cash = js.native
  def prevUntil(until: js.UndefOr[Comparator], comparator: Comparator): Cash = js.native
  def prevUntil(until: Comparator): Cash = js.native
  
  def prop(prop: String): js.Any = js.native
  def prop(prop: String, value: js.Any): this.type = js.native
  def prop(props: Record[String, _]): this.type = js.native
  
  def ready(callback: js.Function): this.type = js.native
  
  def remove(): this.type = js.native
  def remove(comparator: Comparator): this.type = js.native
  
  def removeAttr(attrs: String): this.type = js.native
  
  def removeClass(): this.type = js.native
  def removeClass(classes: String): this.type = js.native
  
  def removeProp(prop: String): this.type = js.native
  
  def replaceAll(selector: Selector): this.type = js.native
  
  def replaceWith(selector: Selector): this.type = js.native
  
  def serialize(): String = js.native
  
  def show(): this.type = js.native
  
  def siblings(): Cash = js.native
  def siblings(comparator: Comparator): Cash = js.native
  
  def slice(): Cash = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Cash = js.native
  def slice(start: Double): Cash = js.native
  def slice(start: Double, end: Double): Cash = js.native
  
  def splice(start: Double): js.Array[EleLoose] = js.native
  def splice(start: Double, deleteCount: Double): js.Array[EleLoose] = js.native
  def splice(start: Double, deleteCount: Double, items: Ele*): js.Array[EleLoose] = js.native
  
  def text(): String = js.native
  def text(text: String): this.type = js.native
  
  def toggle(): this.type = js.native
  def toggle(force: Boolean): this.type = js.native
  
  def toggleClass(classes: String): this.type = js.native
  def toggleClass(classes: String, force: Boolean): this.type = js.native
  
  def trigger(event: String): this.type = js.native
  def trigger(event: String, data: js.Any): this.type = js.native
  def trigger(event: Event): this.type = js.native
  def trigger(event: Event, data: js.Any): this.type = js.native
  
  def unwrap(): this.type = js.native
  
  def `val`(): String | js.Array[String] = js.native
  def `val`(value: String): this.type = js.native
  def `val`(value: js.Array[String]): this.type = js.native
  
  def width(): Double = js.native
  def width(value: String): this.type = js.native
  def width(value: Double): this.type = js.native
  
  def wrap(): this.type = js.native
  def wrap(selector: Selector): this.type = js.native
  
  def wrapAll(): this.type = js.native
  def wrapAll(selector: Selector): this.type = js.native
  
  def wrapInner(): this.type = js.native
  def wrapInner(selector: Selector): this.type = js.native
}
