package typings.babylonjs

import typings.babylonjs.easingMod.BackEase
import typings.babylonjs.easingMod.ExponentialEase
import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Behaviors/index", JSImport.Namespace)
@js.native
object behaviorsIndexMod extends js.Object {
  @js.native
  class AttachToBoxBehavior protected ()
    extends typings.babylonjs.meshesIndexMod.AttachToBoxBehavior {
    /**
      * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
      * @param ui The transform node that should be attched to the mesh
      */
    def this(ui: TransformNode) = this()
  }
  
  @js.native
  class AutoRotationBehavior ()
    extends typings.babylonjs.autoRotationBehaviorMod.AutoRotationBehavior
  
  @js.native
  class BouncingBehavior ()
    extends typings.babylonjs.camerasIndexMod.BouncingBehavior
  
  @js.native
  /**
    * Instatiates the FadeInOutBehavior
    */
  class FadeInOutBehavior ()
    extends typings.babylonjs.meshesIndexMod.FadeInOutBehavior
  
  @js.native
  class FramingBehavior ()
    extends typings.babylonjs.camerasIndexMod.FramingBehavior
  
  @js.native
  /**
    * Instantiate a new behavior that when attached to a mesh will allow the mesh to be scaled
    */
  class MultiPointerScaleBehavior ()
    extends typings.babylonjs.meshesIndexMod.MultiPointerScaleBehavior
  
  @js.native
  /**
    * Creates a pointer drag behavior that can be attached to a mesh
    * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
    */
  class PointerDragBehavior ()
    extends typings.babylonjs.meshesIndexMod.PointerDragBehavior {
    def this(options: AnonDragAxis) = this()
  }
  
  @js.native
  /**
    * Instantiates a behavior that when attached to a mesh will allow the mesh to be dragged around based on directions and origin of the pointer's ray
    */
  class SixDofDragBehavior ()
    extends typings.babylonjs.meshesIndexMod.SixDofDragBehavior
  
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
  
  /* static members */
  @js.native
  object PointerDragBehavior extends js.Object {
    var _AnyMouseID: js.Any = js.native
    var _planeScene: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SixDofDragBehavior extends js.Object {
    var _virtualScene: js.Any = js.native
  }
  
}

