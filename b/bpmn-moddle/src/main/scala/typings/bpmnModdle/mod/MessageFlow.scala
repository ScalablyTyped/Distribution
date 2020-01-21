package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageFlow extends BaseElement {
  var messageRef: Message = js.native
  var name: String = js.native
  var sourceRef: InteractionNode = js.native
  var targetRef: InteractionNode = js.native
}

