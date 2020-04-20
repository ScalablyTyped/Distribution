package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoggerDefinitionRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
}

object DeleteLoggerDefinitionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: string): DeleteLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggerDefinitionRequest]
  }
}

