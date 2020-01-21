package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExistingObjectReplication extends js.Object {
  /**
    * 
    */
  var Status: ExistingObjectReplicationStatus = js.native
}

object ExistingObjectReplication {
  @scala.inline
  def apply(Status: ExistingObjectReplicationStatus): ExistingObjectReplication = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExistingObjectReplication]
  }
}

