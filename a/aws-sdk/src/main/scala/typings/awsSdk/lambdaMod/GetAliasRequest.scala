package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAliasRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The name of the alias.
    */
  var Name: Alias = js.native
}

object GetAliasRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, Name: Alias): GetAliasRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAliasRequest]
  }
  @scala.inline
  implicit class GetAliasRequestOps[Self <: GetAliasRequest] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: FunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Alias): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

