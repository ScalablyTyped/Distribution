package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Target
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundOverlay extends Overlay {
  def getBounds(): Bounds
  def getDispalyOnMaxLevel(): Double
  def getDisplayOnMinLevel(): Double
  def getImageURL(): String
  def getOpacity(): Double
  def onclick(event: Target): Unit
  def ondblclick(event: Target): Unit
  def setBounds(bounds: Bounds): Unit
  def setDispalyOnMaxLevel(level: Double): Unit
  def setDisplayOnMinLevel(level: Double): Unit
  def setImageURL(url: String): Unit
  def setOpacity(opcity: Double): Unit
}

object GroundOverlay {
  @scala.inline
  def apply(
    getBounds: () => Bounds,
    getDispalyOnMaxLevel: () => Double,
    getDisplayOnMinLevel: () => Double,
    getImageURL: () => String,
    getOpacity: () => Double,
    onclick: Target => Unit,
    ondblclick: Target => Unit,
    setBounds: Bounds => Unit,
    setDispalyOnMaxLevel: Double => Unit,
    setDisplayOnMinLevel: Double => Unit,
    setImageURL: String => Unit,
    setOpacity: Double => Unit,
    draw: () => Unit = null,
    hide: () => Unit = null,
    initialize: /* map */ Map => HTMLElement = null,
    isVisible: () => Boolean = null,
    show: () => Unit = null
  ): GroundOverlay = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getDispalyOnMaxLevel = js.Any.fromFunction0(getDispalyOnMaxLevel), getDisplayOnMinLevel = js.Any.fromFunction0(getDisplayOnMinLevel), getImageURL = js.Any.fromFunction0(getImageURL), getOpacity = js.Any.fromFunction0(getOpacity), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), setBounds = js.Any.fromFunction1(setBounds), setDispalyOnMaxLevel = js.Any.fromFunction1(setDispalyOnMaxLevel), setDisplayOnMinLevel = js.Any.fromFunction1(setDisplayOnMinLevel), setImageURL = js.Any.fromFunction1(setImageURL), setOpacity = js.Any.fromFunction1(setOpacity))
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[GroundOverlay]
  }
}

