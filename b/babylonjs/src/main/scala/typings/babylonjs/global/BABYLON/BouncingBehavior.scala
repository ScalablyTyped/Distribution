package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BouncingBehavior")
@js.native
class BouncingBehavior ()
  extends typings.babylonjs.BABYLON.BouncingBehavior
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
  @scala.inline
  def EasingFunction_=(x: typings.babylonjs.BABYLON.BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSGlobal("BABYLON.BouncingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  @scala.inline
  def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
}
