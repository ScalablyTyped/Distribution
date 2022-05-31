package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationEventMod {
  
  @JSImport("babylonjs/Animations/animationEvent", "AnimationEvent")
  @js.native
  class AnimationEvent protected () extends StObject {
    /**
      * Initializes the animation event
      * @param frame The frame for which the event is triggered
      * @param action The event to perform when triggered
      * @param onlyOnce Specifies if the event should be triggered only once
      */
    def this(
      /** The frame for which the event is triggered **/
    frame: Double,
      /** The event to perform when triggered **/
    action: js.Function1[/* currentFrame */ Double, Unit]
    ) = this()
    def this(
      /** The frame for which the event is triggered **/
    frame: Double,
      /** The event to perform when triggered **/
    action: js.Function1[/* currentFrame */ Double, Unit],
      /** Specifies if the event should be triggered only once**/
    onlyOnce: Boolean
    ) = this()
    
    /** @hidden */
    def _clone(): AnimationEvent = js.native
    
    /** The event to perform when triggered **/
    def action(currentFrame: Double): Unit = js.native
    
    /** The frame for which the event is triggered **/
    var frame: Double = js.native
    
    /**
      * Specifies if the animation event is done
      */
    var isDone: Boolean = js.native
    
    /** Specifies if the event should be triggered only once**/
    var onlyOnce: js.UndefOr[Boolean] = js.native
  }
}
