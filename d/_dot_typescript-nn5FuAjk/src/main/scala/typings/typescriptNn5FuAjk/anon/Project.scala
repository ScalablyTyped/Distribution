package typings.typescriptNn5FuAjk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  var project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project
  
  var reason: String
}
object Project {
  
  inline def apply(project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project, reason: String): Project = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  extension [Self <: Project](x: Self) {
    
    inline def setProject(value: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
