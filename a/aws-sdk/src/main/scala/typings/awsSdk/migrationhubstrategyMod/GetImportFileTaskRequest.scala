package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportFileTaskRequest extends StObject {
  
  /**
    *  The ID of the import file task. This ID is returned in the response of StartImportFileTask. 
    */
  var id: String
}
object GetImportFileTaskRequest {
  
  inline def apply(id: String): GetImportFileTaskRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportFileTaskRequest]
  }
  
  extension [Self <: GetImportFileTaskRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
