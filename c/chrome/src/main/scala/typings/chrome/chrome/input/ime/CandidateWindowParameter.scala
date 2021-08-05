package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateWindowParameter extends StObject {
  
  /** ID of the engine to set properties on. */
  var engineID: String
  
  var properties: CandidateWindowParameterProperties
}
object CandidateWindowParameter {
  
  inline def apply(engineID: String, properties: CandidateWindowParameterProperties): CandidateWindowParameter = {
    val __obj = js.Dynamic.literal(engineID = engineID.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateWindowParameter]
  }
  
  extension [Self <: CandidateWindowParameter](x: Self) {
    
    inline def setEngineID(value: String): Self = StObject.set(x, "engineID", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: CandidateWindowParameterProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
