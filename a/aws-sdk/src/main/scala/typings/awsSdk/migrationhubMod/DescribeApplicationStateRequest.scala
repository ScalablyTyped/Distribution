package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationStateRequest extends js.Object {
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsSdk.migrationhubMod.ApplicationId = js.native
}

object DescribeApplicationStateRequest {
  @scala.inline
  def apply(ApplicationId: ApplicationId): DescribeApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeApplicationStateRequest]
  }
}

