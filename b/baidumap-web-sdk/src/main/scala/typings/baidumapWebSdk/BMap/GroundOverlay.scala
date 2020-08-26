package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundOverlay extends Overlay {
  def getBounds(): Bounds = js.native
  def getDispalyOnMaxLevel(): Double = js.native
  def getDisplayOnMinLevel(): Double = js.native
  def getImageURL(): String = js.native
  def getOpacity(): Double = js.native
  def onclick(event: Target): Unit = js.native
  def ondblclick(event: Target): Unit = js.native
  def setBounds(bounds: Bounds): Unit = js.native
  def setDispalyOnMaxLevel(level: Double): Unit = js.native
  def setDisplayOnMinLevel(level: Double): Unit = js.native
  def setImageURL(url: String): Unit = js.native
  def setOpacity(opcity: Double): Unit = js.native
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
    setOpacity: Double => Unit
  ): GroundOverlay = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getDispalyOnMaxLevel = js.Any.fromFunction0(getDispalyOnMaxLevel), getDisplayOnMinLevel = js.Any.fromFunction0(getDisplayOnMinLevel), getImageURL = js.Any.fromFunction0(getImageURL), getOpacity = js.Any.fromFunction0(getOpacity), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), setBounds = js.Any.fromFunction1(setBounds), setDispalyOnMaxLevel = js.Any.fromFunction1(setDispalyOnMaxLevel), setDisplayOnMinLevel = js.Any.fromFunction1(setDisplayOnMinLevel), setImageURL = js.Any.fromFunction1(setImageURL), setOpacity = js.Any.fromFunction1(setOpacity))
    __obj.asInstanceOf[GroundOverlay]
  }
  @scala.inline
  implicit class GroundOverlayOps[Self <: GroundOverlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBounds(value: () => Bounds): Self = this.set("getBounds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDispalyOnMaxLevel(value: () => Double): Self = this.set("getDispalyOnMaxLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDisplayOnMinLevel(value: () => Double): Self = this.set("getDisplayOnMinLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetImageURL(value: () => String): Self = this.set("getImageURL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOpacity(value: () => Double): Self = this.set("getOpacity", js.Any.fromFunction0(value))
    @scala.inline
    def setOnclick(value: Target => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    @scala.inline
    def setOndblclick(value: Target => Unit): Self = this.set("ondblclick", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBounds(value: Bounds => Unit): Self = this.set("setBounds", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDispalyOnMaxLevel(value: Double => Unit): Self = this.set("setDispalyOnMaxLevel", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDisplayOnMinLevel(value: Double => Unit): Self = this.set("setDisplayOnMinLevel", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImageURL(value: String => Unit): Self = this.set("setImageURL", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOpacity(value: Double => Unit): Self = this.set("setOpacity", js.Any.fromFunction1(value))
  }
  
}

