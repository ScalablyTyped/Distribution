package typings.awsSdkClientLambdaNode.typesEnvironmentResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod.UnmarshalledEnvironmentError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEnvironmentResponse extends EnvironmentResponse {
  /**
    * <p>Error messages for environment variables that could not be applied.</p>
    */
  @JSName("Error")
  var Error_UnmarshalledEnvironmentResponse: js.UndefOr[UnmarshalledEnvironmentError] = js.undefined
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables_UnmarshalledEnvironmentResponse: js.UndefOr[StringDictionary[String]] = js.undefined
}

object UnmarshalledEnvironmentResponse {
  @scala.inline
  def apply(Error: UnmarshalledEnvironmentError = null, Variables: StringDictionary[String] = null): UnmarshalledEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEnvironmentResponse]
  }
}

