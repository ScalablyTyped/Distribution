package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroupFailoverCriteria extends js.Object {
  /**
    * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second origin.
    */
  var StatusCodes: typings.awsSdk.cloudfrontMod.StatusCodes = js.native
}

object OriginGroupFailoverCriteria {
  @scala.inline
  def apply(StatusCodes: StatusCodes): OriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(StatusCodes = StatusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupFailoverCriteria]
  }
}

