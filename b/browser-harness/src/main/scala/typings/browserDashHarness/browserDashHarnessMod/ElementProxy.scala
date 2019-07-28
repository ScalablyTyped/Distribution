package typings.browserDashHarness.browserDashHarnessMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementProxy extends js.Object {
  def addClass(className: String): ElementProxy = js.native
  def addClass(className: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def attr(name: String): ElementProxy = js.native
  def attr(name: String, value: String): ElementProxy = js.native
  def attr(
    name: String,
    value: String,
    callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]
  ): ElementProxy = js.native
  def blur(): ElementProxy = js.native
  def blur(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def children(): ElementProxy = js.native
  def children(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def click(): ElementProxy = js.native
  def click(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def closest(): ElementProxy = js.native
  def closest(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def contents(): ElementProxy = js.native
  def contents(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def css(name: String): ElementProxy = js.native
  def css(name: String, value: String): ElementProxy = js.native
  def css(
    name: String,
    value: String,
    callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]
  ): ElementProxy = js.native
  def data(name: String): ElementProxy = js.native
  def data(name: String, value: js.Any): ElementProxy = js.native
  def data(
    name: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]
  ): ElementProxy = js.native
  def filter(selector: js.Any): ElementProxy = js.native
  def filter(selector: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def find(selector: String): ElementProxy = js.native
  def find(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def findElement(selector: String): ElementProxy = js.native
  def findElement(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def findElements(selector: String): ElementProxy = js.native
  def findElements(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def findVisible(selector: String): ElementProxy = js.native
  def findVisible(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def findVisibles(selector: String): ElementProxy = js.native
  def findVisibles(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def first(): ElementProxy = js.native
  def first(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def focus(): ElementProxy = js.native
  def focus(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def has(arg: js.Any): ElementProxy = js.native
  def has(arg: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def hasClass(className: String): ElementProxy = js.native
  def hasClass(className: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def height(): ElementProxy = js.native
  def height(value: js.Any): ElementProxy = js.native
  def height(value: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def hide(): ElementProxy = js.native
  def hide(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def html(): ElementProxy = js.native
  def html(value: String): ElementProxy = js.native
  def html(value: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def innerHeight(): ElementProxy = js.native
  def innerHeight(value: js.Any): ElementProxy = js.native
  def innerHeight(value: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def innerWidth(): ElementProxy = js.native
  def innerWidth(value: js.Any): ElementProxy = js.native
  def innerWidth(value: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def is(arg: js.Any): ElementProxy = js.native
  def is(arg: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def isActionable(): ElementProxy = js.native
  def isActionable(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def last(): ElementProxy = js.native
  def last(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def next(): ElementProxy = js.native
  def next(selector: String): ElementProxy = js.native
  def next(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def nextAll(): ElementProxy = js.native
  def nextAll(selector: String): ElementProxy = js.native
  def nextAll(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def nextUntil(): ElementProxy = js.native
  def nextUntil(selector: String): ElementProxy = js.native
  def nextUntil(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def offset(): ElementProxy = js.native
  def offset(value: js.Any): ElementProxy = js.native
  def offset(value: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def offsetParent(): ElementProxy = js.native
  def offsetParent(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def outerHeight(): ElementProxy = js.native
  def outerHeight(value: js.Any): ElementProxy = js.native
  def outerHeight(value: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def outerWidth(): ElementProxy = js.native
  def outerWidth(value: js.Any): ElementProxy = js.native
  def outerWidth(value: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def parent(): ElementProxy = js.native
  def parent(selector: String): ElementProxy = js.native
  def parent(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def parents(): ElementProxy = js.native
  def parents(selector: String): ElementProxy = js.native
  def parents(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def parentsUntil(): ElementProxy = js.native
  def parentsUntil(selector: String): ElementProxy = js.native
  def parentsUntil(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def position(): ElementProxy = js.native
  def position(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def prev(): ElementProxy = js.native
  def prev(selector: String): ElementProxy = js.native
  def prev(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def prevAll(): ElementProxy = js.native
  def prevAll(selector: String): ElementProxy = js.native
  def prevAll(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def prevUntil(): ElementProxy = js.native
  def prevUntil(selector: String): ElementProxy = js.native
  def prevUntil(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def prop(name: String): ElementProxy = js.native
  def prop(name: String, value: String): ElementProxy = js.native
  def prop(
    name: String,
    value: String,
    callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]
  ): ElementProxy = js.native
  def removeAttr(name: String): ElementProxy = js.native
  def removeAttr(name: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def removeClass(className: String): ElementProxy = js.native
  def removeClass(className: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def removeData(name: String): ElementProxy = js.native
  def removeData(name: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def removeProp(name: String): ElementProxy = js.native
  def removeProp(name: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def scrollLeft(): ElementProxy = js.native
  def scrollLeft(value: Double): ElementProxy = js.native
  def scrollLeft(value: Double, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def scrollTop(): ElementProxy = js.native
  def scrollTop(value: Double): ElementProxy = js.native
  def scrollTop(value: Double, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def show(): ElementProxy = js.native
  def show(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def siblings(): ElementProxy = js.native
  def siblings(selector: String): ElementProxy = js.native
  def siblings(selector: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def text(): ElementProxy = js.native
  def text(value: String): ElementProxy = js.native
  def text(value: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def toggle(): ElementProxy = js.native
  def toggle(callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def toggleClass(className: String): ElementProxy = js.native
  def toggleClass(className: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def trigger(event: String): ElementProxy = js.native
  def trigger(event: String, extraParameters: js.Any): ElementProxy = js.native
  def trigger(
    event: String,
    extraParameters: js.Any,
    callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]
  ): ElementProxy = js.native
  def triggerHandler(event: String): ElementProxy = js.native
  def triggerHandler(event: String, extraParameters: js.Any): ElementProxy = js.native
  def triggerHandler(
    event: String,
    extraParameters: js.Any,
    callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]
  ): ElementProxy = js.native
  def `val`(): ElementProxy = js.native
  def `val`(value: String): ElementProxy = js.native
  def `val`(value: String, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
  def width(): ElementProxy = js.native
  def width(value: js.Any): ElementProxy = js.native
  def width(value: js.Any, callback: js.Function2[/* err */ Error, /* element */ this.type, Unit]): ElementProxy = js.native
}

