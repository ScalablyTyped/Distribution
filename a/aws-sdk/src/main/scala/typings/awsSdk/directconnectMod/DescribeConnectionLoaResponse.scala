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
  def apply(): DescribeConnectionLoaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionLoaResponse]
  }
  @scala.inline
  implicit class DescribeConnectionLoaResponseOps[Self <: DescribeConnectionLoaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoa(value: Loa): Self = this.set("loa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoa: Self = this.set("loa", js.undefined)
  }
  
}

