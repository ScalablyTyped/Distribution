package typings.awsSdkClientDynamodbNode.typesProjectionMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ALL
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.INCLUDE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.KEYS_ONLY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledProjection extends Projection {
  /**
    * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
    */
  @JSName("NonKeyAttributes")
  var NonKeyAttributes_UnmarshalledProjection: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledProjection {
  @scala.inline
  def apply(
    NonKeyAttributes: js.Array[String] = null,
    ProjectionType: ALL | KEYS_ONLY | INCLUDE | String = null
  ): UnmarshalledProjection = {
    val __obj = js.Dynamic.literal()
    if (NonKeyAttributes != null) __obj.updateDynamic("NonKeyAttributes")(NonKeyAttributes.asInstanceOf[js.Any])
    if (ProjectionType != null) __obj.updateDynamic("ProjectionType")(ProjectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledProjection]
  }
}

