package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLogSubscriptionRequest extends js.Object {
  /**
    * Identifier of the directory whose log subscription you want to delete.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object DeleteLogSubscriptionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DeleteLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLogSubscriptionRequest]
  }
}

