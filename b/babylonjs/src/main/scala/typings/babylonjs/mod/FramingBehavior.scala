package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FramingBehavior")
@js.native
class FramingBehavior ()
  extends typings.babylonjs.legacyMod.FramingBehavior
/* static members */
object FramingBehavior {
  
  @JSImport("babylonjs", "FramingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The easing function used by animations
    */
  @JSImport("babylonjs", "FramingBehavior.EasingFunction")
  @js.native
  def EasingFunction: typings.babylonjs.easingMod.ExponentialEase = js.native
  @scala.inline
  def EasingFunction_=(x: typings.babylonjs.easingMod.ExponentialEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSImport("babylonjs", "FramingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  @scala.inline
  def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
  
  /**
    * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
    */
  @JSImport("babylonjs", "FramingBehavior.FitFrustumSidesMode")
  @js.native
  def FitFrustumSidesMode: Double = js.native
  @scala.inline
  def FitFrustumSidesMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FitFrustumSidesMode")(x.asInstanceOf[js.Any])
  
  /**
    * The camera can move all the way towards the mesh.
    */
  @JSImport("babylonjs", "FramingBehavior.IgnoreBoundsSizeMode")
  @js.native
  def IgnoreBoundsSizeMode: Double = js.native
  @scala.inline
  def IgnoreBoundsSizeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IgnoreBoundsSizeMode")(x.asInstanceOf[js.Any])
}
