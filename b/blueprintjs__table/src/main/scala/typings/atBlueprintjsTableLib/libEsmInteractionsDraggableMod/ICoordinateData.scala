package typings
package atBlueprintjsTableLib.libEsmInteractionsDraggableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoordinateData extends js.Object {
  /**
    * The client coordinates where the interaction was activated.
    */
  var activation: IClientCoordinates
  /**
    * The client coordinates of the current mouse event.
    */
  var current: IClientCoordinates
  /**
    * The difference between current and last client coordinates.
    */
  var delta: IClientCoordinates
  /**
    * The client coordinates of the previous mouse event.
    */
  var last: IClientCoordinates
  /**
    * The difference between current and activation client coordinates.
    */
  var offset: IClientCoordinates
}

object ICoordinateData {
  @scala.inline
  def apply(
    activation: IClientCoordinates,
    current: IClientCoordinates,
    delta: IClientCoordinates,
    last: IClientCoordinates,
    offset: IClientCoordinates
  ): ICoordinateData = {
    val __obj = js.Dynamic.literal(activation = activation, current = current, delta = delta, last = last, offset = offset)
  
    __obj.asInstanceOf[ICoordinateData]
  }
}

