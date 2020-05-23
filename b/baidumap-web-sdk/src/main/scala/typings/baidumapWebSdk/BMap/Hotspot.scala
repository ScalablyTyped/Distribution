package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotspot extends Overlay {
  def getPosition(): Point
  def getText(): String
  def getUserData(): js.Any
  def setPosition(position: Point): Unit
  def setText(text: String): Unit
  def setUserData(data: js.Any): Unit
}

object Hotspot {
  @scala.inline
  def apply(
    getPosition: () => Point,
    getText: () => String,
    getUserData: () => js.Any,
    setPosition: Point => Unit,
    setText: String => Unit,
    setUserData: js.Any => Unit,
    draw: () => Unit = null,
    hide: () => Unit = null,
    initialize: /* map */ Map => HTMLElement = null,
    isVisible: () => Boolean = null,
    show: () => Unit = null
  ): Hotspot = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), getText = js.Any.fromFunction0(getText), getUserData = js.Any.fromFunction0(getUserData), setPosition = js.Any.fromFunction1(setPosition), setText = js.Any.fromFunction1(setText), setUserData = js.Any.fromFunction1(setUserData))
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[Hotspot]
  }
}

