package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVersionsByFunctionRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of versions to return.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.native
}

object ListVersionsByFunctionRequest {
  @scala.inline
  def apply(
    FunctionName: NamespacedFunctionName,
    Marker: String = null,
    MaxItems: js.UndefOr[MaxListItems] = js.undefined
  ): ListVersionsByFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVersionsByFunctionRequest]
  }
}

