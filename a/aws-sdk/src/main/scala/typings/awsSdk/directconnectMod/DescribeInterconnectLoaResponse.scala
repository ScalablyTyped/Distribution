package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInterconnectLoaResponse extends js.Object {
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.native
}

object DescribeInterconnectLoaResponse {
  @scala.inline
  def apply(loa: Loa = null): DescribeInterconnectLoaResponse = {
    val __obj = js.Dynamic.literal()
    if (loa != null) __obj.updateDynamic("loa")(loa.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInterconnectLoaResponse]
  }
}

