package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePlatformApplicationInput extends js.Object {
  /**
    * PlatformApplicationArn of platform application object to delete.
    */
  var PlatformApplicationArn: String = js.native
}

object DeletePlatformApplicationInput {
  @scala.inline
  def apply(PlatformApplicationArn: String): DeletePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePlatformApplicationInput]
  }
}

