package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments to CloseExternalProjectRequest request
  */
trait CloseExternalProjectRequestArgs extends StObject {
  
  /**
    * Name of the project to close
    */
  var projectFileName: String
}
object CloseExternalProjectRequestArgs {
  
  inline def apply(projectFileName: String): CloseExternalProjectRequestArgs = {
    val __obj = js.Dynamic.literal(projectFileName = projectFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseExternalProjectRequestArgs]
  }
  
  extension [Self <: CloseExternalProjectRequestArgs](x: Self) {
    
    inline def setProjectFileName(value: String): Self = StObject.set(x, "projectFileName", value.asInstanceOf[js.Any])
  }
}
