package typings.bumblebeeHotword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceEngine extends js.Object {
  def processFrame(data: js.Any): Unit
}

object VoiceEngine {
  @scala.inline
  def apply(processFrame: js.Any => Unit): VoiceEngine = {
    val __obj = js.Dynamic.literal(processFrame = js.Any.fromFunction1(processFrame))
    __obj.asInstanceOf[VoiceEngine]
  }
}

