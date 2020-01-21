package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVariablesRequest extends js.Object {
  /**
    * The max size per page determined for the get variable request. 
    */
  var maxResults: js.UndefOr[VariablesMaxResults] = js.native
  /**
    * The name of the variable. 
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The next page token of the get variable request. 
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetVariablesRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, name: String = null, nextToken: String = null): GetVariablesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVariablesRequest]
  }
}

