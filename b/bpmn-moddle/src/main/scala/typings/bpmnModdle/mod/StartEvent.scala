package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEvent extends CatchEvent {
  /**
    * @default true
    */
  var isInterrupting: Boolean = js.native
}

object StartEvent {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    dataOutputs: js.Array[DataOutput],
    eventDefinitions: js.Array[EventDefinition],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    isInterrupting: Boolean,
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    outputSet: OutputSet,
    parallelMultiple: Boolean,
    properties: js.Array[Property]
  ): StartEvent = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], dataOutputs = dataOutputs.asInstanceOf[js.Any], eventDefinitions = eventDefinitions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], isInterrupting = isInterrupting.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], outputSet = outputSet.asInstanceOf[js.Any], parallelMultiple = parallelMultiple.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEvent]
  }
  @scala.inline
  implicit class StartEventOps[Self <: StartEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsInterrupting(value: Boolean): Self = this.set("isInterrupting", value.asInstanceOf[js.Any])
  }
  
}

