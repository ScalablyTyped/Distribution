package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivityTypesInput extends js.Object {
  /**
    * The name of the domain in which the activity types have been registered.
    */
  var domain: DomainName = js.native
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.native
  /**
    * If specified, only lists the activity types that have this name.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Specifies the registration status of the activity types to list.
    */
  var registrationStatus: RegistrationStatus = js.native
  /**
    * When set to true, returns the results in reverse order. By default, the results are returned in ascending alphabetical order by name of the activity types.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
}

object ListActivityTypesInput {
  @scala.inline
  def apply(
    domain: DomainName,
    registrationStatus: RegistrationStatus,
    maximumPageSize: Int | Double = null,
    name: Name = null,
    nextPageToken: PageToken = null,
    reverseOrder: js.UndefOr[Boolean] = js.undefined
  ): ListActivityTypesInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    if (maximumPageSize != null) __obj.updateDynamic("maximumPageSize")(maximumPageSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActivityTypesInput]
  }
}

