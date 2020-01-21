package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseParametersRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database parameters request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of your database for which to get parameters.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object GetRelationalDatabaseParametersRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName, pageToken: String = null): GetRelationalDatabaseParametersRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseParametersRequest]
  }
}

