package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingularAnimation extends StObject {
  
  /**
    * Get whether the element is currently being animated.
    */
  def animated(): Boolean = js.native
  
  def animation(options: SingularAnimationOptionsPos): AnimationManipulation = js.native
  /**
    *  Get an animation for the element.
    * @param options An object containing the details of the animation.
    */
  def animation(options: SingularAnimationOptionsRen): AnimationManipulation = js.native
  
  /**
    * Get a delay animation for the element.
    * @param duration How long the delay should be in milliseconds.
    * http://js.cytoscape.org/#ele.delayAnimation
    */
  def delayAnimation(duration: Double): AnimationManipulation = js.native
}
