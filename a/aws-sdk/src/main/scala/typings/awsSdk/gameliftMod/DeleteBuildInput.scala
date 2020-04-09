package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBuildInput extends js.Object {
  /**
    * A unique identifier for a build to delete. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn = js.native
}

object DeleteBuildInput {
  @scala.inline
  def apply(BuildId: BuildIdOrArn): DeleteBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBuildInput]
  }
}

