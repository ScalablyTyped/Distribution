package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapTypeChangeEventArgs extends js.Object {
  /** The map type that map has changed to. */
  var newMapTypeId: MapTypeId
  /** The map type that the map has changed from. */
  var oldMapTypeId: MapTypeId
  /** The map instance the event occured on */
  var target: Map
  /** The type of object the event was attached to. Should always be "map" */
  var targetType: java.lang.String
}

object IMapTypeChangeEventArgs {
  @scala.inline
  def apply(newMapTypeId: MapTypeId, oldMapTypeId: MapTypeId, target: Map, targetType: java.lang.String): IMapTypeChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newMapTypeId")(newMapTypeId)
    __obj.updateDynamic("oldMapTypeId")(oldMapTypeId)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("targetType")(targetType)
    __obj.asInstanceOf[IMapTypeChangeEventArgs]
  }
}

