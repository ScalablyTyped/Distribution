package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommunicationsResponse extends js.Object {
  /**
    * The communications for the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.native
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeCommunicationsResponse {
  @scala.inline
  def apply(communications: CommunicationList = null, nextToken: NextToken = null): DescribeCommunicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (communications != null) __obj.updateDynamic("communications")(communications.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCommunicationsResponse]
  }
}

