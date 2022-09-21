package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingErrorCheck extends StObject {
  
  var fileName: NormalizedPath
  
  var project: Project
}
object PendingErrorCheck {
  
  inline def apply(fileName: NormalizedPath, project: Project): PendingErrorCheck = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingErrorCheck]
  }
  
  extension [Self <: PendingErrorCheck](x: Self) {
    
    inline def setFileName(value: NormalizedPath): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
