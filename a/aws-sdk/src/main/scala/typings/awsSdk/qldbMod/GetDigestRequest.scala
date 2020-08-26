package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDigestRequest extends js.Object {
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object GetDigestRequest {
  @scala.inline
  def apply(Name: LedgerName): GetDigestRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDigestRequest]
  }
  @scala.inline
  implicit class GetDigestRequestOps[Self <: GetDigestRequest] (val x: Self) extends AnyVal {
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
    def setName(value: LedgerName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

