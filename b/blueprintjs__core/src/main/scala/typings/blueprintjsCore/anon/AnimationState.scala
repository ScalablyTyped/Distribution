package typings.blueprintjsCore.anon

import typings.blueprintjsCore.collapseMod.AnimationStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationState extends StObject {
  
  var animationState: AnimationStates
  
  var height: Unit
}
object AnimationState {
  
  @scala.inline
  def apply(animationState: AnimationStates, height: Unit): AnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationState]
  }
  
  @scala.inline
  implicit class AnimationStateMutableBuilder[Self <: AnimationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationState(value: AnimationStates): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Unit): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
