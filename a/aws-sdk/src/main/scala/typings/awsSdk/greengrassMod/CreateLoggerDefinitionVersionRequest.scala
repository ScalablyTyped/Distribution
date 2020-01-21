package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(LoggerDefinitionId: string, AmznClientToken: string = null, Loggers: listOfLogger = null): CreateLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Loggers != null) __obj.updateDynamic("Loggers")(Loggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoggerDefinitionVersionRequest]
  }
}

