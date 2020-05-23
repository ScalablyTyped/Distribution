package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeInOutBehavior extends Behavior[Mesh] {
  var _hoverValue: js.Any
  var _hovered: js.Any
  var _millisecondsPerFrame: js.Any
  var _ownerNode: js.Any
  var _setAllVisibility: js.Any
  var _update: js.Any
  /**
    * Time in milliseconds to delay before fading in (Default: 0)
    */
  var delay: Double
  /**
    * Time in milliseconds for the mesh to fade in (Default: 300)
    */
  var fadeInTime: Double
  /**
    * Triggers the mesh to begin fading in or out
    * @param value if the object should fade in or out (true to fade in)
    */
  def fadeIn(value: Boolean): Unit
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MFadeInOutBehavior: String
}

object FadeInOutBehavior {
  @scala.inline
  def apply(
    _hoverValue: js.Any,
    _hovered: js.Any,
    _millisecondsPerFrame: js.Any,
    _ownerNode: js.Any,
    _setAllVisibility: js.Any,
    _update: js.Any,
    attach: Mesh => Unit,
    delay: Double,
    detach: () => Unit,
    fadeIn: Boolean => Unit,
    fadeInTime: Double,
    init: () => Unit,
    name: () => String
  ): FadeInOutBehavior = {
    val __obj = js.Dynamic.literal(_hoverValue = _hoverValue.asInstanceOf[js.Any], _hovered = _hovered.asInstanceOf[js.Any], _millisecondsPerFrame = _millisecondsPerFrame.asInstanceOf[js.Any], _ownerNode = _ownerNode.asInstanceOf[js.Any], _setAllVisibility = _setAllVisibility.asInstanceOf[js.Any], _update = _update.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), delay = delay.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), fadeIn = js.Any.fromFunction1(fadeIn), fadeInTime = fadeInTime.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[FadeInOutBehavior]
  }
}

