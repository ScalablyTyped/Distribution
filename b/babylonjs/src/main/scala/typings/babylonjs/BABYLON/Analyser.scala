package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Height
import typings.babylonjs.anon.X
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analyser extends StObject {
  
  /**
    * Gets or sets the bar graph amplitude
    * @ignorenaming
    */
  var BARGRAPHAMPLITUDE: Double
  
  /**
    * Gets or sets the position of the debug canvas
    * @ignorenaming
    */
  var DEBUGCANVASPOS: X
  
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  var DEBUGCANVASSIZE: Height
  
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
  
  /* private */ var _audioEngine: Any
  
  /* private */ var _byteFreqs: Any
  
  /* private */ var _byteTime: Any
  
  /* private */ var _debugCanvas: Any
  
  /* private */ var _debugCanvasContext: Any
  
  /* private */ var _floatFreqs: Any
  
  /* private */ var _registerFunc: Any
  
  /* private */ var _scene: Any
  
  /* private */ var _webAudioAnalyser: Any
  
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
  def getByteFrequencyData(): js.typedarray.Uint8Array
  
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  def getByteTimeDomainData(): js.typedarray.Uint8Array
  
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  def getFloatFrequencyData(): js.typedarray.Float32Array
  
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
  
  inline def apply(
    BARGRAPHAMPLITUDE: Double,
    DEBUGCANVASPOS: X,
    DEBUGCANVASSIZE: Height,
    FFT_SIZE: Double,
    SMOOTHING: Double,
    _audioEngine: Any,
    _byteFreqs: Any,
    _byteTime: Any,
    _debugCanvas: Any,
    _debugCanvasContext: Any,
    _floatFreqs: Any,
    _registerFunc: Any,
    _scene: Any,
    _webAudioAnalyser: Any,
    connectAudioNodes: (AudioNode, AudioNode) => Unit,
    dispose: () => Unit,
    drawDebugCanvas: () => Unit,
    getByteFrequencyData: () => js.typedarray.Uint8Array,
    getByteTimeDomainData: () => js.typedarray.Uint8Array,
    getFloatFrequencyData: () => js.typedarray.Float32Array,
    getFrequencyBinCount: () => Double,
    stopDebugCanvas: () => Unit
  ): Analyser = {
    val __obj = js.Dynamic.literal(BARGRAPHAMPLITUDE = BARGRAPHAMPLITUDE.asInstanceOf[js.Any], DEBUGCANVASPOS = DEBUGCANVASPOS.asInstanceOf[js.Any], DEBUGCANVASSIZE = DEBUGCANVASSIZE.asInstanceOf[js.Any], FFT_SIZE = FFT_SIZE.asInstanceOf[js.Any], SMOOTHING = SMOOTHING.asInstanceOf[js.Any], _audioEngine = _audioEngine.asInstanceOf[js.Any], _byteFreqs = _byteFreqs.asInstanceOf[js.Any], _byteTime = _byteTime.asInstanceOf[js.Any], _debugCanvas = _debugCanvas.asInstanceOf[js.Any], _debugCanvasContext = _debugCanvasContext.asInstanceOf[js.Any], _floatFreqs = _floatFreqs.asInstanceOf[js.Any], _registerFunc = _registerFunc.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _webAudioAnalyser = _webAudioAnalyser.asInstanceOf[js.Any], connectAudioNodes = js.Any.fromFunction2(connectAudioNodes), dispose = js.Any.fromFunction0(dispose), drawDebugCanvas = js.Any.fromFunction0(drawDebugCanvas), getByteFrequencyData = js.Any.fromFunction0(getByteFrequencyData), getByteTimeDomainData = js.Any.fromFunction0(getByteTimeDomainData), getFloatFrequencyData = js.Any.fromFunction0(getFloatFrequencyData), getFrequencyBinCount = js.Any.fromFunction0(getFrequencyBinCount), stopDebugCanvas = js.Any.fromFunction0(stopDebugCanvas))
    __obj.asInstanceOf[Analyser]
  }
  
  extension [Self <: Analyser](x: Self) {
    
    inline def setBARGRAPHAMPLITUDE(value: Double): Self = StObject.set(x, "BARGRAPHAMPLITUDE", value.asInstanceOf[js.Any])
    
    inline def setConnectAudioNodes(value: (AudioNode, AudioNode) => Unit): Self = StObject.set(x, "connectAudioNodes", js.Any.fromFunction2(value))
    
    inline def setDEBUGCANVASPOS(value: X): Self = StObject.set(x, "DEBUGCANVASPOS", value.asInstanceOf[js.Any])
    
    inline def setDEBUGCANVASSIZE(value: Height): Self = StObject.set(x, "DEBUGCANVASSIZE", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDrawDebugCanvas(value: () => Unit): Self = StObject.set(x, "drawDebugCanvas", js.Any.fromFunction0(value))
    
    inline def setFFT_SIZE(value: Double): Self = StObject.set(x, "FFT_SIZE", value.asInstanceOf[js.Any])
    
    inline def setGetByteFrequencyData(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "getByteFrequencyData", js.Any.fromFunction0(value))
    
    inline def setGetByteTimeDomainData(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "getByteTimeDomainData", js.Any.fromFunction0(value))
    
    inline def setGetFloatFrequencyData(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "getFloatFrequencyData", js.Any.fromFunction0(value))
    
    inline def setGetFrequencyBinCount(value: () => Double): Self = StObject.set(x, "getFrequencyBinCount", js.Any.fromFunction0(value))
    
    inline def setSMOOTHING(value: Double): Self = StObject.set(x, "SMOOTHING", value.asInstanceOf[js.Any])
    
    inline def setStopDebugCanvas(value: () => Unit): Self = StObject.set(x, "stopDebugCanvas", js.Any.fromFunction0(value))
    
    inline def set_audioEngine(value: Any): Self = StObject.set(x, "_audioEngine", value.asInstanceOf[js.Any])
    
    inline def set_byteFreqs(value: Any): Self = StObject.set(x, "_byteFreqs", value.asInstanceOf[js.Any])
    
    inline def set_byteTime(value: Any): Self = StObject.set(x, "_byteTime", value.asInstanceOf[js.Any])
    
    inline def set_debugCanvas(value: Any): Self = StObject.set(x, "_debugCanvas", value.asInstanceOf[js.Any])
    
    inline def set_debugCanvasContext(value: Any): Self = StObject.set(x, "_debugCanvasContext", value.asInstanceOf[js.Any])
    
    inline def set_floatFreqs(value: Any): Self = StObject.set(x, "_floatFreqs", value.asInstanceOf[js.Any])
    
    inline def set_registerFunc(value: Any): Self = StObject.set(x, "_registerFunc", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
    
    inline def set_webAudioAnalyser(value: Any): Self = StObject.set(x, "_webAudioAnalyser", value.asInstanceOf[js.Any])
  }
}
