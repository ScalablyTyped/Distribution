package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutingProfileSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the routing profile.
    */
  var Id: js.UndefOr[RoutingProfileId] = js.native
  /**
    * The name of the routing profile.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.native
}

object RoutingProfileSummary {
  @scala.inline
  def apply(): RoutingProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingProfileSummary]
  }
  @scala.inline
  implicit class RoutingProfileSummaryOps[Self <: RoutingProfileSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setId(value: RoutingProfileId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: RoutingProfileName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

