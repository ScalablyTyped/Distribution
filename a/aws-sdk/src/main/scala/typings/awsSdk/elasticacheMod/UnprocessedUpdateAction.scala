package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedUpdateAction extends js.Object {
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The error message that describes the reason the request was not processed
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The error type for requests that are not processed
    */
  var ErrorType: js.UndefOr[String] = js.native
  /**
    * The replication group ID
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
}

object UnprocessedUpdateAction {
  @scala.inline
  def apply(
    CacheClusterId: String = null,
    ErrorMessage: String = null,
    ErrorType: String = null,
    ReplicationGroupId: String = null,
    ServiceUpdateName: String = null
  ): UnprocessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (ErrorType != null) __obj.updateDynamic("ErrorType")(ErrorType.asInstanceOf[js.Any])
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId.asInstanceOf[js.Any])
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedUpdateAction]
  }
}

