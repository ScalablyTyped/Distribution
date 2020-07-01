package typings.bumblebeeHotword.mod

import typings.std.AnalyserNode
import typings.std.Error
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceProcessor extends js.Object {
  def start(
    engines: js.Array[VoiceEngine],
    volume: Double,
    downsamplerScript: String,
    errorCallback: js.Function1[/* e */ Error, Unit],
    audioProcessCallback: js.Function1[/* data */ js.Any, Unit],
    audioContextCallback: js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]
  ): Unit
  def stop(): Unit
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
}

