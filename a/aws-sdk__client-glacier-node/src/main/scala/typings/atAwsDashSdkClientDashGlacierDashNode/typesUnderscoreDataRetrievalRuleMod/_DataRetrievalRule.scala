package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDataRetrievalRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DataRetrievalRule extends js.Object {
  /**
    * <p>The maximum number of bytes that can be retrieved in an hour.</p> <p>This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.</p>
    */
  var BytesPerHour: js.UndefOr[Double] = js.undefined
  /**
    * <p>The type of data retrieval policy to set.</p> <p>Valid values: BytesPerHour|FreeTier|None</p>
    */
  var Strategy: js.UndefOr[String] = js.undefined
}

object _DataRetrievalRule {
  @scala.inline
  def apply(BytesPerHour: Int | Double = null, Strategy: String = null): _DataRetrievalRule = {
    val __obj = js.Dynamic.literal()
    if (BytesPerHour != null) __obj.updateDynamic("BytesPerHour")(BytesPerHour.asInstanceOf[js.Any])
    if (Strategy != null) __obj.updateDynamic("Strategy")(Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DataRetrievalRule]
  }
}

