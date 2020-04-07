package typings.babylonjs

import typings.babylonjs.easingMod.BackEase
import typings.babylonjs.easingMod.ExponentialEase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Behaviors/Cameras/index", JSImport.Namespace)
@js.native
object camerasIndexMod extends js.Object {
  @js.native
  class AutoRotationBehavior ()
    extends typings.babylonjs.autoRotationBehaviorMod.AutoRotationBehavior
  
  @js.native
  class BouncingBehavior ()
    extends typings.babylonjs.bouncingBehaviorMod.BouncingBehavior
  
  @js.native
  class FramingBehavior ()
    extends typings.babylonjs.framingBehaviorMod.FramingBehavior
  
  /* static members */
  @js.native
  object BouncingBehavior extends js.Object {
    /**
      * The easing function used by animations
      */
    var EasingFunction: BackEase = js.native
    /**
      * The easing mode used by animations
      */
    var EasingMode: Double = js.native
  }
  
  /* static members */
  @js.native
  object FramingBehavior extends js.Object {
    /**
      * The easing function used by animations
      */
    var EasingFunction: ExponentialEase = js.native
    /**
      * The easing mode used by animations
      */
    var EasingMode: Double = js.native
    /**
      * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
      */
    var FitFrustumSidesMode: Double = js.native
    /**
      * The camera can move all the way towards the mesh.
      */
    var IgnoreBoundsSizeMode: Double = js.native
  }
  
}

