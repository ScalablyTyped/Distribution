package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandidateWindowParameter extends StObject {
  
  /** ID of the engine to set properties on. */
  var engineID: String = js.native
  
  var properties: CandidateWindowParameterProperties = js.native
}
object CandidateWindowParameter {
  
  @scala.inline
  def apply(engineID: String, properties: CandidateWindowParameterProperties): CandidateWindowParameter = {
    val __obj = js.Dynamic.literal(engineID = engineID.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateWindowParameter]
  }
  
  @scala.inline
  implicit class CandidateWindowParameterMutableBuilder[Self <: CandidateWindowParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineID(value: String): Self = StObject.set(x, "engineID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CandidateWindowParameterProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
