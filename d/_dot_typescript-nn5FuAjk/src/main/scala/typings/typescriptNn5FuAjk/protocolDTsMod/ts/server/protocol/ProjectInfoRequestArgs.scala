package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for ProjectInfoRequest request.
  */
trait ProjectInfoRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * Indicate if the file name list of the project is needed
    */
  var needFileNameList: Boolean
}
object ProjectInfoRequestArgs {
  
  inline def apply(file: String, needFileNameList: Boolean): ProjectInfoRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], needFileNameList = needFileNameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfoRequestArgs]
  }
  
  extension [Self <: ProjectInfoRequestArgs](x: Self) {
    
    inline def setNeedFileNameList(value: Boolean): Self = StObject.set(x, "needFileNameList", value.asInstanceOf[js.Any])
  }
}
