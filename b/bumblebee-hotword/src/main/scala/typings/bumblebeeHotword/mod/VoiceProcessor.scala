package typings.bumblebeeHotword.mod

import typings.std.AnalyserNode
import typings.std.Error
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceProcessor extends js.Object {
  def start(
    engines: js.Array[VoiceEngine],
    volume: Double,
    downsamplerScript: String,
    errorCallback: js.Function1[/* e */ Error, Unit],
    audioProcessCallback: js.Function1[/* data */ js.Any, Unit],
    audioContextCallback: js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]
  ): Unit = js.native
  def stop(): Unit = js.native
}

object VoiceProcessor {
  @scala.inline
  def apply(
    start: (js.Array[VoiceEngine], Double, String, js.Function1[/* e */ Error, Unit], js.Function1[/* data */ js.Any, Unit], js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]) => Unit,
    stop: () => Unit
  ): VoiceProcessor = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction6(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[VoiceProcessor]
  }
  @scala.inline
  implicit class VoiceProcessorOps[Self <: VoiceProcessor] (val x: Self) extends AnyVal {
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
    def setStart(
      value: (js.Array[VoiceEngine], Double, String, js.Function1[/* e */ Error, Unit], js.Function1[/* data */ js.Any, Unit], js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]) => Unit
    ): Self = this.set("start", js.Any.fromFunction6(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

