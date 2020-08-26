package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationObjectStorageRequest extends js.Object {
  /**
    * Optional. The access key is used if credentials are required to access the self-managed object storage server.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.native
  /**
    * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
    */
  var AgentArns: AgentArnList = js.native
  /**
    * The bucket on the self-managed object storage server that is used to read data from.
    */
  var BucketName: ObjectStorageBucketName = js.native
  /**
    * Optional. The secret key is used if credentials are required to access the self-managed object storage server.
    */
  var SecretKey: js.UndefOr[ObjectStorageSecretKey] = js.native
  /**
    * The name of the self-managed object storage server. This value is the IP address or Domain Name Service (DNS) name of the object storage server. An agent uses this host name to mount the object storage server in a network. 
    */
  var ServerHostname: typings.awsSdk.datasyncMod.ServerHostname = js.native
  /**
    * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed object storage server requires one.
    */
  var ServerPort: js.UndefOr[ObjectStorageServerPort] = js.native
  /**
    * The protocol that the object storage server uses to communicate. Valid values are HTTP or HTTPS.
    */
  var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.native
  /**
    * The subdirectory in the self-managed object storage server that is used to read data from.
    */
  var Subdirectory: js.UndefOr[S3Subdirectory] = js.native
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[InputTagList] = js.native
}

object CreateLocationObjectStorageRequest {
  @scala.inline
  def apply(AgentArns: AgentArnList, BucketName: ObjectStorageBucketName, ServerHostname: ServerHostname): CreateLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any], BucketName = BucketName.asInstanceOf[js.Any], ServerHostname = ServerHostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationObjectStorageRequest]
  }
  @scala.inline
  implicit class CreateLocationObjectStorageRequestOps[Self <: CreateLocationObjectStorageRequest] (val x: Self) extends AnyVal {
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
    def setAgentArnsVarargs(value: AgentArn*): Self = this.set("AgentArns", js.Array(value :_*))
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = this.set("AgentArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketName(value: ObjectStorageBucketName): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerHostname(value: ServerHostname): Self = this.set("ServerHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKey(value: ObjectStorageAccessKey): Self = this.set("AccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("AccessKey", js.undefined)
    @scala.inline
    def setSecretKey(value: ObjectStorageSecretKey): Self = this.set("SecretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretKey: Self = this.set("SecretKey", js.undefined)
    @scala.inline
    def setServerPort(value: ObjectStorageServerPort): Self = this.set("ServerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerPort: Self = this.set("ServerPort", js.undefined)
    @scala.inline
    def setServerProtocol(value: ObjectStorageServerProtocol): Self = this.set("ServerProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerProtocol: Self = this.set("ServerProtocol", js.undefined)
    @scala.inline
    def setSubdirectory(value: S3Subdirectory): Self = this.set("Subdirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdirectory: Self = this.set("Subdirectory", js.undefined)
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: InputTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

