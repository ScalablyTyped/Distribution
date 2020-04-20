package typings.awsSdkClientDynamodbNode.typesPointInTimeRecoverySpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoverySpecification extends js.Object {
  /**
    * <p>Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.</p>
    */
  var PointInTimeRecoveryEnabled: Boolean
}

object PointInTimeRecoverySpecification {
  @scala.inline
  def apply(PointInTimeRecoveryEnabled: Boolean): PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoverySpecification]
  }
}

