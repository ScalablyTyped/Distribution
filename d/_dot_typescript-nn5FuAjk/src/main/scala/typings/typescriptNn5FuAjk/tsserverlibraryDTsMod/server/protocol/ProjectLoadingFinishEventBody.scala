package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLoadingFinishEventBody extends StObject {
  
  /** name of the project */
  var projectName: String
}
object ProjectLoadingFinishEventBody {
  
  inline def apply(projectName: String): ProjectLoadingFinishEventBody = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLoadingFinishEventBody]
  }
  
  extension [Self <: ProjectLoadingFinishEventBody](x: Self) {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
