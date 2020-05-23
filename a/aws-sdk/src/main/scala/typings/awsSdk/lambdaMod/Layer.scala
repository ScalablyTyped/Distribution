package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[LayerVersionArn] = js.native
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.native
}

object Layer {
  @scala.inline
  def apply(Arn: LayerVersionArn = null, CodeSize: js.UndefOr[Long] = js.undefined): Layer = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (!js.isUndefined(CodeSize)) __obj.updateDynamic("CodeSize")(CodeSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

