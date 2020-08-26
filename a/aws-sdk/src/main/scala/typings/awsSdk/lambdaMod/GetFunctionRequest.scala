package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionRequest extends js.Object {
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  /**
    * Specify a version or alias to get details about a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.lambdaMod.Qualifier] = js.native
}

object GetFunctionRequest {
  @scala.inline
  def apply(FunctionName: NamespacedFunctionName): GetFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionRequest]
  }
  @scala.inline
  implicit class GetFunctionRequestOps[Self <: GetFunctionRequest] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: NamespacedFunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifier(value: Qualifier): Self = this.set("Qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("Qualifier", js.undefined)
  }
  
}

