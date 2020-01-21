package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAssociationsOnceRequest extends js.Object {
  /**
    * The association IDs that you want to run immediately and only one time.
    */
  var AssociationIds: AssociationIdList = js.native
}

object StartAssociationsOnceRequest {
  @scala.inline
  def apply(AssociationIds: AssociationIdList): StartAssociationsOnceRequest = {
    val __obj = js.Dynamic.literal(AssociationIds = AssociationIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartAssociationsOnceRequest]
  }
}

