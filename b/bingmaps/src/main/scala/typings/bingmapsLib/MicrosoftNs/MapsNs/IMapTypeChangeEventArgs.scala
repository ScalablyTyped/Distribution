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

