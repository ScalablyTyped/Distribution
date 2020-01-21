package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppRequest extends js.Object {
  /**
    * The app ID.
    */
  var AppId: String = js.native
}

object DeleteAppRequest {
  @scala.inline
  def apply(AppId: String): DeleteAppRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAppRequest]
  }
}

