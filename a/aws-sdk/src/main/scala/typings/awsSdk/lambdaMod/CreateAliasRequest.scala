package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAliasRequest extends js.Object {
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: Version = js.native
  /**
    * The name of the alias.
    */
  var Name: Alias = js.native
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.native
}

object CreateAliasRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, FunctionVersion: Version, Name: Alias): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], FunctionVersion = FunctionVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
  @scala.inline
  implicit class CreateAliasRequestOps[Self <: CreateAliasRequest] (val x: Self) extends AnyVal {
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
    def setFunctionVersion(value: Version): Self = this.set("FunctionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Alias): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setRoutingConfig(value: AliasRoutingConfiguration): Self = this.set("RoutingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingConfig: Self = this.set("RoutingConfig", js.undefined)
  }
  
}

