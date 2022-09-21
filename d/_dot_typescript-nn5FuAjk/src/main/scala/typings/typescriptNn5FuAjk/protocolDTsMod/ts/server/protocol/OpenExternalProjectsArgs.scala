package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments to OpenExternalProjectsRequest
  */
trait OpenExternalProjectsArgs extends StObject {
  
  /**
    * List of external projects to open or update
    */
  var projects: Array[ExternalProject]
}
object OpenExternalProjectsArgs {
  
  inline def apply(projects: Array[ExternalProject]): OpenExternalProjectsArgs = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenExternalProjectsArgs]
  }
  
  extension [Self <: OpenExternalProjectsArgs](x: Self) {
    
    inline def setProjects(value: Array[ExternalProject]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}
