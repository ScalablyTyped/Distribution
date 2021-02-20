package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLoggerDefinitionRequest extends StObject {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.native
}
object UpdateLoggerDefinitionRequest {
  
  @scala.inline
  def apply(LoggerDefinitionId: string): UpdateLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoggerDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateLoggerDefinitionRequestMutableBuilder[Self <: UpdateLoggerDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
