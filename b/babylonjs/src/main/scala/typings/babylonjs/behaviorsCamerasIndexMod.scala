package typings.babylonjs

import typings.babylonjs.animationsEasingMod.BackEase
import typings.babylonjs.animationsEasingMod.ExponentialEase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsCamerasIndexMod {
  
  @JSImport("babylonjs/Behaviors/Cameras/index", "AutoRotationBehavior")
  @js.native
  open class AutoRotationBehavior ()
    extends typings.babylonjs.behaviorsCamerasAutoRotationBehaviorMod.AutoRotationBehavior
  
  @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior")
  @js.native
  open class BouncingBehavior ()
    extends typings.babylonjs.behaviorsCamerasBouncingBehaviorMod.BouncingBehavior
  /* static members */
  object BouncingBehavior {
    
    @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior.EasingFunction")
    @js.native
    def EasingFunction: BackEase = js.native
    inline def EasingFunction_=(x: BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "BouncingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior")
  @js.native
  open class FramingBehavior ()
    extends typings.babylonjs.behaviorsCamerasFramingBehaviorMod.FramingBehavior
  /* static members */
  object FramingBehavior {
    
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.EasingFunction")
    @js.native
    def EasingFunction: ExponentialEase = js.native
    inline def EasingFunction_=(x: ExponentialEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.FitFrustumSidesMode")
    @js.native
    def FitFrustumSidesMode: Double = js.native
    inline def FitFrustumSidesMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FitFrustumSidesMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera can move all the way towards the mesh.
      */
    @JSImport("babylonjs/Behaviors/Cameras/index", "FramingBehavior.IgnoreBoundsSizeMode")
    @js.native
    def IgnoreBoundsSizeMode: Double = js.native
    inline def IgnoreBoundsSizeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IgnoreBoundsSizeMode")(x.asInstanceOf[js.Any])
  }
}
