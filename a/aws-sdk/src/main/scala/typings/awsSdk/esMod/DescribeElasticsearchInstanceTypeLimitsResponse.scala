package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
  var LimitsByRole: js.UndefOr[typings.awsSdk.esMod.LimitsByRole] = js.native
}

object DescribeElasticsearchInstanceTypeLimitsResponse {
  @scala.inline
  def apply(): DescribeElasticsearchInstanceTypeLimitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
  }
  @scala.inline
  implicit class DescribeElasticsearchInstanceTypeLimitsResponseOps[Self <: DescribeElasticsearchInstanceTypeLimitsResponse] (val x: Self) extends AnyVal {
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
    def setLimitsByRole(value: LimitsByRole): Self = this.set("LimitsByRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitsByRole: Self = this.set("LimitsByRole", js.undefined)
  }
  
}

