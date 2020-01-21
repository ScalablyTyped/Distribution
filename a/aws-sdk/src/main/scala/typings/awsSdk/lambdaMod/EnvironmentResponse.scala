package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentResponse extends js.Object {
  /**
    * Error messages for environment variables that couldn't be applied.
    */
  var Error: js.UndefOr[EnvironmentError] = js.native
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[EnvironmentVariables] = js.native
}

object EnvironmentResponse {
  @scala.inline
  def apply(Error: EnvironmentError = null, Variables: EnvironmentVariables = null): EnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentResponse]
  }
}

