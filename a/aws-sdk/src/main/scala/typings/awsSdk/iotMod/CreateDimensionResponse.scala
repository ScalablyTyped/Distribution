package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDimensionResponse extends js.Object {
  /**
    * The ARN (Amazon resource name) of the created dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.native
  /**
    * A unique identifier for the dimension.
    */
  var name: js.UndefOr[DimensionName] = js.native
}

object CreateDimensionResponse {
  @scala.inline
  def apply(arn: DimensionArn = null, name: DimensionName = null): CreateDimensionResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDimensionResponse]
  }
}

