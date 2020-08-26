package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationObjectStorageResponse extends js.Object {
  /**
    * Optional. The access key is used if credentials are required to access the self-managed object storage server.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.native
  /**
    * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.native
  /**
    * The time that the self-managed object storage server agent was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  /**
    * The Amazon Resource Name (ARN) of the self-managed object storage server location to describe.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the source self-managed object storage server location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
  /**
    * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS).
    */
  var ServerPort: js.UndefOr[ObjectStorageServerPort] = js.native
  /**
    * The protocol that the object storage server uses to communicate. Valid values are HTTP or HTTPS.
    */
  var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.native
}

object DescribeLocationObjectStorageResponse {
  @scala.inline
  def apply(): DescribeLocationObjectStorageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationObjectStorageResponse]
  }
  @scala.inline
  implicit class DescribeLocationObjectStorageResponseOps[Self <: DescribeLocationObjectStorageResponse] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: ObjectStorageAccessKey): Self = this.set("AccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("AccessKey", js.undefined)
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = this.set("AgentArns", js.Array(value :_*))
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = this.set("AgentArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentArns: Self = this.set("AgentArns", js.undefined)
    @scala.inline
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
    @scala.inline
    def setLocationUri(value: LocationUri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
    @scala.inline
    def setServerPort(value: ObjectStorageServerPort): Self = this.set("ServerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerPort: Self = this.set("ServerPort", js.undefined)
    @scala.inline
    def setServerProtocol(value: ObjectStorageServerProtocol): Self = this.set("ServerProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerProtocol: Self = this.set("ServerProtocol", js.undefined)
  }
  
}

