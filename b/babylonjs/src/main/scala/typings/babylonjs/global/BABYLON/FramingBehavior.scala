package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FramingBehavior")
@js.native
class FramingBehavior ()
  extends typings.babylonjs.BABYLON.FramingBehavior
/* static members */
object FramingBehavior {
  
  @JSGlobal("BABYLON.FramingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The easing function used by animations
    */
  @JSGlobal("BABYLON.FramingBehavior.EasingFunction")
  @js.native
  def EasingFunction: typings.babylonjs.BABYLON.ExponentialEase = js.native
  @scala.inline
  def EasingFunction_=(x: typings.babylonjs.BABYLON.ExponentialEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSGlobal("BABYLON.FramingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  @scala.inline
  def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
  
  /**
    * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
    */
  @JSGlobal("BABYLON.FramingBehavior.FitFrustumSidesMode")
  @js.native
  def FitFrustumSidesMode: Double = js.native
  @scala.inline
  def FitFrustumSidesMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FitFrustumSidesMode")(x.asInstanceOf[js.Any])
  
  /**
    * The camera can move all the way towards the mesh.
    */
  @JSGlobal("BABYLON.FramingBehavior.IgnoreBoundsSizeMode")
  @js.native
  def IgnoreBoundsSizeMode: Double = js.native
  @scala.inline
  def IgnoreBoundsSizeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IgnoreBoundsSizeMode")(x.asInstanceOf[js.Any])
}
