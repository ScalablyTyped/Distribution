package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceData extends StObject {
  
  var interactorRef: String
  
  var participantRef: String
  
  var pos: String
}
object SequenceData {
  
  inline def apply(interactorRef: String, participantRef: String, pos: String): SequenceData = {
    val __obj = js.Dynamic.literal(interactorRef = interactorRef.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceData]
  }
  
  extension [Self <: SequenceData](x: Self) {
    
    inline def setInteractorRef(value: String): Self = StObject.set(x, "interactorRef", value.asInstanceOf[js.Any])
    
    inline def setParticipantRef(value: String): Self = StObject.set(x, "participantRef", value.asInstanceOf[js.Any])
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
