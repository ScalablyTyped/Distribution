package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A behavior that when attached to a mesh will allow the mesh to fade in and out
  */
@JSGlobal("BABYLON.FadeInOutBehavior")
@js.native
/**
  * Instatiates the FadeInOutBehavior
  */
class FadeInOutBehavior () extends Behavior[Mesh] {
  var _hoverValue: js.Any = js.native
  var _hovered: js.Any = js.native
  var _millisecondsPerFrame: js.Any = js.native
  var _ownerNode: js.Any = js.native
  var _setAllVisibility: js.Any = js.native
  var _update: js.Any = js.native
  /**
    * Time in milliseconds to delay before fading in (Default: 0)
    */
  var delay: scala.Double = js.native
  /**
    * Time in milliseconds for the mesh to fade in (Default: 300)
    */
  var fadeInTime: scala.Double = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: Mesh): scala.Unit = js.native
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /**
    * Triggers the mesh to begin fading in or out
    * @param value if the object should fade in or out (true to fade in)
    */
  def fadeIn(value: scala.Boolean): scala.Unit = js.native
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): scala.Unit = js.native
}

