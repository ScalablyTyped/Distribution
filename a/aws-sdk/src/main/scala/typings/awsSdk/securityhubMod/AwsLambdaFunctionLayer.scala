package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionLayer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Integer] = js.native
}

object AwsLambdaFunctionLayer {
  @scala.inline
  def apply(Arn: NonEmptyString = null, CodeSize: js.UndefOr[Integer] = js.undefined): AwsLambdaFunctionLayer = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (!js.isUndefined(CodeSize)) __obj.updateDynamic("CodeSize")(CodeSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionLayer]
  }
}

