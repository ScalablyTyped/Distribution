package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Width
import typings.babylonjs.anon.Y
import typings.std.AudioNode
import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyser extends js.Object {
  /**
    * Gets or sets the bar graph amplitude
    * @ignorenaming
    */
  var BARGRAPHAMPLITUDE: Double
  /**
    * Gets or sets the position of the debug canvas
    * @ignorenaming
    */
  var DEBUGCANVASPOS: Y
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  var DEBUGCANVASSIZE: Width
  /**
    * Gets or sets the FFT table size
    * @ignorenaming
    */
  var FFT_SIZE: Double
  /**
    * Gets or sets the smoothing
    * @ignorenaming
    */
  var SMOOTHING: Double
  var _audioEngine: js.Any
  var _byteFreqs: js.Any
  var _byteTime: js.Any
  var _debugCanvas: js.Any
  var _debugCanvasContext: js.Any
  var _floatFreqs: js.Any
  var _registerFunc: js.Any
  var _scene: js.Any
  var _webAudioAnalyser: js.Any
  /**
    * Connects two audio nodes
    * @param inputAudioNode defines first node to connect
    * @param outputAudioNode defines second node to connect
    */
  def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit
  /**
    * Releases all associated resources
    */
  def dispose(): Unit
  /**
    * Renders the debug canvas
    */
  def drawDebugCanvas(): Unit
  /**
    * Gets the current frequency data as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Uint8Array
    */
  def getByteFrequencyData(): Uint8Array
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  def getByteTimeDomainData(): Uint8Array
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  def getFloatFrequencyData(): Float32Array
  /**
    * Get the number of data values you will have to play with for the visualization
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount
    * @returns a number
    */
  def getFrequencyBinCount(): Double
  /**
    * Stops rendering the debug canvas and removes it
    */
  def stopDebugCanvas(): Unit
}

object Analyser {
  @scala.inline
  def apply(
    BARGRAPHAMPLITUDE: Double,
    DEBUGCANVASPOS: Y,
    DEBUGCANVASSIZE: Width,
    FFT_SIZE: Double,
    SMOOTHING: Double,
    _audioEngine: js.Any,
    _byteFreqs: js.Any,
    _byteTime: js.Any,
    _debugCanvas: js.Any,
    _debugCanvasContext: js.Any,
    _floatFreqs: js.Any,
    _registerFunc: js.Any,
    _scene: js.Any,
    _webAudioAnalyser: js.Any,
    connectAudioNodes: (AudioNode, AudioNode) => Unit,
    dispose: () => Unit,
    drawDebugCanvas: () => Unit,
    getByteFrequencyData: () => Uint8Array,
    getByteTimeDomainData: () => Uint8Array,
    getFloatFrequencyData: () => Float32Array,
    getFrequencyBinCount: () => Double,
    stopDebugCanvas: () => Unit
  ): Analyser = {
    val __obj = js.Dynamic.literal(BARGRAPHAMPLITUDE = BARGRAPHAMPLITUDE.asInstanceOf[js.Any], DEBUGCANVASPOS = DEBUGCANVASPOS.asInstanceOf[js.Any], DEBUGCANVASSIZE = DEBUGCANVASSIZE.asInstanceOf[js.Any], FFT_SIZE = FFT_SIZE.asInstanceOf[js.Any], SMOOTHING = SMOOTHING.asInstanceOf[js.Any], _audioEngine = _audioEngine.asInstanceOf[js.Any], _byteFreqs = _byteFreqs.asInstanceOf[js.Any], _byteTime = _byteTime.asInstanceOf[js.Any], _debugCanvas = _debugCanvas.asInstanceOf[js.Any], _debugCanvasContext = _debugCanvasContext.asInstanceOf[js.Any], _floatFreqs = _floatFreqs.asInstanceOf[js.Any], _registerFunc = _registerFunc.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _webAudioAnalyser = _webAudioAnalyser.asInstanceOf[js.Any], connectAudioNodes = js.Any.fromFunction2(connectAudioNodes), dispose = js.Any.fromFunction0(dispose), drawDebugCanvas = js.Any.fromFunction0(drawDebugCanvas), getByteFrequencyData = js.Any.fromFunction0(getByteFrequencyData), getByteTimeDomainData = js.Any.fromFunction0(getByteTimeDomainData), getFloatFrequencyData = js.Any.fromFunction0(getFloatFrequencyData), getFrequencyBinCount = js.Any.fromFunction0(getFrequencyBinCount), stopDebugCanvas = js.Any.fromFunction0(stopDebugCanvas))
    __obj.asInstanceOf[Analyser]
  }
}

