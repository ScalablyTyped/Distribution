package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestUploadCredentialsInput extends js.Object {
  /**
    * A unique identifier for a build to get credentials for. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn = js.native
}

object RequestUploadCredentialsInput {
  @scala.inline
  def apply(BuildId: BuildIdOrArn): RequestUploadCredentialsInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUploadCredentialsInput]
  }
}

