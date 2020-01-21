package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalidation extends js.Object {
  /**
    * The date and time the invalidation request was first made. 
    */
  var CreateTime: timestamp = js.native
  /**
    * The identifier for the invalidation request. For example: IDFDVBD632BHDS5.
    */
  var Id: String = js.native
  /**
    * The current invalidation information for the batch request. 
    */
  var InvalidationBatch: typings.awsSdk.cloudfrontMod.InvalidationBatch = js.native
  /**
    * The status of the invalidation request. When the invalidation batch is finished, the status is Completed.
    */
  var Status: String = js.native
}

object Invalidation {
  @scala.inline
  def apply(CreateTime: timestamp, Id: String, InvalidationBatch: InvalidationBatch, Status: String): Invalidation = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InvalidationBatch = InvalidationBatch.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Invalidation]
  }
}

