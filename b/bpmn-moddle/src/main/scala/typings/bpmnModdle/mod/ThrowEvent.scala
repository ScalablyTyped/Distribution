package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrowEvent
  extends StObject
     with Event {
  
  var dataInputAssociations: js.Array[DataInputAssociation]
  
  var dataInputs: js.Array[DataInput]
  
  var eventDefinitionRef: js.Array[EventDefinition]
  
  var eventDefinitions: js.Array[EventDefinition]
  
  var inputSet: InputSet
}
object ThrowEvent {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataInputAssociations: js.Array[DataInputAssociation],
    dataInputs: js.Array[DataInput],
    eventDefinitionRef: js.Array[EventDefinition],
    eventDefinitions: js.Array[EventDefinition],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    inputSet: InputSet,
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property]
  ): ThrowEvent = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataInputs = dataInputs.asInstanceOf[js.Any], eventDefinitionRef = eventDefinitionRef.asInstanceOf[js.Any], eventDefinitions = eventDefinitions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], inputSet = inputSet.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThrowEvent] (val x: Self) extends AnyVal {
    
    inline def setDataInputAssociations(value: js.Array[DataInputAssociation]): Self = StObject.set(x, "dataInputAssociations", value.asInstanceOf[js.Any])
    
    inline def setDataInputAssociationsVarargs(value: DataInputAssociation*): Self = StObject.set(x, "dataInputAssociations", js.Array(value*))
    
    inline def setDataInputs(value: js.Array[DataInput]): Self = StObject.set(x, "dataInputs", value.asInstanceOf[js.Any])
    
    inline def setDataInputsVarargs(value: DataInput*): Self = StObject.set(x, "dataInputs", js.Array(value*))
    
    inline def setEventDefinitionRef(value: js.Array[EventDefinition]): Self = StObject.set(x, "eventDefinitionRef", value.asInstanceOf[js.Any])
    
    inline def setEventDefinitionRefVarargs(value: EventDefinition*): Self = StObject.set(x, "eventDefinitionRef", js.Array(value*))
    
    inline def setEventDefinitions(value: js.Array[EventDefinition]): Self = StObject.set(x, "eventDefinitions", value.asInstanceOf[js.Any])
    
    inline def setEventDefinitionsVarargs(value: EventDefinition*): Self = StObject.set(x, "eventDefinitions", js.Array(value*))
    
    inline def setInputSet(value: InputSet): Self = StObject.set(x, "inputSet", value.asInstanceOf[js.Any])
  }
}
