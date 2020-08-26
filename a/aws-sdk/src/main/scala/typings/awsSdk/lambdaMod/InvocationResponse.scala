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
  def apply(): InvocationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvocationResponse]
  }
  @scala.inline
  implicit class InvocationResponseOps[Self <: InvocationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecutedVersion(value: Version): Self = this.set("ExecutedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutedVersion: Self = this.set("ExecutedVersion", js.undefined)
    @scala.inline
    def setFunctionError(value: String): Self = this.set("FunctionError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionError: Self = this.set("FunctionError", js.undefined)
    @scala.inline
    def setLogResult(value: String): Self = this.set("LogResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogResult: Self = this.set("LogResult", js.undefined)
    @scala.inline
    def setPayload(value: _Blob): Self = this.set("Payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
    @scala.inline
    def setStatusCode(value: Integer): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("StatusCode", js.undefined)
  }
  
}

