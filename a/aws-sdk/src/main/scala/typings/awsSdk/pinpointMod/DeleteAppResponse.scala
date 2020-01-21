package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppResponse extends js.Object {
  var ApplicationResponse: typings.awsSdk.pinpointMod.ApplicationResponse = js.native
}

object DeleteAppResponse {
  @scala.inline
  def apply(ApplicationResponse: ApplicationResponse): DeleteAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAppResponse]
  }
}

