package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceAction extends js.Object {
  /**
    * The token used to authenticate access to the Salesforce IoT Cloud Input Stream. The token is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
    */
  var token: SalesforceToken = js.native
  /**
    * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
    */
  var url: SalesforceEndpoint = js.native
}

object SalesforceAction {
  @scala.inline
  def apply(token: SalesforceToken, url: SalesforceEndpoint): SalesforceAction = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceAction]
  }
  @scala.inline
  implicit class SalesforceActionOps[Self <: SalesforceAction] (val x: Self) extends AnyVal {
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
    def setToken(value: SalesforceToken): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: SalesforceEndpoint): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

