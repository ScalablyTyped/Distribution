package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroupMember extends js.Object {
  /**
    * The ID for an origin in an origin group.
    */
  var OriginId: String = js.native
}

object OriginGroupMember {
  @scala.inline
  def apply(OriginId: String): OriginGroupMember = {
    val __obj = js.Dynamic.literal(OriginId = OriginId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OriginGroupMember]
  }
}

