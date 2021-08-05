package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueryDefinitionResponse extends StObject {
  
  /**
    * A value of TRUE indicates that the operation succeeded. FALSE indicates that the operation failed.
    */
  var success: js.UndefOr[Success] = js.undefined
}
object DeleteQueryDefinitionResponse {
  
  inline def apply(): DeleteQueryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueryDefinitionResponse]
  }
  
  extension [Self <: DeleteQueryDefinitionResponse](x: Self) {
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
