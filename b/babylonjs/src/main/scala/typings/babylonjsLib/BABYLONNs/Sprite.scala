package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to represent a sprite
  * @see http://doc.babylonjs.com/babylon101/sprites
  */
@JSGlobal("BABYLON.Sprite")
@js.native
class Sprite protected () extends js.Object {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: java.lang.String, manager: ISpriteManager) = this()
  var _animationStarted: js.Any = js.native
  var _delay: js.Any = js.native
  var _direction: js.Any = js.native
  var _fromIndex: js.Any = js.native
  var _loopAnimation: js.Any = js.native
  var _manager: js.Any = js.native
  var _onAnimationEnd: js.Any = js.native
  var _time: js.Any = js.native
  var _toIndex: js.Any = js.native
  /**
    * Gets or sets the associated action manager
    */
  var actionManager: Nullable[ActionManager] = js.native
  /** Gets or sets rotation angle */
  var angle: scala.Double = js.native
  /** Gets the list of attached animations */
  var animations: js.Array[Animation] = js.native
  /** Gets or sets the cell index in the sprite sheet */
  var cellIndex: scala.Double = js.native
  /** Gets or sets the main color */
  var color: Color4 = js.native
  /** Gets or sets a boolean indicating that this sprite should be disposed after animation ends */
  var disposeWhenFinishedAnimating: scala.Boolean = js.native
  /** Gets or sets the height */
  var height: scala.Double = js.native
  /** Gets or sets a boolean indicating if UV coordinates should be inverted in U axis */
  var invertU: scala.Double = js.native
  /** Gets or sets a boolean indicating if UV coordinates should be inverted in B axis */
  var invertV: scala.Double = js.native
  /** Gets or sets a boolean indicating if the sprite can be picked */
  var isPickable: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the sprite is visible (renderable). Default is true
    */
  var isVisible: scala.Boolean = js.native
  /** defines the name */
  var name: java.lang.String = js.native
  /** Gets or sets the current world position */
  var position: Vector3 = js.native
  /**
    * Gets or sets the sprite size
    */
  var size: scala.Double = js.native
  /** Gets or sets the width */
  var width: scala.Double = js.native
  /** @hidden */
  def _animate(deltaTime: scala.Double): scala.Unit = js.native
  /** Release associated resources */
  def dispose(): scala.Unit = js.native
  /**
    * Starts an animation
    * @param from defines the initial key
    * @param to defines the end key
    * @param loop defines if the animation must loop
    * @param delay defines the start delay (in ms)
    * @param onAnimationEnd defines a callback to call when animation ends
    */
  def playAnimation(
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean,
    delay: scala.Double,
    onAnimationEnd: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Stops current animation (if any) */
  def stopAnimation(): scala.Unit = js.native
}

