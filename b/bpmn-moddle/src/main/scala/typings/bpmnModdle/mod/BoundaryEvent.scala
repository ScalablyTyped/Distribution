package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundaryEvent
  extends StObject
     with CatchEvent {
  
  var attachedToRef: Activity
  
  /**
    * @default true
    */
  var cancelActivity: Boolean
}
object BoundaryEvent {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    attachedToRef: Activity,
    auditing: Auditing,
    cancelActivity: Boolean,
    categoryValueRef: js.Array[CategoryValue],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    dataOutputs: js.Array[DataOutput],
    eventDefinitions: js.Array[EventDefinition],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    outputSet: OutputSet,
    parallelMultiple: Boolean,
    properties: js.Array[Property]
  ): BoundaryEvent = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], attachedToRef = attachedToRef.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], cancelActivity = cancelActivity.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], dataOutputs = dataOutputs.asInstanceOf[js.Any], eventDefinitions = eventDefinitions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], outputSet = outputSet.asInstanceOf[js.Any], parallelMultiple = parallelMultiple.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundaryEvent]
  }
  
  @scala.inline
  implicit class BoundaryEventMutableBuilder[Self <: BoundaryEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedToRef(value: Activity): Self = StObject.set(x, "attachedToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelActivity(value: Boolean): Self = StObject.set(x, "cancelActivity", value.asInstanceOf[js.Any])
  }
}
