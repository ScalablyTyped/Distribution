package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaLabel extends js.Object {
  
  def addEventListener(event: String, handler: Callback): Unit = js.native
  
  def getAltitude(): Double = js.native
  
  def getContent(): String = js.native
  
  def getPosition(): Point = js.native
  
  def getPov(): PanoramaPov = js.native
  
  def hide(): Unit = js.native
  
  def onclick(event: Target): Unit = js.native
  
  def onmouseout(event: Target): Unit = js.native
  
  def onmouseover(event: Target): Unit = js.native
  
  def onremove(event: Target): Unit = js.native
  
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  
  def setAltitude(altitude: Double): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  
  def setPosition(position: Point): Unit = js.native
  
  def show(): Unit = js.native
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
  
  @scala.inline
  implicit class PanoramaLabelOps[Self <: PanoramaLabel] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (String, Callback) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAltitude(value: () => Double): Self = this.set("getAltitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContent(value: () => String): Self = this.set("getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPov(value: () => PanoramaPov): Self = this.set("getPov", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnclick(value: Target => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseout(value: Target => Unit): Self = this.set("onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseover(value: Target => Unit): Self = this.set("onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnremove(value: Target => Unit): Self = this.set("onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, Callback) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAltitude(value: Double => Unit): Self = this.set("setAltitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosition(value: Point => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
