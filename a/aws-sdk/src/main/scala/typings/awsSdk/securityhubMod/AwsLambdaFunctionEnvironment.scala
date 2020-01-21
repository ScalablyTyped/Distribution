package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionEnvironment extends js.Object {
  /**
    * An AwsLambdaFunctionEnvironmentError object.
    */
  var Error: js.UndefOr[AwsLambdaFunctionEnvironmentError] = js.native
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[FieldMap] = js.native
}

object AwsLambdaFunctionEnvironment {
  @scala.inline
  def apply(Error: AwsLambdaFunctionEnvironmentError = null, Variables: FieldMap = null): AwsLambdaFunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionEnvironment]
  }
}

