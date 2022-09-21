package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLoadingStartEventBody extends StObject {
  
  /** name of the project */
  var projectName: String
  
  /** reason for loading */
  var reason: String
}
object ProjectLoadingStartEventBody {
  
  inline def apply(projectName: String, reason: String): ProjectLoadingStartEventBody = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLoadingStartEventBody]
  }
  
  extension [Self <: ProjectLoadingStartEventBody](x: Self) {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
