package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecutionFilter extends js.Object {
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionFilterKey = js.native
  /**
    * The filter type specified in the request.
    */
  var Type: AssociationFilterOperatorType = js.native
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionFilterValue = js.native
}

object AssociationExecutionFilter {
  @scala.inline
  def apply(
    Key: AssociationExecutionFilterKey,
    Type: AssociationFilterOperatorType,
    Value: AssociationExecutionFilterValue
  ): AssociationExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecutionFilter]
  }
}

