package typings.awsSdkClientGlacierNode.typesDataRetrievalRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRetrievalRule extends js.Object {
  /**
    * <p>The maximum number of bytes that can be retrieved in an hour.</p> <p>This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.</p>
    */
  var BytesPerHour: js.UndefOr[Double] = js.native
  /**
    * <p>The type of data retrieval policy to set.</p> <p>Valid values: BytesPerHour|FreeTier|None</p>
    */
  var Strategy: js.UndefOr[String] = js.native
}

object DataRetrievalRule {
  @scala.inline
  def apply(): DataRetrievalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalRule]
  }
  @scala.inline
  implicit class DataRetrievalRuleOps[Self <: DataRetrievalRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesPerHour(value: Double): Self = this.set("BytesPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesPerHour: Self = this.set("BytesPerHour", js.undefined)
    @scala.inline
    def setStrategy(value: String): Self = this.set("Strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("Strategy", js.undefined)
  }
  
}

