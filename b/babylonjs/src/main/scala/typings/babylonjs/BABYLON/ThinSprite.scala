package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThinSprite extends StObject {
  
  /** @hidden */
  def _animate(deltaTime: Double): Unit = js.native
  
  /* private */ var _animationStarted: js.Any = js.native
  
  /* protected */ var _delay: Double = js.native
  
  /* private */ var _direction: js.Any = js.native
  
  /* protected */ var _fromIndex: Double = js.native
  
  /* protected */ var _loopAnimation: Boolean = js.native
  
  /* private */ var _onBaseAnimationEnd: js.Any = js.native
  
  /* private */ var _time: js.Any = js.native
  
  /* protected */ var _toIndex: Double = js.native
  
  /** @hidden */
  var _xOffset: Double = js.native
  
  /** @hidden */
  var _xSize: Double = js.native
  
  /** @hidden */
  var _yOffset: Double = js.native
  
  /** @hidden */
  var _ySize: Double = js.native
  
  /** Gets or sets rotation angle */
  var angle: Double = js.native
  
  /**
    * Returns a boolean indicating if the animation is started
    */
  def animationStarted: Boolean = js.native
  
  /** Gets or sets the cell index in the sprite sheet */
  var cellIndex: Double = js.native
  
  /** Gets or sets the cell reference in the sprite sheet, uses sprite's filename when added to sprite sheet */
  var cellRef: String = js.native
  
  /** Gets or sets the main color */
  var color: IColor4Like = js.native
  
  /** Gets or sets the delay between cell changes (setting it will restart the animation)  */
  def delay: Double = js.native
  
  /** Gets the initial key for the animation (setting it will restart the animation)  */
  def fromIndex: Double = js.native
  
  /** Gets or sets the height */
  var height: Double = js.native
  
  /** Gets or sets a boolean indicating if UV coordinates should be inverted in U axis */
  var invertU: Boolean = js.native
  
  /** Gets or sets a boolean indicating if UV coordinates should be inverted in B axis */
  var invertV: Boolean = js.native
  
  /** Gets or sets a boolean indicating if the sprite is visible (renderable). Default is true */
  var isVisible: Boolean = js.native
  
  /** Gets or sets a boolean indicating if the animation is looping (setting it will restart the animation)  */
  def loopAnimation: Boolean = js.native
  
  /**
    * Starts an animation
    * @param from defines the initial key
    * @param to defines the end key
    * @param loop defines if the animation must loop
    * @param delay defines the start delay (in ms)
    * @param onAnimationEnd defines a callback for when the animation ends
    */
  def playAnimation(
    from: Double,
    to: Double,
    loop: Boolean,
    delay: Double,
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Unit = js.native
  
  /** Gets or sets the current world position */
  var position: IVector3Like = js.native
  
  /** Stops current animation (if any) */
  def stopAnimation(): Unit = js.native
  
  /** Gets or sets the end key for the animation (setting it will restart the animation)  */
  def toIndex: Double = js.native
  
  /** Gets or sets the width */
  var width: Double = js.native
}
