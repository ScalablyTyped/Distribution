package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConformancePackResponse extends js.Object {
  /**
    * ARN of the organization conformance pack.
    */
  var OrganizationConformancePackArn: js.UndefOr[StringWithCharLimit256] = js.native
}

object PutOrganizationConformancePackResponse {
  @scala.inline
  def apply(): PutOrganizationConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOrganizationConformancePackResponse]
  }
  @scala.inline
  implicit class PutOrganizationConformancePackResponseOps[Self <: PutOrganizationConformancePackResponse] (val x: Self) extends AnyVal {
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
    def setOrganizationConformancePackArn(value: StringWithCharLimit256): Self = this.set("OrganizationConformancePackArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationConformancePackArn: Self = this.set("OrganizationConformancePackArn", js.undefined)
  }
  
}

