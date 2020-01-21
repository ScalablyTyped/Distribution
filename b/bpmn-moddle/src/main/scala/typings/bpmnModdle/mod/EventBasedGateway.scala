package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBasedGateway extends Gateway {
  /**
    * @default Exclusive
    */
  var eventGatewayType: EventBasedGatewayType = js.native
  var instantiate: Boolean = js.native
}

