package typings.cashDom

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.cashDom.anon.Left
import typings.cashDom.cashDomBooleans.`true`
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cash-dom", JSImport.Default)
  @js.native
  val default: (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) with CashStatic = js.native
  
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
  
  @js.native
  trait CashStatic extends StObject {
    
    def each[T](arr: ArrayLike[T], callback: EachArrayCallback[T]): Unit = js.native
    def each[T](obj: PlainObject[T], callback: EachObjectCallback[T]): Unit = js.native
    
    def extend(): js.Any = js.native
    def extend(target: js.Any): (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) with CashStatic = js.native
    def extend(target: js.Any, sources: js.Any*): js.Any = js.native
    @JSName("extend")
    def extend_true(deep: `true`, target: js.Any, sources: js.Any*): js.Any = js.native
    
    var fn: Cash = js.native
    
    var guid: Double = js.native
    
    def isArray(x: js.Any): /* is std.Array<any> */ Boolean = js.native
    
    def isFunction(x: js.Any): /* is std.Function */ Boolean = js.native
    
    def isNumeric(x: js.Any): Boolean = js.native
    
    def isPlainObject(x: js.Any): /* is cash-dom.cash-dom.PlainObject<any> */ Boolean = js.native
    
    def isWindow(x: js.Any): /* is std.Window */ Boolean = js.native
    
    def parseHTML(html: String): js.Array[EleLoose] = js.native
    
    def unique[T](arr: ArrayLike[T]): ArrayLike[T] = js.native
  }
  
  type Comparator = String | Ele | Cash | (js.ThisFunction2[/* this */ EleLoose, /* index */ Double, /* ele */ EleLoose, Boolean])
  
  type Context = Document | HTMLElement | Element
  
  type EachArrayCallback[T] = js.ThisFunction2[/* this */ T, /* index */ Double, /* ele */ T, js.Any]
  
  type EachObjectCallback[T] = js.ThisFunction2[/* this */ T, /* key */ String, /* value */ T, js.Any]
  
  type Ele = Window | Document | HTMLElement | Element | Node
  
  type EleLoose = HTMLElement with Element with Node
  
  @js.native
  trait Event extends StObject {
    
    var ___cd: js.UndefOr[Boolean] = js.native
    
    var ___iblur: js.UndefOr[Boolean] = js.native
    
    var ___ifocus: js.UndefOr[Boolean] = js.native
    
    var ___ot: js.UndefOr[String] = js.native
    
    var ___td: js.UndefOr[Boolean] = js.native
    
    var data: js.Any = js.native
    
    var namespace: String = js.native
    
    var relatedTarget: js.UndefOr[Node | Null] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(data: js.Any, namespace: String): Event = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTarget(value: Node): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
      
      @scala.inline
      def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
      
      @scala.inline
      def set___cd(value: Boolean): Self = StObject.set(x, "___cd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set___cdUndefined: Self = StObject.set(x, "___cd", js.undefined)
      
      @scala.inline
      def set___iblur(value: Boolean): Self = StObject.set(x, "___iblur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set___iblurUndefined: Self = StObject.set(x, "___iblur", js.undefined)
      
      @scala.inline
      def set___ifocus(value: Boolean): Self = StObject.set(x, "___ifocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set___ifocusUndefined: Self = StObject.set(x, "___ifocus", js.undefined)
      
      @scala.inline
      def set___ot(value: String): Self = StObject.set(x, "___ot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set___otUndefined: Self = StObject.set(x, "___ot", js.undefined)
      
      @scala.inline
      def set___td(value: Boolean): Self = StObject.set(x, "___td", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set___tdUndefined: Self = StObject.set(x, "___td", js.undefined)
    }
  }
  
  @js.native
  trait EventCallback extends StObject {
    
    def apply(event: js.Any): js.Any = js.native
    def apply(event: js.Any, data: js.Any): js.Any = js.native
    
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
  
  type _To = (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) with CashStatic
  
  trait _falsy extends _Selector
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function2[/* selector */ js.UndefOr[Selector], /* context */ js.UndefOr[Context | Cash], Cash]) with CashStatic = default
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.cashDom.cashDomBooleans.`false`
    - typings.cashDom.cashDomNumbers.`0`
    - typings.cashDom.cashDomStrings._empty
  */
  type falsy = js.UndefOr[_falsy | Null]
}
