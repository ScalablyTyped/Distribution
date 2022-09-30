package typings.cashDom

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.cashDom.anon.Left
import typings.cashDom.cashDomBooleans.`true`
import typings.std.AddEventListenerOptions
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.IterableIterator
import typings.std.Node
import typings.std.NodeList
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cash-dom", JSImport.Default)
  @js.native
  val default: (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) & CashStatic = js.native
  
  @JSImport("cash-dom", "Cash")
  @js.native
  open class Cash ()
    extends StObject
       with /* index */ NumberDictionary[js.UndefOr[EleLoose]]
       with _Selector {
    def this(selector: Selector) = this()
    def this(selector: Unit, context: Cash) = this()
    def this(selector: Unit, context: Context) = this()
    def this(selector: Selector, context: Cash) = this()
    def this(selector: Selector, context: Context) = this()
    
    def add(selector: Selector): Cash = js.native
    def add(selector: Selector, context: Context): Cash = js.native
    
    def addClass(classes: String): this.type = js.native
    
    def after(selectors: Selector*): this.type = js.native
    
    def append(selectors: Selector*): this.type = js.native
    
    def appendTo(selector: Selector): this.type = js.native
    
    def attr(): Unit = js.native
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
    
    def data(): js.UndefOr[Record[String, Any]] = js.native
    def data(datas: Record[String, Any]): this.type = js.native
    def data(name: String): Any = js.native
    def data(name: String, value: Any): this.type = js.native
    
    def detach(): this.type = js.native
    def detach(comparator: Comparator): this.type = js.native
    
    def each(callback: EachArrayCallback[EleLoose]): this.type = js.native
    
    def empty(): this.type = js.native
    
    def eq(index: Double): Cash = js.native
    
    def extend(plugins: Record[Any, Any]): this.type = js.native
    
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
    def init(selector: Unit, context: Cash): Cash = js.native
    def init(selector: Unit, context: Context): Cash = js.native
    def init(selector: Selector): Cash = js.native
    def init(selector: Selector, context: Cash): Cash = js.native
    def init(selector: Selector, context: Context): Cash = js.native
    
    def innerHeight(): js.UndefOr[Double] = js.native
    
    def innerWidth(): js.UndefOr[Double] = js.native
    
    def insertAfter(selector: Selector): this.type = js.native
    
    def insertBefore(selector: Selector): this.type = js.native
    
    def is(): Boolean = js.native
    def is(comparator: Comparator): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[EleLoose]] = js.native
    
    def last(): Cash = js.native
    
    var length: Double = js.native
    
    def map(callback: MapCallback[EleLoose]): Cash = js.native
    
    def next(): Cash = js.native
    def next(comparator: Unit, _all: Boolean): Cash = js.native
    def next(comparator: Unit, _all: Boolean, _until: Comparator): Cash = js.native
    def next(comparator: Unit, _all: Unit, _until: Comparator): Cash = js.native
    def next(comparator: Comparator): Cash = js.native
    def next(comparator: Comparator, _all: Boolean): Cash = js.native
    def next(comparator: Comparator, _all: Boolean, _until: Comparator): Cash = js.native
    def next(comparator: Comparator, _all: Unit, _until: Comparator): Cash = js.native
    
    def nextAll(): Cash = js.native
    def nextAll(comparator: Comparator): Cash = js.native
    
    def nextUntil(): Cash = js.native
    def nextUntil(until: Unit, comparator: Comparator): Cash = js.native
    def nextUntil(until: Comparator): Cash = js.native
    def nextUntil(until: Comparator, comparator: Comparator): Cash = js.native
    
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
    def on(events: String, data: Any, callback: EventCallback): this.type = js.native
    def on(events: String, selector: String, callback: EventCallback): this.type = js.native
    def on(events: String, selector: String, data: Any, callback: EventCallback): this.type = js.native
    def on(events: String, selector: String, data: Any, callback: EventCallback, _one: Boolean): this.type = js.native
    def on(events: String, selector: Null, data: Any, callback: EventCallback): this.type = js.native
    def on(events: String, selector: Null, data: Any, callback: EventCallback, _one: Boolean): this.type = js.native
    def on(events: String, selector: Unit, data: Any, callback: EventCallback): this.type = js.native
    def on(events: String, selector: Unit, data: Any, callback: EventCallback, _one: Boolean): this.type = js.native
    def on(events: Record[String, EventCallback]): this.type = js.native
    def on(events: Record[String, EventCallback], data: Any): this.type = js.native
    def on(events: Record[String, EventCallback], selector: String): this.type = js.native
    def on(events: Record[String, EventCallback], selector: String, data: Any): this.type = js.native
    def on(events: Record[String, EventCallback], selector: Null, data: Any): this.type = js.native
    def on(events: Record[String, EventCallback], selector: Unit, data: Any): this.type = js.native
    
    def one(events: String, callback: EventCallback): this.type = js.native
    def one(events: String, data: Any, callback: EventCallback): this.type = js.native
    def one(events: String, selector: String, callback: EventCallback): this.type = js.native
    def one(events: String, selector: String, data: Any, callback: EventCallback): this.type = js.native
    def one(events: String, selector: Null, data: Any, callback: EventCallback): this.type = js.native
    def one(events: String, selector: Unit, data: Any, callback: EventCallback): this.type = js.native
    def one(events: Record[String, EventCallback]): this.type = js.native
    def one(events: Record[String, EventCallback], data: Any): this.type = js.native
    def one(events: Record[String, EventCallback], selector: String): this.type = js.native
    def one(events: Record[String, EventCallback], selector: String, data: Any): this.type = js.native
    def one(events: Record[String, EventCallback], selector: Null, data: Any): this.type = js.native
    def one(events: Record[String, EventCallback], selector: Unit, data: Any): this.type = js.native
    
    def outerHeight(): Double = js.native
    def outerHeight(includeMargins: Boolean): Double = js.native
    
    def outerWidth(): Double = js.native
    def outerWidth(includeMargins: Boolean): Double = js.native
    
    def parent(): Cash = js.native
    def parent(comparator: Comparator): Cash = js.native
    
    def parents(): Cash = js.native
    def parents(comparator: Unit, _until: Comparator): Cash = js.native
    def parents(comparator: Comparator): Cash = js.native
    def parents(comparator: Comparator, _until: Comparator): Cash = js.native
    
    def parentsUntil(): Cash = js.native
    def parentsUntil(until: Unit, comparator: Comparator): Cash = js.native
    def parentsUntil(until: Comparator): Cash = js.native
    def parentsUntil(until: Comparator, comparator: Comparator): Cash = js.native
    
    def position(): js.UndefOr[Left] = js.native
    
    def prepend(selectors: Selector*): this.type = js.native
    
    def prependTo(selector: Selector): this.type = js.native
    
    def prev(): Cash = js.native
    def prev(comparator: Unit, _all: Boolean): Cash = js.native
    def prev(comparator: Unit, _all: Boolean, _until: Comparator): Cash = js.native
    def prev(comparator: Unit, _all: Unit, _until: Comparator): Cash = js.native
    def prev(comparator: Comparator): Cash = js.native
    def prev(comparator: Comparator, _all: Boolean): Cash = js.native
    def prev(comparator: Comparator, _all: Boolean, _until: Comparator): Cash = js.native
    def prev(comparator: Comparator, _all: Unit, _until: Comparator): Cash = js.native
    
    def prevAll(): Cash = js.native
    def prevAll(comparator: Comparator): Cash = js.native
    
    def prevUntil(): Cash = js.native
    def prevUntil(until: Unit, comparator: Comparator): Cash = js.native
    def prevUntil(until: Comparator): Cash = js.native
    def prevUntil(until: Comparator, comparator: Comparator): Cash = js.native
    
    def prop(prop: String): Any = js.native
    def prop(prop: String, value: Any): this.type = js.native
    def prop(props: Record[String, Any]): this.type = js.native
    
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
    def slice(start: Double): Cash = js.native
    def slice(start: Double, end: Double): Cash = js.native
    def slice(start: Unit, end: Double): Cash = js.native
    
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
    def trigger(event: String, data: Any): this.type = js.native
    def trigger(event: Event): this.type = js.native
    def trigger(event: Event, data: Any): this.type = js.native
    
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
  
  @js.native
  trait CashStatic extends StObject {
    
    def each[T](arr: ArrayLike[T], callback: EachArrayCallback[T]): Unit = js.native
    def each[T](obj: PlainObject[T], callback: EachObjectCallback[T]): Unit = js.native
    
    def extend(): Any = js.native
    def extend(target: Any): (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) & CashStatic = js.native
    def extend(target: Any, sources: Any*): Any = js.native
    @JSName("extend")
    def extend_true(deep: `true`, target: Any, sources: Any*): Any = js.native
    
    var fn: Cash = js.native
    
    var guid: Double = js.native
    
    def isArray(x: Any): /* is std.Array<any> */ Boolean = js.native
    
    def isFunction(x: Any): /* is std.Function */ Boolean = js.native
    
    def isNumeric(x: Any): Boolean = js.native
    
    def isPlainObject(x: Any): /* is cash-dom.cash-dom.PlainObject<any> */ Boolean = js.native
    
    def isWindow(x: Any): /* is std.Window */ Boolean = js.native
    
    def parseHTML(html: String): js.Array[EleLoose] = js.native
    
    def unique[T](arr: ArrayLike[T]): ArrayLike[T] = js.native
  }
  
  type Comparator = String | Ele | Cash | (js.ThisFunction2[/* this */ EleLoose, /* index */ Double, /* ele */ EleLoose, Boolean])
  
  type Context = Document | HTMLElement | Element
  
  type EachArrayCallback[T] = js.ThisFunction2[/* this */ T, /* index */ Double, /* ele */ T, Any]
  
  type EachObjectCallback[T] = js.ThisFunction2[/* this */ T, /* key */ String, /* value */ T, Any]
  
  type Ele = Window | Document | HTMLElement | Element | Node
  
  @js.native
  trait EleLoose
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  trait Event extends StObject {
    
    var ___iblur: js.UndefOr[Boolean] = js.undefined
    
    var ___ifocus: js.UndefOr[Boolean] = js.undefined
    
    var ___ot: js.UndefOr[String] = js.undefined
    
    var ___td: js.UndefOr[Boolean] = js.undefined
    
    var data: Any
    
    var namespace: String
    
    var relatedTarget: js.UndefOr[Node | Null] = js.undefined
  }
  object Event {
    
    inline def apply(data: Any, namespace: String): Event = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setRelatedTarget(value: Node): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
      
      inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
      
      inline def set___iblur(value: Boolean): Self = StObject.set(x, "___iblur", value.asInstanceOf[js.Any])
      
      inline def set___iblurUndefined: Self = StObject.set(x, "___iblur", js.undefined)
      
      inline def set___ifocus(value: Boolean): Self = StObject.set(x, "___ifocus", value.asInstanceOf[js.Any])
      
      inline def set___ifocusUndefined: Self = StObject.set(x, "___ifocus", js.undefined)
      
      inline def set___ot(value: String): Self = StObject.set(x, "___ot", value.asInstanceOf[js.Any])
      
      inline def set___otUndefined: Self = StObject.set(x, "___ot", js.undefined)
      
      inline def set___td(value: Boolean): Self = StObject.set(x, "___td", value.asInstanceOf[js.Any])
      
      inline def set___tdUndefined: Self = StObject.set(x, "___td", js.undefined)
    }
  }
  
  @js.native
  trait EventCallback extends StObject {
    
    def apply(event: Any): Any = js.native
    def apply(event: Any, data: Any): Any = js.native
    
    var guid: js.UndefOr[Double] = js.native
  }
  
  type MapCallback[T] = js.ThisFunction2[/* this */ T, /* index */ Double, /* ele */ T, Ele]
  
  type PlainObject[T] = Record[String, T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cashDom.mod.falsy
    - java.lang.String
    - js.Function
    - typings.std.HTMLCollection
    - typings.std.NodeList
    - typings.cashDom.mod.Ele
    - js.Array[typings.cashDom.mod.Ele]
    - typings.std.ArrayLike[typings.cashDom.mod.Ele]
    - typings.cashDom.mod.Cash
  */
  type Selector = js.UndefOr[
    _Selector | js.Array[Ele] | ArrayLike[Ele] | String | js.Function | HTMLCollection | NodeList | Ele | Null
  ]
  
  trait _Selector extends StObject
  
  type _To = (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) & CashStatic
  
  trait _falsy
    extends StObject
       with _Selector
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) & CashStatic = default
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - scala.Null
    - typings.cashDom.cashDomBooleans.`false`
    - typings.cashDom.cashDomInts.`0`
    - typings.cashDom.cashDomStrings._empty
  */
  type falsy = js.UndefOr[_falsy | Null]
}
