package typings.blueprintjsCore.anon

import typings.blueprintjsCore.collapseMod.AnimationStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var animationState: AnimationStates
  
  var height: String
}
object Height {
  
  @scala.inline
  def apply(animationState: AnimationStates, height: String): Height = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationState(value: AnimationStates): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
