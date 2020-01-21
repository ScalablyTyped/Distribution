package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamNameCondition extends js.Object {
  /**
    * A comparison operator. Currently, you can specify only the BEGINS_WITH operator, which finds streams whose names start with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.kinesisvideoMod.ComparisonOperator] = js.native
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[StreamName] = js.native
}

object StreamNameCondition {
  @scala.inline
  def apply(ComparisonOperator: ComparisonOperator = null, ComparisonValue: StreamName = null): StreamNameCondition = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (ComparisonValue != null) __obj.updateDynamic("ComparisonValue")(ComparisonValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamNameCondition]
  }
}

