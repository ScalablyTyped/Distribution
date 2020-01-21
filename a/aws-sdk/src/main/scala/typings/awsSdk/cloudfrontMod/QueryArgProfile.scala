package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryArgProfile extends js.Object {
  /**
    * ID of profile to use for field-level encryption query argument-profile mapping
    */
  var ProfileId: String = js.native
  /**
    * Query argument for field-level encryption query argument-profile mapping.
    */
  var QueryArg: String = js.native
}

object QueryArgProfile {
  @scala.inline
  def apply(ProfileId: String, QueryArg: String): QueryArgProfile = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any], QueryArg = QueryArg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryArgProfile]
  }
}

