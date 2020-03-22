package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseParametersResult extends js.Object {
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseParameters request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational database parameters request.
    */
  var parameters: js.UndefOr[RelationalDatabaseParameterList] = js.native
}

object GetRelationalDatabaseParametersResult {
  @scala.inline
  def apply(nextPageToken: String = null, parameters: RelationalDatabaseParameterList = null): GetRelationalDatabaseParametersResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseParametersResult]
  }
}

