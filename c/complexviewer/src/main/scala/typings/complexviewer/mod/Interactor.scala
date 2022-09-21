package typings.complexviewer.mod

import typings.complexviewer.complexviewerStrings.interactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interactor
  extends StObject
     with Participant {
  
  @JSName("object")
  var object_Interactor: interactor
}
object Interactor {
  
  inline def apply(
    experiment: Experiment,
    id: String,
    identifier: Identifier,
    identifiers: js.Array[Identifier],
    interactionType: InteractionType,
    interactorRef: String,
    json: ParticipantData,
    label: String,
    organism: Organism,
    sequence: String,
    `type`: Type
  ): Interactor = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], interactionType = interactionType.asInstanceOf[js.Any], interactorRef = interactorRef.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], organism = organism.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("interactor")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interactor]
  }
  
  extension [Self <: Interactor](x: Self) {
    
    inline def setObject(value: interactor): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
