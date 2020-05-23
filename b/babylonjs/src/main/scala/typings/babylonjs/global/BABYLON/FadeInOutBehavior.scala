package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FadeInOutBehavior")
@js.native
/**
  * Instatiates the FadeInOutBehavior
  */
class FadeInOutBehavior ()
  extends typings.babylonjs.BABYLON.FadeInOutBehavior {
  /* CompleteClass */
  override var _hoverValue: js.Any = js.native
  /* CompleteClass */
  override var _hovered: js.Any = js.native
  /* CompleteClass */
  override var _millisecondsPerFrame: js.Any = js.native
  /* CompleteClass */
  override var _ownerNode: js.Any = js.native
  /* CompleteClass */
  override var _setAllVisibility: js.Any = js.native
  /* CompleteClass */
  override var _update: js.Any = js.native
  /**
    * Time in milliseconds to delay before fading in (Default: 0)
    */
  /* CompleteClass */
  override var delay: Double = js.native
  /**
    * Time in milliseconds for the mesh to fade in (Default: 300)
    */
  /* CompleteClass */
  override var fadeInTime: Double = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: typings.babylonjs.BABYLON.Mesh): Unit = js.native
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): Unit = js.native
  /**
    * Triggers the mesh to begin fading in or out
    * @param value if the object should fade in or out (true to fade in)
    */
  /* CompleteClass */
  override def fadeIn(value: Boolean): Unit = js.native
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): Unit = js.native
  /**
    *  The name of the behavior
    */
  /* CompleteClass */
  @JSName("name")
  override def name_MFadeInOutBehavior: String = js.native
}

