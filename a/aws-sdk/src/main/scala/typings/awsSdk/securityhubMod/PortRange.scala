package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortRange extends js.Object {
  /**
    * The first port in the port range.
    */
  var Begin: js.UndefOr[Integer] = js.native
  /**
    * The last port in the port range.
    */
  var End: js.UndefOr[Integer] = js.native
}

object PortRange {
  @scala.inline
  def apply(): PortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRange]
  }
  @scala.inline
  implicit class PortRangeOps[Self <: PortRange] (val x: Self) extends AnyVal {
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
    def setBegin(value: Integer): Self = this.set("Begin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBegin: Self = this.set("Begin", js.undefined)
    @scala.inline
    def setEnd(value: Integer): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
  }
  
}

