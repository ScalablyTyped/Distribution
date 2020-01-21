package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerDefinitionVersion extends js.Object {
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[listOfLogger] = js.native
}

object LoggerDefinitionVersion {
  @scala.inline
  def apply(Loggers: listOfLogger = null): LoggerDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Loggers != null) __obj.updateDynamic("Loggers")(Loggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerDefinitionVersion]
  }
}

