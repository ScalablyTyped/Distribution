package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionOrigins extends js.Object {
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList] = js.native
}

object AwsCloudFrontDistributionOrigins {
  @scala.inline
  def apply(): AwsCloudFrontDistributionOrigins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOrigins]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginsOps[Self <: AwsCloudFrontDistributionOrigins] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: AwsCloudFrontDistributionOriginItem*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionOriginItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

