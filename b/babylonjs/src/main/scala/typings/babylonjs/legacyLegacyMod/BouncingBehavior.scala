package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BouncingBehavior")
@js.native
open class BouncingBehavior ()
  extends typings.babylonjs.indexMod.BouncingBehavior
/* static members */
object BouncingBehavior {
  
  @JSImport("babylonjs/Legacy/legacy", "BouncingBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The easing function used by animations
    */
  @JSImport("babylonjs/Legacy/legacy", "BouncingBehavior.EasingFunction")
  @js.native
  def EasingFunction: typings.babylonjs.animationsEasingMod.BackEase = js.native
  inline def EasingFunction_=(x: typings.babylonjs.animationsEasingMod.BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
  
  /**
    * The easing mode used by animations
    */
  @JSImport("babylonjs/Legacy/legacy", "BouncingBehavior.EasingMode")
  @js.native
  def EasingMode: Double = js.native
  inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
}
