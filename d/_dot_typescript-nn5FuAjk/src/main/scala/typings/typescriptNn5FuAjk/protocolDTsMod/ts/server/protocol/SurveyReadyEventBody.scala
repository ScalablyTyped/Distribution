package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurveyReadyEventBody extends StObject {
  
  /** Name of the survey. This is an internal machine- and programmer-friendly name */
  var surveyId: String
}
object SurveyReadyEventBody {
  
  inline def apply(surveyId: String): SurveyReadyEventBody = {
    val __obj = js.Dynamic.literal(surveyId = surveyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyReadyEventBody]
  }
  
  extension [Self <: SurveyReadyEventBody](x: Self) {
    
    inline def setSurveyId(value: String): Self = StObject.set(x, "surveyId", value.asInstanceOf[js.Any])
  }
}
