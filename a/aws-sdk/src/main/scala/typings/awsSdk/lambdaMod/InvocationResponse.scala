package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvocationResponse extends js.Object {
  /**
    * The version of the function that executed. When you invoke a function with an alias, this indicates which version the alias resolved to.
    */
  var ExecutedVersion: js.UndefOr[Version] = js.native
  /**
    * If present, indicates that an error occurred during function execution. Details about the error are included in the response payload.
    */
  var FunctionError: js.UndefOr[String] = js.native
  /**
    * The last 4 KB of the execution log, which is base64 encoded.
    */
  var LogResult: js.UndefOr[String] = js.native
  /**
    * The response from the function, or an error object.
    */
  var Payload: js.UndefOr[_Blob] = js.native
  /**
    * The HTTP status code is in the 200 range for a successful request. For the RequestResponse invocation type, this status code is 200. For the Event invocation type, this status code is 202. For the DryRun invocation type, the status code is 204.
    */
  var StatusCode: js.UndefOr[Integer] = js.native
}

object InvocationResponse {
  @scala.inline
  def apply(
    ExecutedVersion: Version = null,
    FunctionError: String = null,
    LogResult: String = null,
    Payload: _Blob = null,
    StatusCode: Int | Double = null
  ): InvocationResponse = {
    val __obj = js.Dynamic.literal()
    if (ExecutedVersion != null) __obj.updateDynamic("ExecutedVersion")(ExecutedVersion.asInstanceOf[js.Any])
    if (FunctionError != null) __obj.updateDynamic("FunctionError")(FunctionError.asInstanceOf[js.Any])
    if (LogResult != null) __obj.updateDynamic("LogResult")(LogResult.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationResponse]
  }
}

