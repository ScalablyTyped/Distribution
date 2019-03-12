package typings
package browserDashHarnessLib.browserDashHarnessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementProxy extends js.Object {
  def addClass(className: java.lang.String): ElementProxy = js.native
  def addClass(
    className: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def attr(name: java.lang.String): ElementProxy = js.native
  def attr(name: java.lang.String, value: java.lang.String): ElementProxy = js.native
  def attr(
    name: java.lang.String,
    value: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def blur(): ElementProxy = js.native
  def blur(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def children(): ElementProxy = js.native
  def children(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def click(): ElementProxy = js.native
  def click(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def closest(): ElementProxy = js.native
  def closest(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def contents(): ElementProxy = js.native
  def contents(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def css(name: java.lang.String): ElementProxy = js.native
  def css(name: java.lang.String, value: java.lang.String): ElementProxy = js.native
  def css(
    name: java.lang.String,
    value: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def data(name: java.lang.String): ElementProxy = js.native
  def data(name: java.lang.String, value: js.Any): ElementProxy = js.native
  def data(
    name: java.lang.String,
    value: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def filter(selector: js.Any): ElementProxy = js.native
  def filter(
    selector: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def find(selector: java.lang.String): ElementProxy = js.native
  def find(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def findElement(selector: java.lang.String): ElementProxy = js.native
  def findElement(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def findElements(selector: java.lang.String): ElementProxy = js.native
  def findElements(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def findVisible(selector: java.lang.String): ElementProxy = js.native
  def findVisible(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def findVisibles(selector: java.lang.String): ElementProxy = js.native
  def findVisibles(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def first(): ElementProxy = js.native
  def first(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def focus(): ElementProxy = js.native
  def focus(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def has(arg: js.Any): ElementProxy = js.native
  def has(arg: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def hasClass(className: java.lang.String): ElementProxy = js.native
  def hasClass(
    className: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def height(): ElementProxy = js.native
  def height(value: js.Any): ElementProxy = js.native
  def height(value: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def hide(): ElementProxy = js.native
  def hide(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def html(): ElementProxy = js.native
  def html(value: java.lang.String): ElementProxy = js.native
  def html(
    value: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def innerHeight(): ElementProxy = js.native
  def innerHeight(value: js.Any): ElementProxy = js.native
  def innerHeight(value: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def innerWidth(): ElementProxy = js.native
  def innerWidth(value: js.Any): ElementProxy = js.native
  def innerWidth(value: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def is(arg: js.Any): ElementProxy = js.native
  def is(arg: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def isActionable(): ElementProxy = js.native
  def isActionable(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def last(): ElementProxy = js.native
  def last(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def next(): ElementProxy = js.native
  def next(selector: java.lang.String): ElementProxy = js.native
  def next(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def nextAll(): ElementProxy = js.native
  def nextAll(selector: java.lang.String): ElementProxy = js.native
  def nextAll(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def nextUntil(): ElementProxy = js.native
  def nextUntil(selector: java.lang.String): ElementProxy = js.native
  def nextUntil(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def offset(): ElementProxy = js.native
  def offset(value: js.Any): ElementProxy = js.native
  def offset(value: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def offsetParent(): ElementProxy = js.native
  def offsetParent(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def outerHeight(): ElementProxy = js.native
  def outerHeight(value: js.Any): ElementProxy = js.native
  def outerHeight(value: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def outerWidth(): ElementProxy = js.native
  def outerWidth(value: js.Any): ElementProxy = js.native
  def outerWidth(value: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def parent(): ElementProxy = js.native
  def parent(selector: java.lang.String): ElementProxy = js.native
  def parent(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def parents(): ElementProxy = js.native
  def parents(selector: java.lang.String): ElementProxy = js.native
  def parents(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def parentsUntil(): ElementProxy = js.native
  def parentsUntil(selector: java.lang.String): ElementProxy = js.native
  def parentsUntil(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def position(): ElementProxy = js.native
  def position(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def prev(): ElementProxy = js.native
  def prev(selector: java.lang.String): ElementProxy = js.native
  def prev(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def prevAll(): ElementProxy = js.native
  def prevAll(selector: java.lang.String): ElementProxy = js.native
  def prevAll(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def prevUntil(): ElementProxy = js.native
  def prevUntil(selector: java.lang.String): ElementProxy = js.native
  def prevUntil(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def prop(name: java.lang.String): ElementProxy = js.native
  def prop(name: java.lang.String, value: java.lang.String): ElementProxy = js.native
  def prop(
    name: java.lang.String,
    value: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def removeAttr(name: java.lang.String): ElementProxy = js.native
  def removeAttr(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def removeClass(className: java.lang.String): ElementProxy = js.native
  def removeClass(
    className: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def removeData(name: java.lang.String): ElementProxy = js.native
  def removeData(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def removeProp(name: java.lang.String): ElementProxy = js.native
  def removeProp(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def scrollLeft(): ElementProxy = js.native
  def scrollLeft(value: scala.Double): ElementProxy = js.native
  def scrollLeft(
    value: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def scrollTop(): ElementProxy = js.native
  def scrollTop(value: scala.Double): ElementProxy = js.native
  def scrollTop(
    value: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def show(): ElementProxy = js.native
  def show(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def siblings(): ElementProxy = js.native
  def siblings(selector: java.lang.String): ElementProxy = js.native
  def siblings(
    selector: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def text(): ElementProxy = js.native
  def text(value: java.lang.String): ElementProxy = js.native
  def text(
    value: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def toggle(): ElementProxy = js.native
  def toggle(callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
  def toggleClass(className: java.lang.String): ElementProxy = js.native
  def toggleClass(
    className: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def trigger(event: java.lang.String): ElementProxy = js.native
  def trigger(event: java.lang.String, extraParameters: js.Any): ElementProxy = js.native
  def trigger(
    event: java.lang.String,
    extraParameters: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def triggerHandler(event: java.lang.String): ElementProxy = js.native
  def triggerHandler(event: java.lang.String, extraParameters: js.Any): ElementProxy = js.native
  def triggerHandler(
    event: java.lang.String,
    extraParameters: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def `val`(): ElementProxy = js.native
  def `val`(value: java.lang.String): ElementProxy = js.native
  def `val`(
    value: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]
  ): ElementProxy = js.native
  def width(): ElementProxy = js.native
  def width(value: js.Any): ElementProxy = js.native
  def width(value: js.Any, callback: js.Function2[/* err */ stdLib.Error, /* element */ this.type, scala.Unit]): ElementProxy = js.native
}

