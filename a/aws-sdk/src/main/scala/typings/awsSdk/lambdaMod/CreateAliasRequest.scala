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
  def apply(
    FunctionName: FunctionName,
    FunctionVersion: Version,
    Name: Alias,
    Description: Description = null,
    RoutingConfig: AliasRoutingConfiguration = null
  ): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], FunctionVersion = FunctionVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
}

