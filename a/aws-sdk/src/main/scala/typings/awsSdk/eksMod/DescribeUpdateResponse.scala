package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUpdateResponse extends js.Object {
  /**
    * The full description of the specified update.
    */
  var update: js.UndefOr[Update] = js.native
}

object DescribeUpdateResponse {
  @scala.inline
  def apply(): DescribeUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUpdateResponse]
  }
  @scala.inline
  implicit class DescribeUpdateResponseOps[Self <: DescribeUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUpdate(value: Update): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

