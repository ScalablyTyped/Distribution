package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestGridSessionRequest extends js.Object {
  /**
    * The ARN for the project that this session belongs to. See CreateTestGridProject and ListTestGridProjects.
    */
  var projectArn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * An ARN that uniquely identifies a TestGridSession.
    */
  var sessionArn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * An ID associated with this session.
    */
  var sessionId: js.UndefOr[ResourceId] = js.native
}

object GetTestGridSessionRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn = null, sessionArn: DeviceFarmArn = null, sessionId: ResourceId = null): GetTestGridSessionRequest = {
    val __obj = js.Dynamic.literal()
    if (projectArn != null) __obj.updateDynamic("projectArn")(projectArn.asInstanceOf[js.Any])
    if (sessionArn != null) __obj.updateDynamic("sessionArn")(sessionArn.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestGridSessionRequest]
  }
}

