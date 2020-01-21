package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relationship extends BaseElement {
  var direction: RelationshipDirection = js.native
  var source: js.Array[BaseElement] = js.native
  var target: js.Array[BaseElement] = js.native
  var `type`: String = js.native
}

