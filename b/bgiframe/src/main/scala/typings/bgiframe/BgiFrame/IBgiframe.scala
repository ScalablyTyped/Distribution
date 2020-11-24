package typings.bgiframe.BgiFrame

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBgiframe extends js.Object {
  
  def createIframe(): HTMLElement = js.native
  
  def fire(element: HTMLElement): Unit = js.native
  
  def getIframe(element: HTMLElement): HTMLElement = js.native
  
  def prop(n: js.Any): String = js.native
  
  var s: ISettings = js.native
}
object IBgiframe {
  
  @scala.inline
  def apply(
    createIframe: () => HTMLElement,
    fire: HTMLElement => Unit,
    getIframe: HTMLElement => HTMLElement,
    prop: js.Any => String,
    s: ISettings
  ): IBgiframe = {
    val __obj = js.Dynamic.literal(createIframe = js.Any.fromFunction0(createIframe), fire = js.Any.fromFunction1(fire), getIframe = js.Any.fromFunction1(getIframe), prop = js.Any.fromFunction1(prop), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBgiframe]
  }
  
  @scala.inline
  implicit class IBgiframeOps[Self <: IBgiframe] (val x: Self) extends AnyVal {
    
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
    def setCreateIframe(value: () => HTMLElement): Self = this.set("createIframe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFire(value: HTMLElement => Unit): Self = this.set("fire", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIframe(value: HTMLElement => HTMLElement): Self = this.set("getIframe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProp(value: js.Any => String): Self = this.set("prop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setS(value: ISettings): Self = this.set("s", value.asInstanceOf[js.Any])
  }
}
