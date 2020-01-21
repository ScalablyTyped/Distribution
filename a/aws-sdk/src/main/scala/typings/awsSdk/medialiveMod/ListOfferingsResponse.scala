package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOfferingsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * List of offerings
    */
  var Offerings: js.UndefOr[listOfOffering] = js.native
}

object ListOfferingsResponse {
  @scala.inline
  def apply(NextToken: string = null, Offerings: listOfOffering = null): ListOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Offerings != null) __obj.updateDynamic("Offerings")(Offerings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfferingsResponse]
  }
}

