package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Target
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyline extends Overlay {
  def addEventListener(event: String, handler: Callback): Unit
  def disableEditing(): Unit
  def disableMassClear(): Unit
  def enableEditing(): Unit
  def enableMassClear(): Unit
  def getBounds(): Bounds
  def getFillColor(): String
  def getFillOpacity(): Double
  def getMap(): Map
  def getPath(): js.Array[Point]
  def getStrokeColor(): String
  def getStrokeOpacity(): Double
  def getStrokeStyle(): String
  def getStrokeWeight(): Double
  def onclick(event: Target): Unit
  def ondblclick(event: typings.baidumapWebSdk.anon.Pixel): Unit
  def onlineupdate(event: Target): Unit
  def onmousedown(event: typings.baidumapWebSdk.anon.Pixel): Unit
  def onmouseout(event: typings.baidumapWebSdk.anon.Pixel): Unit
  def onmouseover(event: typings.baidumapWebSdk.anon.Pixel): Unit
  def onmouseup(event: typings.baidumapWebSdk.anon.Pixel): Unit
  def onremove(event: Target): Unit
  def removeEventListener(event: String, handler: Callback): Unit
  def setFillColor(color: String): Unit
  def setFillOpacity(opacity: Double): Unit
  def setPath(path: js.Array[Point]): Unit
  def setPointAt(index: Double, point: Point): Unit
  def setPositionAt(index: Double, point: Point): Unit
  def setStrokeColor(color: String): Unit
  def setStrokeOpacity(opacity: Double): Unit
  def setStrokeStyle(style: String): Unit
  def setStrokeWeight(weight: Double): Unit
}

object Polyline {
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    disableEditing: () => Unit,
    disableMassClear: () => Unit,
    enableEditing: () => Unit,
    enableMassClear: () => Unit,
    getBounds: () => Bounds,
    getFillColor: () => String,
    getFillOpacity: () => Double,
    getMap: () => Map,
    getPath: () => js.Array[Point],
    getStrokeColor: () => String,
    getStrokeOpacity: () => Double,
    getStrokeStyle: () => String,
    getStrokeWeight: () => Double,
    onclick: Target => Unit,
    ondblclick: typings.baidumapWebSdk.anon.Pixel => Unit,
    onlineupdate: Target => Unit,
    onmousedown: typings.baidumapWebSdk.anon.Pixel => Unit,
    onmouseout: typings.baidumapWebSdk.anon.Pixel => Unit,
    onmouseover: typings.baidumapWebSdk.anon.Pixel => Unit,
    onmouseup: typings.baidumapWebSdk.anon.Pixel => Unit,
    onremove: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setFillColor: String => Unit,
    setFillOpacity: Double => Unit,
    setPath: js.Array[Point] => Unit,
    setPointAt: (Double, Point) => Unit,
    setPositionAt: (Double, Point) => Unit,
    setStrokeColor: String => Unit,
    setStrokeOpacity: Double => Unit,
    setStrokeStyle: String => Unit,
    setStrokeWeight: Double => Unit,
    draw: () => Unit = null,
    hide: () => Unit = null,
    initialize: /* map */ Map => HTMLElement = null,
    isVisible: () => Boolean = null,
    show: () => Unit = null
  ): Polyline = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), disableEditing = js.Any.fromFunction0(disableEditing), disableMassClear = js.Any.fromFunction0(disableMassClear), enableEditing = js.Any.fromFunction0(enableEditing), enableMassClear = js.Any.fromFunction0(enableMassClear), getBounds = js.Any.fromFunction0(getBounds), getFillColor = js.Any.fromFunction0(getFillColor), getFillOpacity = js.Any.fromFunction0(getFillOpacity), getMap = js.Any.fromFunction0(getMap), getPath = js.Any.fromFunction0(getPath), getStrokeColor = js.Any.fromFunction0(getStrokeColor), getStrokeOpacity = js.Any.fromFunction0(getStrokeOpacity), getStrokeStyle = js.Any.fromFunction0(getStrokeStyle), getStrokeWeight = js.Any.fromFunction0(getStrokeWeight), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), onlineupdate = js.Any.fromFunction1(onlineupdate), onmousedown = js.Any.fromFunction1(onmousedown), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onmouseup = js.Any.fromFunction1(onmouseup), onremove = js.Any.fromFunction1(onremove), removeEventListener = js.Any.fromFunction2(removeEventListener), setFillColor = js.Any.fromFunction1(setFillColor), setFillOpacity = js.Any.fromFunction1(setFillOpacity), setPath = js.Any.fromFunction1(setPath), setPointAt = js.Any.fromFunction2(setPointAt), setPositionAt = js.Any.fromFunction2(setPositionAt), setStrokeColor = js.Any.fromFunction1(setStrokeColor), setStrokeOpacity = js.Any.fromFunction1(setStrokeOpacity), setStrokeStyle = js.Any.fromFunction1(setStrokeStyle), setStrokeWeight = js.Any.fromFunction1(setStrokeWeight))
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[Polyline]
  }
}

