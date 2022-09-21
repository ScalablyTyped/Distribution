package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantData extends StObject {
  
  var bioRole: BioRole
  
  var expRole: ExpRole
  
  var features: js.Array[Feature]
  
  var id: String
  
  var identificationMethods: js.Array[IdentificationMethod]
  
  var interactorRef: String
}
object ParticipantData {
  
  inline def apply(
    bioRole: BioRole,
    expRole: ExpRole,
    features: js.Array[Feature],
    id: String,
    identificationMethods: js.Array[IdentificationMethod],
    interactorRef: String
  ): ParticipantData = {
    val __obj = js.Dynamic.literal(bioRole = bioRole.asInstanceOf[js.Any], expRole = expRole.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identificationMethods = identificationMethods.asInstanceOf[js.Any], interactorRef = interactorRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantData]
  }
  
  extension [Self <: ParticipantData](x: Self) {
    
    inline def setBioRole(value: BioRole): Self = StObject.set(x, "bioRole", value.asInstanceOf[js.Any])
    
    inline def setExpRole(value: ExpRole): Self = StObject.set(x, "expRole", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentificationMethods(value: js.Array[IdentificationMethod]): Self = StObject.set(x, "identificationMethods", value.asInstanceOf[js.Any])
    
    inline def setIdentificationMethodsVarargs(value: IdentificationMethod*): Self = StObject.set(x, "identificationMethods", js.Array(value*))
    
    inline def setInteractorRef(value: String): Self = StObject.set(x, "interactorRef", value.asInstanceOf[js.Any])
  }
}
