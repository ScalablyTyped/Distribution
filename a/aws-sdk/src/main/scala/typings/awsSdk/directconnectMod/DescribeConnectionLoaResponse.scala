package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConnectionLoaResponse extends js.Object {
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.native
}

object DescribeConnectionLoaResponse {
  @scala.inline
  def apply(loa: Loa = null): DescribeConnectionLoaResponse = {
    val __obj = js.Dynamic.literal()
    if (loa != null) __obj.updateDynamic("loa")(loa.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionLoaResponse]
  }
}

