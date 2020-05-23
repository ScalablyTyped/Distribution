package typings.awsSdkClientGlacierNode.typesDataRetrievalRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRetrievalRule extends js.Object {
  /**
    * <p>The maximum number of bytes that can be retrieved in an hour.</p> <p>This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.</p>
    */
  var BytesPerHour: js.UndefOr[Double] = js.undefined
  /**
    * <p>The type of data retrieval policy to set.</p> <p>Valid values: BytesPerHour|FreeTier|None</p>
    */
  var Strategy: js.UndefOr[String] = js.undefined
}

object DataRetrievalRule {
  @scala.inline
  def apply(BytesPerHour: js.UndefOr[Double] = js.undefined, Strategy: String = null): DataRetrievalRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesPerHour)) __obj.updateDynamic("BytesPerHour")(BytesPerHour.get.asInstanceOf[js.Any])
    if (Strategy != null) __obj.updateDynamic("Strategy")(Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRetrievalRule]
  }
}

