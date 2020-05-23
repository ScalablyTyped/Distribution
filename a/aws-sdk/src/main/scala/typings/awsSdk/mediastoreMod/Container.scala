package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the container. The ARN has the following format: arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;  For example: arn:aws:mediastore:us-west-2:111122223333:container/movies 
    */
  var ARN: js.UndefOr[ContainerARN] = js.native
  /**
    * The state of access logging on the container. This value is false by default, indicating that AWS Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access logging on the container, MediaStore changes this value to true, indicating that the service delivers access logs for objects stored in that container to CloudWatch Logs.
    */
  var AccessLoggingEnabled: js.UndefOr[ContainerAccessLoggingEnabled] = js.native
  /**
    * Unix timestamp.
    */
  var CreationTime: js.UndefOr[TimeStamp] = js.native
  /**
    * The DNS endpoint of the container. Use the endpoint to identify the specific container when sending requests to the data plane. The service assigns this value when the container is created. Once the value has been assigned, it does not change.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.mediastoreMod.Endpoint] = js.native
  /**
    * The name of the container.
    */
  var Name: js.UndefOr[ContainerName] = js.native
  /**
    * The status of container creation or deletion. The status is one of the following: CREATING, ACTIVE, or DELETING. While the service is creating the container, the status is CREATING. When the endpoint is available, the status changes to ACTIVE.
    */
  var Status: js.UndefOr[ContainerStatus] = js.native
}

object Container {
  @scala.inline
  def apply(
    ARN: ContainerARN = null,
    AccessLoggingEnabled: js.UndefOr[ContainerAccessLoggingEnabled] = js.undefined,
    CreationTime: TimeStamp = null,
    Endpoint: Endpoint = null,
    Name: ContainerName = null,
    Status: ContainerStatus = null
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (!js.isUndefined(AccessLoggingEnabled)) __obj.updateDynamic("AccessLoggingEnabled")(AccessLoggingEnabled.get.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

