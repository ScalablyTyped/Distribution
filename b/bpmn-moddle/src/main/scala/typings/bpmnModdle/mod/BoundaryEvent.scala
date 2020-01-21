package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundaryEvent extends CatchEvent {
  var attachedToRef: Activity = js.native
  /**
    * @default true
    */
  var cancelActivity: Boolean = js.native
}

