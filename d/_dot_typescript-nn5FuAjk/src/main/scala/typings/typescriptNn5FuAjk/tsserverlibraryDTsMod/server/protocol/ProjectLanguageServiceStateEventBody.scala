package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLanguageServiceStateEventBody extends StObject {
  
  /**
    * True if language service state switched from disabled to enabled
    * and false otherwise.
    */
  var languageServiceEnabled: Boolean
  
  /**
    * Project name that has changes in the state of language service.
    * For configured projects this will be the config file path.
    * For external projects this will be the name of the projects specified when project was open.
    * For inferred projects this event is not raised.
    */
  var projectName: String
}
object ProjectLanguageServiceStateEventBody {
  
  inline def apply(languageServiceEnabled: Boolean, projectName: String): ProjectLanguageServiceStateEventBody = {
    val __obj = js.Dynamic.literal(languageServiceEnabled = languageServiceEnabled.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLanguageServiceStateEventBody]
  }
  
  extension [Self <: ProjectLanguageServiceStateEventBody](x: Self) {
    
    inline def setLanguageServiceEnabled(value: Boolean): Self = StObject.set(x, "languageServiceEnabled", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
