package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPRange extends js.Object {
  /**
    * The IP range in Classless Inter-Domain Routing (CIDR) notation.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * The status of the IP range, for example, "authorized".
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The list of tags for the IP range.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object IPRange {
  @scala.inline
  def apply(CIDRIP: String = null, Status: String = null, Tags: TagList = null): IPRange = {
    val __obj = js.Dynamic.literal()
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPRange]
  }
}

