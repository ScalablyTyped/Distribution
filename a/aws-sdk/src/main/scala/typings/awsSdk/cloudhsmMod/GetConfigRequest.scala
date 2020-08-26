package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigRequest extends js.Object {
  /**
    * The ARN of the client.
    */
  var ClientArn: typings.awsSdk.cloudhsmMod.ClientArn = js.native
  /**
    * The client version.
    */
  var ClientVersion: typings.awsSdk.cloudhsmMod.ClientVersion = js.native
  /**
    * A list of ARNs that identify the high-availability partition groups that are associated with the client.
    */
  var HapgList: typings.awsSdk.cloudhsmMod.HapgList = js.native
}

object GetConfigRequest {
  @scala.inline
  def apply(ClientArn: ClientArn, ClientVersion: ClientVersion, HapgList: HapgList): GetConfigRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn.asInstanceOf[js.Any], ClientVersion = ClientVersion.asInstanceOf[js.Any], HapgList = HapgList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigRequest]
  }
  @scala.inline
  implicit class GetConfigRequestOps[Self <: GetConfigRequest] (val x: Self) extends AnyVal {
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
    def setClientArn(value: ClientArn): Self = this.set("ClientArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientVersion(value: ClientVersion): Self = this.set("ClientVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setHapgListVarargs(value: HapgArn*): Self = this.set("HapgList", js.Array(value :_*))
    @scala.inline
    def setHapgList(value: HapgList): Self = this.set("HapgList", value.asInstanceOf[js.Any])
  }
  
}

