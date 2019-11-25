package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProjectionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ALL
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.INCLUDE
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.KEYS_ONLY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledProjection extends _Projection {
  /**
    * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
    */
  @JSName("NonKeyAttributes")
  var NonKeyAttributes__UnmarshalledProjection: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledProjection {
  @scala.inline
  def apply(
    NonKeyAttributes: js.Array[String] = null,
    ProjectionType: ALL | KEYS_ONLY | INCLUDE | String = null
  ): _UnmarshalledProjection = {
    val __obj = js.Dynamic.literal()
    if (NonKeyAttributes != null) __obj.updateDynamic("NonKeyAttributes")(NonKeyAttributes.asInstanceOf[js.Any])
    if (ProjectionType != null) __obj.updateDynamic("ProjectionType")(ProjectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledProjection]
  }
}

