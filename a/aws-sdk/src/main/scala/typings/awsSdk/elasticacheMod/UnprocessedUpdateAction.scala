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
  def apply(): UnprocessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedUpdateAction]
  }
  @scala.inline
  implicit class UnprocessedUpdateActionOps[Self <: UnprocessedUpdateAction] (val x: Self) extends AnyVal {
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
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusterId: Self = this.set("CacheClusterId", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setErrorType(value: String): Self = this.set("ErrorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorType: Self = this.set("ErrorType", js.undefined)
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
    @scala.inline
    def setServiceUpdateName(value: String): Self = this.set("ServiceUpdateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateName: Self = this.set("ServiceUpdateName", js.undefined)
  }
  
}

