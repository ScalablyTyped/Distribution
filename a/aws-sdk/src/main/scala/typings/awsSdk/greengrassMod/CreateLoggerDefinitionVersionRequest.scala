package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoggerDefinitionVersionRequest extends js.Object {
  
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
  implicit class CreateLoggerDefinitionVersionRequestOps[Self <: CreateLoggerDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoggerDefinitionId(value: string): Self = this.set("LoggerDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientToken(value: string): Self = this.set("AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmznClientToken: Self = this.set("AmznClientToken", js.undefined)
    
    @scala.inline
    def setLoggersVarargs(value: Logger*): Self = this.set("Loggers", js.Array(value :_*))
    
    @scala.inline
    def setLoggers(value: listOfLogger): Self = this.set("Loggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggers: Self = this.set("Loggers", js.undefined)
  }
}
