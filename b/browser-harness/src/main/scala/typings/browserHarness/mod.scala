package typings.browserHarness

import typings.browserHarness.anon.Args
import typings.browserHarness.anon.Condition
import typings.browserHarness.anon.Func
import typings.browserHarness.browserHarnessStrings.consoleDoterror
import typings.browserHarness.browserHarnessStrings.consoleDotlog
import typings.browserHarness.browserHarnessStrings.consoleDotwarn
import typings.browserHarness.browserHarnessStrings.ready
import typings.browserHarness.browserHarnessStrings.windowDotonerror
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-harness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("browser-harness", "Browser")
  @js.native
  open class Browser protected () extends StObject {
    //constructor(args: { type: string; location?: string; args?: string[] });
    def this(args: Args) = this()
    
    def close(): Any = js.native
    
    def open(harnessUrl: String): Any = js.native
    def open(harnessUrl: String, serverUrl: String): Any = js.native
  }
  
  object config {
    
    @JSImport("browser-harness", "config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("browser-harness", "config.retryMS")
    @js.native
    def retryMS: Double = js.native
    inline def retryMS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("retryMS")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-harness", "config.timeoutMS")
    @js.native
    def timeoutMS: Double = js.native
    inline def timeoutMS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeoutMS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("browser-harness", "events")
  @js.native
  def events: HarnessEvents = js.native
  inline def events_=(x: HarnessEvents): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  
  inline def listen(port: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def listen(port: Double, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @js.native
  trait Driver extends StObject {
    
    var events: DriverEvents = js.native
    
    def exec(args: Func): Any = js.native
    def exec(args: Func, callback: js.Function): Any = js.native
    def exec(func: js.Function): Any = js.native
    def exec(func: js.Function, callback: js.Function): Any = js.native
    
    def find(selector: String): ElementProxy = js.native
    def find(selector: String, callback: js.Function2[/* err */ js.Error, /* elements */ ElementProxy, Unit]): ElementProxy = js.native
    
    def findElement(selector: String): ElementProxy = js.native
    def findElement(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ ElementProxy, Unit]): ElementProxy = js.native
    
    def findElements(selector: String): ElementProxy = js.native
    def findElements(selector: String, callback: js.Function2[/* err */ js.Error, /* elements */ ElementProxy, Unit]): ElementProxy = js.native
    
    def findVisible(selector: String): ElementProxy = js.native
    def findVisible(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ ElementProxy, Unit]): ElementProxy = js.native
    
    def findVisibles(selector: String): ElementProxy = js.native
    def findVisibles(selector: String, callback: js.Function2[/* err */ js.Error, /* elements */ ElementProxy, Unit]): ElementProxy = js.native
    
    def setUrl(url: String): Any = js.native
    def setUrl(url: String, callback: js.Function): Any = js.native
    
    def waitFor(args: Condition): Any = js.native
    def waitFor(args: Condition, callback: js.Function): Any = js.native
    def waitFor(condition: js.Function): Any = js.native
    def waitFor(condition: js.Function, callback: js.Function): Any = js.native
  }
  
  @js.native
  trait DriverEvents extends EventEmitter {
    
    @JSName("on")
    def on_consoleerror(event: consoleDoterror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_consolelog(event: consoleDotlog, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_consolewarn(event: consoleDotwarn, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_windowonerror(event: windowDotonerror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    
    @JSName("once")
    def once_consoleerror(event: consoleDoterror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_consolelog(event: consoleDotlog, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_consolewarn(event: consoleDotwarn, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_windowonerror(event: windowDotonerror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  }
  
  @js.native
  trait ElementProxy extends StObject {
    
    def addClass(className: String): ElementProxy = js.native
    def addClass(className: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def attr(name: String): ElementProxy = js.native
    def attr(name: String, value: String): ElementProxy = js.native
    def attr(
      name: String,
      value: String,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    def attr(
      name: String,
      value: Unit,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    
    def blur(): ElementProxy = js.native
    def blur(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def children(): ElementProxy = js.native
    def children(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def click(): ElementProxy = js.native
    def click(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def closest(): ElementProxy = js.native
    def closest(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def contents(): ElementProxy = js.native
    def contents(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def css(name: String): ElementProxy = js.native
    def css(name: String, value: String): ElementProxy = js.native
    def css(
      name: String,
      value: String,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    def css(
      name: String,
      value: Unit,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    
    def data(name: String): ElementProxy = js.native
    def data(name: String, value: Any): ElementProxy = js.native
    def data(
      name: String,
      value: Any,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    def data(
      name: String,
      value: Unit,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    
    def filter(selector: Any): ElementProxy = js.native
    def filter(selector: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def find(selector: String): ElementProxy = js.native
    def find(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def findElement(selector: String): ElementProxy = js.native
    def findElement(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def findElements(selector: String): ElementProxy = js.native
    def findElements(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def findVisible(selector: String): ElementProxy = js.native
    def findVisible(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def findVisibles(selector: String): ElementProxy = js.native
    def findVisibles(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def first(): ElementProxy = js.native
    def first(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def focus(): ElementProxy = js.native
    def focus(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def has(arg: Any): ElementProxy = js.native
    def has(arg: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def hasClass(className: String): ElementProxy = js.native
    def hasClass(className: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def height(): ElementProxy = js.native
    def height(value: Any): ElementProxy = js.native
    def height(value: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def height(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def hide(): ElementProxy = js.native
    def hide(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def html(): ElementProxy = js.native
    def html(value: String): ElementProxy = js.native
    def html(value: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def html(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def innerHeight(): ElementProxy = js.native
    def innerHeight(value: Any): ElementProxy = js.native
    def innerHeight(value: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def innerHeight(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def innerWidth(): ElementProxy = js.native
    def innerWidth(value: Any): ElementProxy = js.native
    def innerWidth(value: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def innerWidth(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def is(arg: Any): ElementProxy = js.native
    def is(arg: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def isActionable(): ElementProxy = js.native
    def isActionable(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def last(): ElementProxy = js.native
    def last(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def next(): ElementProxy = js.native
    def next(selector: String): ElementProxy = js.native
    def next(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def next(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def nextAll(): ElementProxy = js.native
    def nextAll(selector: String): ElementProxy = js.native
    def nextAll(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def nextAll(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def nextUntil(): ElementProxy = js.native
    def nextUntil(selector: String): ElementProxy = js.native
    def nextUntil(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def nextUntil(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def offset(): ElementProxy = js.native
    def offset(value: Any): ElementProxy = js.native
    def offset(value: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def offset(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def offsetParent(): ElementProxy = js.native
    def offsetParent(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def outerHeight(): ElementProxy = js.native
    def outerHeight(value: Any): ElementProxy = js.native
    def outerHeight(value: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def outerHeight(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def outerWidth(): ElementProxy = js.native
    def outerWidth(value: Any): ElementProxy = js.native
    def outerWidth(value: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def outerWidth(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def parent(): ElementProxy = js.native
    def parent(selector: String): ElementProxy = js.native
    def parent(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def parent(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def parents(): ElementProxy = js.native
    def parents(selector: String): ElementProxy = js.native
    def parents(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def parents(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def parentsUntil(): ElementProxy = js.native
    def parentsUntil(selector: String): ElementProxy = js.native
    def parentsUntil(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def parentsUntil(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def position(): ElementProxy = js.native
    def position(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def prev(): ElementProxy = js.native
    def prev(selector: String): ElementProxy = js.native
    def prev(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def prev(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def prevAll(): ElementProxy = js.native
    def prevAll(selector: String): ElementProxy = js.native
    def prevAll(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def prevAll(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def prevUntil(): ElementProxy = js.native
    def prevUntil(selector: String): ElementProxy = js.native
    def prevUntil(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def prevUntil(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def prop(name: String): ElementProxy = js.native
    def prop(name: String, value: String): ElementProxy = js.native
    def prop(
      name: String,
      value: String,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    def prop(
      name: String,
      value: Unit,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    
    def removeAttr(name: String): ElementProxy = js.native
    def removeAttr(name: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def removeClass(className: String): ElementProxy = js.native
    def removeClass(className: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def removeData(name: String): ElementProxy = js.native
    def removeData(name: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def removeProp(name: String): ElementProxy = js.native
    def removeProp(name: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def scrollLeft(): ElementProxy = js.native
    def scrollLeft(value: Double): ElementProxy = js.native
    def scrollLeft(value: Double, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def scrollLeft(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def scrollTop(): ElementProxy = js.native
    def scrollTop(value: Double): ElementProxy = js.native
    def scrollTop(value: Double, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def scrollTop(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def show(): ElementProxy = js.native
    def show(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def siblings(): ElementProxy = js.native
    def siblings(selector: String): ElementProxy = js.native
    def siblings(selector: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def siblings(selector: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def text(): ElementProxy = js.native
    def text(value: String): ElementProxy = js.native
    def text(value: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def text(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def toggle(): ElementProxy = js.native
    def toggle(callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def toggleClass(className: String): ElementProxy = js.native
    def toggleClass(className: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def trigger(event: String): ElementProxy = js.native
    def trigger(event: String, extraParameters: Any): ElementProxy = js.native
    def trigger(
      event: String,
      extraParameters: Any,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    def trigger(
      event: String,
      extraParameters: Unit,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    
    def triggerHandler(event: String): ElementProxy = js.native
    def triggerHandler(event: String, extraParameters: Any): ElementProxy = js.native
    def triggerHandler(
      event: String,
      extraParameters: Any,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    def triggerHandler(
      event: String,
      extraParameters: Unit,
      callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]
    ): ElementProxy = js.native
    
    def `val`(): ElementProxy = js.native
    def `val`(value: String): ElementProxy = js.native
    def `val`(value: String, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def `val`(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    
    def width(): ElementProxy = js.native
    def width(value: Any): ElementProxy = js.native
    def width(value: Any, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
    def width(value: Unit, callback: js.Function2[/* err */ js.Error, /* element */ this.type, Unit]): ElementProxy = js.native
  }
  
  @js.native
  trait HarnessEvents extends EventEmitter {
    
    @JSName("on")
    def on_ready(event: ready, listener: js.Function1[/* driver */ Driver, Unit]): this.type = js.native
    
    @JSName("once")
    def once_ready(event: ready, listener: js.Function1[/* driver */ Driver, Unit]): this.type = js.native
  }
}
