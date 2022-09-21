package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BouncingBehavior")
@js.native
open class BouncingBehavior ()
  extends StObject
     with typings.babylonjs.BABYLON.BouncingBehavior {
  
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: typings.babylonjs.BABYLON.ArcRotateCamera): Unit = js.native
  
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
object BouncingBehavior {
  
  @JSGlobal("BABYLON.BouncingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The easing function used by animations
    */
  @JSGlobal("BABYLON.BouncingBehavior.EasingFunction")
  @js.native
  def EasingFunction: typings.babylonjs.BABYLON.BackEase = js.native
  inline def EasingFunction_=(x: typings.babylonjs.BABYLON.BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSGlobal("BABYLON.BouncingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
}
