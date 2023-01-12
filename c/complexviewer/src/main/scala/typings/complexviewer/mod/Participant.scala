package typings.complexviewer.mod

import typings.complexviewer.complexviewerStrings.interaction
import typings.complexviewer.complexviewerStrings.interactor
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Participant extends StObject {
  
  var annotationSets: js.UndefOr[Map[String, Set[Annotation]]] = js.undefined
  
  var experiment: Experiment
  
  var id: String
  
  var identifier: Identifier
  
  var identifiers: js.Array[Identifier]
  
  var interactionType: InteractionType
  
  var interactorRef: String
  
  var json: ParticipantData
  
  var label: String
  
  var `object`: interactor | interaction
  
  var organism: Organism
  
  var participants: js.UndefOr[js.Array[Participant]] = js.undefined
  
  var sequence: String
  
  var `type`: Type
}
object Participant {
  
  inline def apply(
    experiment: Experiment,
    id: String,
    identifier: Identifier,
    identifiers: js.Array[Identifier],
    interactionType: InteractionType,
    interactorRef: String,
    json: ParticipantData,
    label: String,
    `object`: interactor | interaction,
    organism: Organism,
    sequence: String,
    `type`: Type
  ): Participant = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], interactionType = interactionType.asInstanceOf[js.Any], interactorRef = interactorRef.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], organism = organism.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Participant] (val x: Self) extends AnyVal {
    
    inline def setAnnotationSets(value: Map[String, Set[Annotation]]): Self = StObject.set(x, "annotationSets", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSetsUndefined: Self = StObject.set(x, "annotationSets", js.undefined)
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setInteractionType(value: InteractionType): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    
    inline def setInteractorRef(value: String): Self = StObject.set(x, "interactorRef", value.asInstanceOf[js.Any])
    
    inline def setJson(value: ParticipantData): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setObject(value: interactor | interaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOrganism(value: Organism): Self = StObject.set(x, "organism", value.asInstanceOf[js.Any])
    
    inline def setParticipants(value: js.Array[Participant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "participants", js.Array(value*))
    
    inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
