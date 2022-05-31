package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AnimationRange")
@js.native
class AnimationRange protected ()
  extends StObject
     with typings.babylonjs.BABYLON.AnimationRange {
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
  /* CompleteClass */
  var from: Double = js.native
  
  /**The name of the animation range**/
  /* CompleteClass */
  var name: String = js.native
  
  /**The ending frame of the animation*/
  /* CompleteClass */
  var to: Double = js.native
}
