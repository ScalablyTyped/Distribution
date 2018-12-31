package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent extends js.Object {
  /**
    * The prior value of d3.event, allowing custom events to retain a reference to the originating native event.
    */
  var sourceEvent: js.UndefOr[js.Any] = js.undefined
  /**
    * Event type
    */
  var `type`: java.lang.String
}

