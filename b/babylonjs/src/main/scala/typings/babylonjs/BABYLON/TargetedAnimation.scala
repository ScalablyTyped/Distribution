package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetedAnimation extends StObject {
  
  /**
    * Animation to perform
    */
  var animation: Animation = js.native
  
  /**
    * Returns the string "TargetedAnimation"
    * @returns "TargetedAnimation"
    */
  def getClassName(): String = js.native
  
  /**
    * Serialize the object
    * @returns the JSON object representing the current entity
    */
  def serialize(): js.Any = js.native
  
  /**
    * Target to animate
    */
  var target: js.Any = js.native
}
object TargetedAnimation {
  
  @scala.inline
  def apply(animation: Animation, getClassName: () => String, serialize: () => js.Any, target: js.Any): TargetedAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), serialize = js.Any.fromFunction0(serialize), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedAnimation]
  }
  
  @scala.inline
  implicit class TargetedAnimationMutableBuilder[Self <: TargetedAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerialize(value: () => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
