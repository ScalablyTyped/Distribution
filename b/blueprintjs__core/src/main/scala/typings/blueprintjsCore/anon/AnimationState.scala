package typings.blueprintjsCore.anon

import typings.blueprintjsCore.collapseMod.AnimationStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationState extends StObject {
  
  var animationState: AnimationStates = js.native
  
  var height: js.UndefOr[scala.Nothing] = js.native
}
object AnimationState {
  
  @scala.inline
  def apply(animationState: AnimationStates): AnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationState]
  }
  
  @scala.inline
  implicit class AnimationStateMutableBuilder[Self <: AnimationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationState(value: AnimationStates): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
  }
}
