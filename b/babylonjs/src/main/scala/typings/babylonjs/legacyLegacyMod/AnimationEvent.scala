package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AnimationEvent")
@js.native
open class AnimationEvent protected ()
  extends typings.babylonjs.indexMod.AnimationEvent {
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
}
