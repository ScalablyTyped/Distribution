package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUpdatedInBackgroundEventBody extends StObject {
  
  /**
    * Current set of open files
    */
  var openFiles: Array[String]
}
object ProjectsUpdatedInBackgroundEventBody {
  
  inline def apply(openFiles: Array[String]): ProjectsUpdatedInBackgroundEventBody = {
    val __obj = js.Dynamic.literal(openFiles = openFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdatedInBackgroundEventBody]
  }
  
  extension [Self <: ProjectsUpdatedInBackgroundEventBody](x: Self) {
    
    inline def setOpenFiles(value: Array[String]): Self = StObject.set(x, "openFiles", value.asInstanceOf[js.Any])
  }
}
