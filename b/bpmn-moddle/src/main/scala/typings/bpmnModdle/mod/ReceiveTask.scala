package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ @js.native
trait ReceiveTask extends Activity {
  var implementation: String = js.native
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var instantiate: Boolean = js.native
  var messageRef: Message = js.native
  var operationRef: Operation = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
}

object ReceiveTask {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    categoryValueRef: js.Array[CategoryValue],
    completionQuantity: Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    id: String,
    implementation: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    instantiate: Boolean,
    ioSpecification: InputOutputSpecification,
    isForCompensation: Boolean,
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    messageRef: Message,
    monitoring: Monitoring,
    operationRef: Operation,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: Double
  ): ReceiveTask = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], boundaryEventRefs = boundaryEventRefs.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], completionQuantity = completionQuantity.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], instantiate = instantiate.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isForCompensation = isForCompensation.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopCharacteristics = loopCharacteristics.asInstanceOf[js.Any], messageRef = messageRef.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], startQuantity = startQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveTask]
  }
  @scala.inline
  implicit class ReceiveTaskOps[Self <: ReceiveTask] (val x: Self) extends AnyVal {
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
    def setImplementation(value: String): Self = this.set("implementation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingConversationLinksVarargs(value: ConversationLink*): Self = this.set("incomingConversationLinks", js.Array(value :_*))
    @scala.inline
    def setIncomingConversationLinks(value: js.Array[ConversationLink]): Self = this.set("incomingConversationLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstantiate(value: Boolean): Self = this.set("instantiate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageRef(value: Message): Self = this.set("messageRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationRef(value: Operation): Self = this.set("operationRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingConversationLinksVarargs(value: ConversationLink*): Self = this.set("outgoingConversationLinks", js.Array(value :_*))
    @scala.inline
    def setOutgoingConversationLinks(value: js.Array[ConversationLink]): Self = this.set("outgoingConversationLinks", value.asInstanceOf[js.Any])
  }
  
}

