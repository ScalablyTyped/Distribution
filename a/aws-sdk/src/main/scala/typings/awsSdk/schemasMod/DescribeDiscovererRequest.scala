package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDiscovererRequest extends js.Object {
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string = js.native
}

object DescribeDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: string): DescribeDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDiscovererRequest]
  }
  @scala.inline
  implicit class DescribeDiscovererRequestOps[Self <: DescribeDiscovererRequest] (val x: Self) extends AnyVal {
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
    def setDiscovererId(value: string): Self = this.set("DiscovererId", value.asInstanceOf[js.Any])
  }
  
}

