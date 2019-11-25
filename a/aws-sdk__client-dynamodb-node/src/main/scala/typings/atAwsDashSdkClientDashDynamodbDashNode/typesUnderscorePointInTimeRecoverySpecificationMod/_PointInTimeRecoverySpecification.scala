package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscorePointInTimeRecoverySpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PointInTimeRecoverySpecification extends js.Object {
  /**
    * <p>Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.</p>
    */
  var PointInTimeRecoveryEnabled: Boolean
}

object _PointInTimeRecoverySpecification {
  @scala.inline
  def apply(PointInTimeRecoveryEnabled: Boolean): _PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_PointInTimeRecoverySpecification]
  }
}

