package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdHocSubProcess extends SubProcess {
  var cancelRemainingInstances: Boolean = js.native
  var completionCondition: Expression = js.native
  var ordering: AdHocOrdering = js.native
}

