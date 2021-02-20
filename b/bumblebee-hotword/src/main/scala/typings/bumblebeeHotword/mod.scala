package typings.bumblebeeHotword

import typings.node.eventsMod.EventEmitter
import typings.std.AnalyserNode
import typings.std.Error
import typings.std.GainNode
import typings.std.HTMLCanvasElement
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bumblebee-hotword", JSImport.Namespace)
  @js.native
  class ^ () extends Bumblebee
  
  @JSImport("bumblebee-hotword", "SpectrumAnalyser")
  @js.native
  class SpectrumAnalyser protected () extends StObject {
    def this(analyser: AnalyserNode, canvas: HTMLCanvasElement) = this()
    
    def draw(): Unit = js.native
    
    def setBackgroundColor(bgColor: String): Unit = js.native
    
    def setColors(linecolor: String, bgcolor: String): Unit = js.native
    
    def setLineColor(linecolor: String): Unit = js.native
    
    def setMuted(muted: Boolean): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait Bumblebee extends EventEmitter {
    
    def addHotword(name: String): Unit = js.native
    def addHotword(name: String, data: js.UndefOr[scala.Nothing], sensitivity: Double): Unit = js.native
    def addHotword(name: String, data: Uint8Array): Unit = js.native
    def addHotword(name: String, data: Uint8Array, sensitivity: Double): Unit = js.native
    
    def audioAnalyserCallback(audioAnalyser: AnalyserNode, gainNode: GainNode): Unit = js.native
    
    def audioProcessCallback(data: js.Any, sampleRate: js.Any): Unit = js.native
    
    def detectionCallback(keyword: String): Unit = js.native
    
    def errorCallback(e: Error): Unit = js.native
    
    def setHotword(w: String): Unit = js.native
    
    def setMicVolume(vol: Double): Unit = js.native
    
    def setMuted(muted: Boolean): Unit = js.native
    
    def setSensitivity(s: Double): Unit = js.native
    
    def setVoiceProcessor(Proc: VoiceProcessor): Unit = js.native
    
    def setWorkersPath(path: String): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait VoiceEngine extends StObject {
    
    def processFrame(data: js.Any): Unit = js.native
  }
  object VoiceEngine {
    
    @scala.inline
    def apply(processFrame: js.Any => Unit): VoiceEngine = {
      val __obj = js.Dynamic.literal(processFrame = js.Any.fromFunction1(processFrame))
      __obj.asInstanceOf[VoiceEngine]
    }
    
    @scala.inline
    implicit class VoiceEngineMutableBuilder[Self <: VoiceEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessFrame(value: js.Any => Unit): Self = StObject.set(x, "processFrame", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait VoiceProcessor extends StObject {
    
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
    implicit class VoiceProcessorMutableBuilder[Self <: VoiceProcessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStart(
        value: (js.Array[VoiceEngine], Double, String, js.Function1[/* e */ Error, Unit], js.Function1[/* data */ js.Any, Unit], js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]) => Unit
      ): Self = StObject.set(x, "start", js.Any.fromFunction6(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
