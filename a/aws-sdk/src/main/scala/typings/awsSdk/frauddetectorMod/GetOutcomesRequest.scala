package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutcomesRequest extends js.Object {
  /**
    * The maximum number of objects to return for the request. 
    */
  var maxResults: js.UndefOr[OutcomesMaxResults] = js.native
  /**
    * The name of the outcome or outcomes to get.
    */
  var name: js.UndefOr[identifier] = js.native
  /**
    * The next page token for the request. 
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetOutcomesRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[OutcomesMaxResults] = js.undefined,
    name: identifier = null,
    nextToken: String = null
  ): GetOutcomesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutcomesRequest]
  }
}

