package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedAnimation extends StObject {
  
  /**
    * Animation to perform
    */
  var animation: Animation
  
  /**
    * Returns the string "TargetedAnimation"
    * @returns "TargetedAnimation"
    */
  def getClassName(): String
  
  /**
    * Serialize the object
    * @returns the JSON object representing the current entity
    */
  def serialize(): Any
  
  /**
    * Target to animate
    */
  var target: Any
}
object TargetedAnimation {
  
  inline def apply(animation: Animation, getClassName: () => String, serialize: () => Any, target: Any): TargetedAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), serialize = js.Any.fromFunction0(serialize), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedAnimation]
  }
  
  extension [Self <: TargetedAnimation](x: Self) {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setSerialize(value: () => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
