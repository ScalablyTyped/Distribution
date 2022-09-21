package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BaseSixDofDragBehavior")
@js.native
open class BaseSixDofDragBehavior ()
  extends StObject
     with typings.babylonjs.BABYLON.BaseSixDofDragBehavior {
  
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
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /** gets or sets behavior's name */
  /* CompleteClass */
  var name: String = js.native
}
/* static members */
object BaseSixDofDragBehavior {
  
  @JSGlobal("BABYLON.BaseSixDofDragBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.BaseSixDofDragBehavior._virtualScene")
  @js.native
  def _virtualScene: typings.babylonjs.BABYLON.Scene = js.native
  inline def _virtualScene_=(x: typings.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_virtualScene")(x.asInstanceOf[js.Any])
}
