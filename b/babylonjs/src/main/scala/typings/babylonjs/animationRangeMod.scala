package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationRangeMod {
  
  @JSImport("babylonjs/Animations/animationRange", "AnimationRange")
  @js.native
  open class AnimationRange protected () extends StObject {
    /**
      * Initializes the range of an animation
      * @param name The name of the animation range
      * @param from The starting frame of the animation
      * @param to The ending frame of the animation
      */
    def this(
      /**The name of the animation range**/
    name: String,
      /**The starting frame of the animation */
    from: Double,
      /**The ending frame of the animation*/
    to: Double
    ) = this()
    
    /**The starting frame of the animation */
    var from: Double = js.native
    
    /**The name of the animation range**/
    var name: String = js.native
    
    /**The ending frame of the animation*/
    var to: Double = js.native
  }
}
