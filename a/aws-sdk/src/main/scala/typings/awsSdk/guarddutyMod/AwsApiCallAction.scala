package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsApiCallAction extends js.Object {
  /**
    * The AWS API name.
    */
  var Api: js.UndefOr[String] = js.native
  /**
    * The AWS API caller type.
    */
  var CallerType: js.UndefOr[String] = js.native
  /**
    * The domain information for the AWS API call.
    */
  var DomainDetails: js.UndefOr[typings.awsSdk.guarddutyMod.DomainDetails] = js.native
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  /**
    * The AWS service name whose API was invoked.
    */
  var ServiceName: js.UndefOr[String] = js.native
}

object AwsApiCallAction {
  @scala.inline
  def apply(): AwsApiCallAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiCallAction]
  }
  @scala.inline
  implicit class AwsApiCallActionOps[Self <: AwsApiCallAction] (val x: Self) extends AnyVal {
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
    def setApi(value: String): Self = this.set("Api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("Api", js.undefined)
    @scala.inline
    def setCallerType(value: String): Self = this.set("CallerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallerType: Self = this.set("CallerType", js.undefined)
    @scala.inline
    def setDomainDetails(value: DomainDetails): Self = this.set("DomainDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainDetails: Self = this.set("DomainDetails", js.undefined)
    @scala.inline
    def setRemoteIpDetails(value: RemoteIpDetails): Self = this.set("RemoteIpDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteIpDetails: Self = this.set("RemoteIpDetails", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
  }
  
}

