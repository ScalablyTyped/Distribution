package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchEvent extends Event {
  var dataOutputAssociations: js.Array[DataOutputAssociation] = js.native
  var dataOutputs: js.Array[DataOutput] = js.native
  var eventDefinitions: js.Array[EventDefinition] = js.native
  var outputSet: OutputSet = js.native
  /**
    * @default false
    */
  var parallelMultiple: Boolean = js.native
}

