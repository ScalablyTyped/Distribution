package typings.babylonjs

import typings.babylonjs.behaviorMod.Behavior
import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Behaviors/Meshes/fadeInOutBehavior", JSImport.Namespace)
@js.native
object fadeInOutBehaviorMod extends js.Object {
  @js.native
  /**
    * Instatiates the FadeInOutBehavior
    */
  class FadeInOutBehavior () extends Behavior[Mesh] {
    var _hoverValue: js.Any = js.native
    var _hovered: js.Any = js.native
    var _millisecondsPerFrame: js.Any = js.native
    var _ownerNode: js.Any = js.native
    var _setAllVisibility: js.Any = js.native
    var _update: js.Any = js.native
    /**
      * Time in milliseconds to delay before fading in (Default: 0)
      */
    var delay: Double = js.native
    /**
      * Time in milliseconds for the mesh to fade in (Default: 300)
      */
    var fadeInTime: Double = js.native
    /** gets or sets behavior's name */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: Mesh): Unit = js.native
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    /**
      * Triggers the mesh to begin fading in or out
      * @param value if the object should fade in or out (true to fade in)
      */
    def fadeIn(value: Boolean): Unit = js.native
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    /**
      *  The name of the behavior
      */
    @JSName("name")
    def name_MFadeInOutBehavior(): String = js.native
  }
  
}

