package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MirrorTexture extends RenderTargetTexture {
  
  var _adaptiveBlurKernel: js.Any = js.native
  
  var _autoComputeBlurKernel: js.Any = js.native
  
  var _blurKernelX: js.Any = js.native
  
  var _blurKernelY: js.Any = js.native
  
  var _blurRatio: js.Any = js.native
  
  var _blurX: js.Any = js.native
  
  var _blurY: js.Any = js.native
  
  var _imageProcessingConfigChangeObserver: js.Any = js.native
  
  var _mirrorMatrix: js.Any = js.native
  
  var _preparePostProcesses: js.Any = js.native
  
  var _savedViewMatrix: js.Any = js.native
  
  var _transformMatrix: js.Any = js.native
  
  var _updateGammaSpace: js.Any = js.native
  
  /**
    * Define the adaptive blur kernel used to blur the reflection if needed.
    * This will autocompute the closest best match for the `blurKernel`
    */
  def adaptiveBlurKernel_=(value: Double): Unit = js.native
  
  def blurKernelX: Double = js.native
  /**
    * Define the blur kernel on the X Axis used to blur the reflection if needed.
    * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
    */
  def blurKernelX_=(value: Double): Unit = js.native
  
  def blurKernelY: Double = js.native
  /**
    * Define the blur kernel on the Y Axis used to blur the reflection if needed.
    * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
    */
  def blurKernelY_=(value: Double): Unit = js.native
  
  /**
    * Define the blur kernel used to blur the reflection if needed.
    * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
    */
  def blurKernel_=(value: Double): Unit = js.native
  
  def blurRatio: Double = js.native
  /**
    * Define the blur ratio used to blur the reflection if needed.
    */
  def blurRatio_=(value: Double): Unit = js.native
  
  /**
    * Define the reflection plane we want to use. The mirrorPlane is usually set to the constructed reflector.
    * It is possible to directly set the mirrorPlane by directly using a Plane(a, b, c, d) where a, b and c give the plane normal vector (a, b, c) and d is a scalar displacement from the mirrorPlane to the origin. However in all but the very simplest of situations it is more straight forward to set it to the reflector as stated in the doc.
    * @see https://doc.babylonjs.com/how_to/reflect#mirrors
    */
  var mirrorPlane: Plane = js.native
  
  var scene: js.Any = js.native
}
