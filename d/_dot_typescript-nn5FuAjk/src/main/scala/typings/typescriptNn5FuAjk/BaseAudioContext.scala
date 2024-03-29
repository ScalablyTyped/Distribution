package typings.typescriptNn5FuAjk

import typings.std.AudioWorklet
import typings.std.ChannelMergerNode
import typings.std.ChannelSplitterNode
import typings.std.PeriodicWave
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAudioContext
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Available only in secure contexts. */
  val audioWorklet: AudioWorklet = js.native
  
  def createAnalyser(): AnalyserNode = js.native
  
  def createBiquadFilter(): BiquadFilterNode = js.native
  
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): AudioBuffer = js.native
  
  def createBufferSource(): AudioBufferSourceNode = js.native
  
  def createChannelMerger(): ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): ChannelMergerNode = js.native
  
  def createChannelSplitter(): ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): ChannelSplitterNode = js.native
  
  def createConstantSource(): ConstantSourceNode = js.native
  
  def createConvolver(): ConvolverNode = js.native
  
  def createDelay(): DelayNode = js.native
  def createDelay(maxDelayTime: Double): DelayNode = js.native
  
  def createDynamicsCompressor(): DynamicsCompressorNode = js.native
  
  def createGain(): GainNode = js.native
  
  def createIIRFilter(feedforward: Array[Double], feedback: Array[Double]): IIRFilterNode = js.native
  def createIIRFilter(feedforward: Iterable[Double], feedback: Iterable[Double]): IIRFilterNode = js.native
  
  def createOscillator(): OscillatorNode = js.native
  
  def createPanner(): PannerNode = js.native
  
  def createPeriodicWave(real: Array[Double], imag: Array[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: Array[Double], imag: Array[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Array[Double], imag: Float32Array): PeriodicWave = js.native
  def createPeriodicWave(real: Array[Double], imag: Float32Array, constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Array[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Array[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array): PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array, constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  def createPeriodicWave(real: Iterable[Double], imag: Iterable[Double]): PeriodicWave = js.native
  def createPeriodicWave(real: Iterable[Double], imag: Iterable[Double], constraints: PeriodicWaveConstraints): PeriodicWave = js.native
  
  /** @deprecated */
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  
  def createStereoPanner(): StereoPannerNode = js.native
  
  def createWaveShaper(): WaveShaperNode = js.native
  
  val currentTime: Double = js.native
  
  def decodeAudioData(audioData: ArrayBuffer): Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: Null, errorCallback: DecodeErrorCallback): Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: Unit, errorCallback: DecodeErrorCallback): Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback): Promise[AudioBuffer] = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback, errorCallback: DecodeErrorCallback): Promise[AudioBuffer] = js.native
  
  val destination: AudioDestinationNode = js.native
  
  val listener: AudioListener = js.native
  
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  val sampleRate: Double = js.native
  
  val state: AudioContextState = js.native
}
