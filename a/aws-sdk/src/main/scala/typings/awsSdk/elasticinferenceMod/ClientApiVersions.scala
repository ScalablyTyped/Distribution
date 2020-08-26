package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApiVersions extends js.Object {
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[typings.awsSdk.elasticinferenceMod.apiVersion] = js.native
}

object ClientApiVersions {
  @scala.inline
  def apply(): ClientApiVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientApiVersions]
  }
  @scala.inline
  implicit class ClientApiVersionsOps[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: apiVersion): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
  }
  
}

