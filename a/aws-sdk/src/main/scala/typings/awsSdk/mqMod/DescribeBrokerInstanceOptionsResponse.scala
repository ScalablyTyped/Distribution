package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBrokerInstanceOptionsResponse extends js.Object {
  /**
    * List of available broker instance options.
    */
  var BrokerInstanceOptions: js.UndefOr[listOfBrokerInstanceOption] = js.native
  /**
    * Required. The maximum number of instance options that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integerMin5Max100] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object DescribeBrokerInstanceOptionsResponse {
  @scala.inline
  def apply(
    BrokerInstanceOptions: listOfBrokerInstanceOption = null,
    MaxResults: Int | Double = null,
    NextToken: string = null
  ): DescribeBrokerInstanceOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerInstanceOptions != null) __obj.updateDynamic("BrokerInstanceOptions")(BrokerInstanceOptions.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBrokerInstanceOptionsResponse]
  }
}

