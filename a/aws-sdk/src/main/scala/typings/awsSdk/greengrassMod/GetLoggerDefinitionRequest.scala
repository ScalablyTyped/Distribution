package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoggerDefinitionRequest extends StObject {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
}
object GetLoggerDefinitionRequest {
  
  @scala.inline
  def apply(LoggerDefinitionId: string): GetLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggerDefinitionRequest]
  }
  
  @scala.inline
  implicit class GetLoggerDefinitionRequestMutableBuilder[Self <: GetLoggerDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
  }
}
