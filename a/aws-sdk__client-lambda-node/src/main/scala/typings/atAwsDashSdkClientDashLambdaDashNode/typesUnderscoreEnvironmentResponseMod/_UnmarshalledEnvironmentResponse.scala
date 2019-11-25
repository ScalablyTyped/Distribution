package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentErrorMod._UnmarshalledEnvironmentError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEnvironmentResponse extends _EnvironmentResponse {
  /**
    * <p>Error messages for environment variables that could not be applied.</p>
    */
  @JSName("Error")
  var Error__UnmarshalledEnvironmentResponse: js.UndefOr[_UnmarshalledEnvironmentError] = js.undefined
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables__UnmarshalledEnvironmentResponse: js.UndefOr[StringDictionary[String]] = js.undefined
}

object _UnmarshalledEnvironmentResponse {
  @scala.inline
  def apply(Error: _UnmarshalledEnvironmentError = null, Variables: StringDictionary[String] = null): _UnmarshalledEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEnvironmentResponse]
  }
}

