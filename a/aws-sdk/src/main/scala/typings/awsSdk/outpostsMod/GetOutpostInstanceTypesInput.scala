package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostInstanceTypesInput extends js.Object {
  var MaxResults: js.UndefOr[MaxResults1000] = js.native
  var NextToken: js.UndefOr[Token] = js.native
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId = js.native
}

object GetOutpostInstanceTypesInput {
  @scala.inline
  def apply(
    OutpostId: OutpostId,
    MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
    NextToken: Token = null
  ): GetOutpostInstanceTypesInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypesInput]
  }
}

