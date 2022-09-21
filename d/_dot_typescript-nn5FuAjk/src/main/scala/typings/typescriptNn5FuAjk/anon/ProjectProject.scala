package typings.typescriptNn5FuAjk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectProject extends StObject {
  
  var project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project
}
object ProjectProject {
  
  inline def apply(project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project): ProjectProject = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectProject]
  }
  
  extension [Self <: ProjectProject](x: Self) {
    
    inline def setProject(value: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
