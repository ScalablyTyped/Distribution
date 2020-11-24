package typings.chalkAnimation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  def frame(): String = js.native
  
  def render(): Unit = js.native
  
  def replace(text: String): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
object Animation {
  
  @scala.inline
  def apply(
    frame: () => String,
    render: () => Unit,
    replace: String => Unit,
    start: () => Unit,
    stop: () => Unit
  ): Animation = {
    val __obj = js.Dynamic.literal(frame = js.Any.fromFunction0(frame), render = js.Any.fromFunction0(render), replace = js.Any.fromFunction1(replace), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
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
    def setFrame(value: () => String): Self = this.set("frame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplace(value: String => Unit): Self = this.set("replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
