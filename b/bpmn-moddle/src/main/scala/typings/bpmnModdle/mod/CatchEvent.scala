package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatchEvent
  extends StObject
     with Event {
  
  var dataOutputAssociations: js.Array[DataOutputAssociation]
  
  var dataOutputs: js.Array[DataOutput]
  
  var eventDefinitions: js.Array[EventDefinition]
  
  var outputSet: OutputSet
  
  /**
    * @default false
    */
  var parallelMultiple: Boolean
}
object CatchEvent {
  
  inline def apply(
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
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    outputSet: OutputSet,
    parallelMultiple: Boolean,
    properties: js.Array[Property]
  ): CatchEvent = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], dataOutputs = dataOutputs.asInstanceOf[js.Any], eventDefinitions = eventDefinitions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], outputSet = outputSet.asInstanceOf[js.Any], parallelMultiple = parallelMultiple.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatchEvent] (val x: Self) extends AnyVal {
    
    inline def setDataOutputAssociations(value: js.Array[DataOutputAssociation]): Self = StObject.set(x, "dataOutputAssociations", value.asInstanceOf[js.Any])
    
    inline def setDataOutputAssociationsVarargs(value: DataOutputAssociation*): Self = StObject.set(x, "dataOutputAssociations", js.Array(value*))
    
    inline def setDataOutputs(value: js.Array[DataOutput]): Self = StObject.set(x, "dataOutputs", value.asInstanceOf[js.Any])
    
    inline def setDataOutputsVarargs(value: DataOutput*): Self = StObject.set(x, "dataOutputs", js.Array(value*))
    
    inline def setEventDefinitions(value: js.Array[EventDefinition]): Self = StObject.set(x, "eventDefinitions", value.asInstanceOf[js.Any])
    
    inline def setEventDefinitionsVarargs(value: EventDefinition*): Self = StObject.set(x, "eventDefinitions", js.Array(value*))
    
    inline def setOutputSet(value: OutputSet): Self = StObject.set(x, "outputSet", value.asInstanceOf[js.Any])
    
    inline def setParallelMultiple(value: Boolean): Self = StObject.set(x, "parallelMultiple", value.asInstanceOf[js.Any])
  }
}
