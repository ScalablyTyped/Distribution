package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConditionalForwardersResult extends js.Object {
  /**
    * The list of conditional forwarders that have been created.
    */
  var ConditionalForwarders: js.UndefOr[typings.awsSdk.directoryserviceMod.ConditionalForwarders] = js.native
}

object DescribeConditionalForwardersResult {
  @scala.inline
  def apply(): DescribeConditionalForwardersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConditionalForwardersResult]
  }
  @scala.inline
  implicit class DescribeConditionalForwardersResultOps[Self <: DescribeConditionalForwardersResult] (val x: Self) extends AnyVal {
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
    def setConditionalForwardersVarargs(value: ConditionalForwarder*): Self = this.set("ConditionalForwarders", js.Array(value :_*))
    @scala.inline
    def setConditionalForwarders(value: ConditionalForwarders): Self = this.set("ConditionalForwarders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalForwarders: Self = this.set("ConditionalForwarders", js.undefined)
  }
  
}

