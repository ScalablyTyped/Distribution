package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProvisionedConcurrencyConfigRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The version number or alias name.
    */
  var Qualifier: typings.awsSdk.lambdaMod.Qualifier = js.native
}

object GetProvisionedConcurrencyConfigRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, Qualifier: Qualifier): GetProvisionedConcurrencyConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Qualifier = Qualifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetProvisionedConcurrencyConfigRequest]
  }
}

