package typings.bumblebeeHotword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceEngine extends js.Object {
  
  def processFrame(data: js.Any): Unit = js.native
}
object VoiceEngine {
  
  @scala.inline
  def apply(processFrame: js.Any => Unit): VoiceEngine = {
    val __obj = js.Dynamic.literal(processFrame = js.Any.fromFunction1(processFrame))
    __obj.asInstanceOf[VoiceEngine]
  }
  
  @scala.inline
  implicit class VoiceEngineOps[Self <: VoiceEngine] (val x: Self) extends AnyVal {
    
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
    def setProcessFrame(value: js.Any => Unit): Self = this.set("processFrame", js.Any.fromFunction1(value))
  }
}
