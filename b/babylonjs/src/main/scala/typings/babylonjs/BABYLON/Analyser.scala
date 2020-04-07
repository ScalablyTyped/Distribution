package typings.babylonjs.BABYLON

import typings.babylonjs.AnonWidth
import typings.babylonjs.AnonY
import typings.std.AudioNode
import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Analyser")
@js.native
class Analyser protected () extends js.Object {
  /**
    * Creates a new analyser
    * @param scene defines hosting scene
    */
  def this(scene: Scene) = this()
  /**
    * Gets or sets the bar graph amplitude
    * @ignorenaming
    */
  var BARGRAPHAMPLITUDE: Double = js.native
  /**
    * Gets or sets the position of the debug canvas
    * @ignorenaming
    */
  var DEBUGCANVASPOS: AnonY = js.native
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  var DEBUGCANVASSIZE: AnonWidth = js.native
  /**
    * Gets or sets the FFT table size
    * @ignorenaming
    */
  var FFT_SIZE: Double = js.native
  /**
    * Gets or sets the smoothing
    * @ignorenaming
    */
  var SMOOTHING: Double = js.native
  var _audioEngine: js.Any = js.native
  var _byteFreqs: js.Any = js.native
  var _byteTime: js.Any = js.native
  var _debugCanvas: js.Any = js.native
  var _debugCanvasContext: js.Any = js.native
  var _floatFreqs: js.Any = js.native
  var _registerFunc: js.Any = js.native
  var _scene: js.Any = js.native
  var _webAudioAnalyser: js.Any = js.native
  /**
    * Connects two audio nodes
    * @param inputAudioNode defines first node to connect
    * @param outputAudioNode defines second node to connect
    */
  def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit = js.native
  /**
    * Releases all associated resources
    */
  def dispose(): Unit = js.native
  /**
    * Renders the debug canvas
    */
  def drawDebugCanvas(): Unit = js.native
  /**
    * Gets the current frequency data as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Uint8Array
    */
  def getByteFrequencyData(): Uint8Array = js.native
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  def getByteTimeDomainData(): Uint8Array = js.native
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  def getFloatFrequencyData(): Float32Array = js.native
  /**
    * Get the number of data values you will have to play with for the visualization
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount
    * @returns a number
    */
  def getFrequencyBinCount(): Double = js.native
  /**
    * Stops rendering the debug canvas and removes it
    */
  def stopDebugCanvas(): Unit = js.native
}

