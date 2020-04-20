package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroup extends js.Object {
  /**
    * A complex type that contains information about the failover criteria for an origin group.
    */
  var FailoverCriteria: OriginGroupFailoverCriteria = js.native
  /**
    * The origin group's ID.
    */
  var Id: String = js.native
  /**
    * A complex type that contains information about the origins in an origin group.
    */
  var Members: OriginGroupMembers = js.native
}

object OriginGroup {
  @scala.inline
  def apply(FailoverCriteria: OriginGroupFailoverCriteria, Id: String, Members: OriginGroupMembers): OriginGroup = {
    val __obj = js.Dynamic.literal(FailoverCriteria = FailoverCriteria.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroup]
  }
}

