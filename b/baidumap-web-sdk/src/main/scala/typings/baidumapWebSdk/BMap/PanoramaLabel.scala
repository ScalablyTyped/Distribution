package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLabel extends js.Object {
  def addEventListener(event: String, handler: Callback): Unit
  def getAltitude(): Double
  def getContent(): String
  def getPosition(): Point
  def getPov(): PanoramaPov
  def hide(): Unit
  def onclick(event: Target): Unit
  def onmouseout(event: Target): Unit
  def onmouseover(event: Target): Unit
  def onremove(event: Target): Unit
  def removeEventListener(event: String, handler: Callback): Unit
  def setAltitude(altitude: Double): Unit
  def setContent(content: String): Unit
  def setPosition(position: Point): Unit
  def show(): Unit
}

object PanoramaLabel {
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    getAltitude: () => Double,
    getContent: () => String,
    getPosition: () => Point,
    getPov: () => PanoramaPov,
    hide: () => Unit,
    onclick: Target => Unit,
    onmouseout: Target => Unit,
    onmouseover: Target => Unit,
    onremove: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setAltitude: Double => Unit,
    setContent: String => Unit,
    setPosition: Point => Unit,
    show: () => Unit
  ): PanoramaLabel = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getAltitude = js.Any.fromFunction0(getAltitude), getContent = js.Any.fromFunction0(getContent), getPosition = js.Any.fromFunction0(getPosition), getPov = js.Any.fromFunction0(getPov), hide = js.Any.fromFunction0(hide), onclick = js.Any.fromFunction1(onclick), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onremove = js.Any.fromFunction1(onremove), removeEventListener = js.Any.fromFunction2(removeEventListener), setAltitude = js.Any.fromFunction1(setAltitude), setContent = js.Any.fromFunction1(setContent), setPosition = js.Any.fromFunction1(setPosition), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PanoramaLabel]
  }
}

