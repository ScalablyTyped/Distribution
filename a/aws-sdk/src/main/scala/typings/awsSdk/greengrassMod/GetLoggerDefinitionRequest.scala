package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoggerDefinitionRequest extends js.Object {
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
}

