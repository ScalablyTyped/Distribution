package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBrokerEngineTypesRequest extends js.Object {
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[string] = js.native
  /**
    * The maximum number of engine types that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mqMod.MaxResults] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object DescribeBrokerEngineTypesRequest {
  @scala.inline
  def apply(
    EngineType: string = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: string = null
  ): DescribeBrokerEngineTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBrokerEngineTypesRequest]
  }
}

