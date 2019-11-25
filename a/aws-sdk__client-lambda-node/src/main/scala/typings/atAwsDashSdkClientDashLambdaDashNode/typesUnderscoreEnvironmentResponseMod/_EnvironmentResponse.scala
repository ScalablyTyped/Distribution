package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentErrorMod._EnvironmentError
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EnvironmentResponse extends js.Object {
  /**
    * <p>Error messages for environment variables that could not be applied.</p>
    */
  var Error: js.UndefOr[_EnvironmentError] = js.undefined
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  var Variables: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
}

object _EnvironmentResponse {
  @scala.inline
  def apply(
    Error: _EnvironmentError = null,
    Variables: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null
  ): _EnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EnvironmentResponse]
  }
}

