package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggerDefinitionRequest extends StObject {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string
}
object GetLoggerDefinitionRequest {
  
  inline def apply(LoggerDefinitionId: string): GetLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggerDefinitionRequest]
  }
  
  extension [Self <: GetLoggerDefinitionRequest](x: Self) {
    
    inline def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
  }
}
