package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sprite
  extends StObject
     with ThinSprite
     with IAnimatable {
  
  /* private */ var _endAnimation: Any = js.native
  
  /* private */ var _manager: Any = js.native
  
  /* private */ var _onAnimationEnd: Any = js.native
  
  /**
    * Gets or sets the associated action manager
    */
  var actionManager: Nullable[ActionManager] = js.native
  
  /** Gets or sets the main color */
  @JSName("color")
  var color_Sprite: Color4 = js.native
  
  def delay_=(value: Double): Unit = js.native
  
  /** Release associated resources */
  def dispose(): Unit = js.native
  
  /** Gets or sets a boolean indicating that this sprite should be disposed after animation ends */
  var disposeWhenFinishedAnimating: Boolean = js.native
  
  def fromIndex_=(value: Double): Unit = js.native
  
  /**
    * Returns the string "Sprite"
    * @returns "Sprite"
    */
  def getClassName(): String = js.native
  
  /** Gets or sets a boolean indicating if the sprite can be picked */
  var isPickable: Boolean = js.native
  
  def loopAnimation_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the manager of this sprite
    */
  def manager: ISpriteManager = js.native
  
  /** defines the name */
  var name: String = js.native
  
  /**
    * An event triggered when the control has been disposed
    */
  var onDisposeObservable: Observable[Sprite] = js.native
  
  /**
    * Starts an animation
    * @param from defines the initial key
    * @param to defines the end key
    * @param loop defines if the animation must loop
    * @param delay defines the start delay (in ms)
    * @param onAnimationEnd defines a callback to call when animation ends
    */
  def playAnimation(from: Double, to: Double, loop: Boolean, delay: Double): Unit = js.native
  
  /** Gets or sets the current world position */
  @JSName("position")
  var position_Sprite: Vector3 = js.native
  
  /**
    * Serializes the sprite to a JSON object
    * @returns the JSON object
    */
  def serialize(): Any = js.native
  
  /**
    * Gets or sets the sprite size
    */
  def size: Double = js.native
  def size_=(value: Double): Unit = js.native
  
  def toIndex_=(value: Double): Unit = js.native
  
  /**
    * Gets or sets the unique id of the sprite
    */
  var uniqueId: Double = js.native
  
  /** Gets or sets a boolean indicating that sprite texture alpha will be used for precise picking (false by default) */
  var useAlphaForPicking: Boolean = js.native
}
