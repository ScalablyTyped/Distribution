package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoggerDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
  
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[listOfLogger] = js.native
}
object CreateLoggerDefinitionVersionRequest {
  
  @scala.inline
  def apply(LoggerDefinitionId: string): CreateLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoggerDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class CreateLoggerDefinitionVersionRequestMutableBuilder[Self <: CreateLoggerDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggers(value: listOfLogger): Self = StObject.set(x, "Loggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggersUndefined: Self = StObject.set(x, "Loggers", js.undefined)
    
    @scala.inline
    def setLoggersVarargs(value: Logger*): Self = StObject.set(x, "Loggers", js.Array(value :_*))
  }
}
