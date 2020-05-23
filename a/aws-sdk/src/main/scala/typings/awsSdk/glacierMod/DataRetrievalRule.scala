package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRetrievalRule extends js.Object {
  /**
    * The maximum number of bytes that can be retrieved in an hour. This field is required only if the value of the Strategy field is BytesPerHour. Your PUT operation will be rejected if the Strategy field is not set to BytesPerHour and you set this field.
    */
  var BytesPerHour: js.UndefOr[NullableLong] = js.native
  /**
    * The type of data retrieval policy to set. Valid values: BytesPerHour|FreeTier|None
    */
  var Strategy: js.UndefOr[String] = js.native
}

object DataRetrievalRule {
  @scala.inline
  def apply(BytesPerHour: js.UndefOr[NullableLong] = js.undefined, Strategy: String = null): DataRetrievalRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesPerHour)) __obj.updateDynamic("BytesPerHour")(BytesPerHour.get.asInstanceOf[js.Any])
    if (Strategy != null) __obj.updateDynamic("Strategy")(Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRetrievalRule]
  }
}

