package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughputDescription extends js.Object {
  /**
    * The date and time of the last provisioned throughput decrease for this table.
    */
  var LastDecreaseDateTime: js.UndefOr[Date] = js.native
  /**
    * The date and time of the last provisioned throughput increase for this table.
    */
  var LastIncreaseDateTime: js.UndefOr[Date] = js.native
  /**
    * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
    */
  var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
}

object ProvisionedThroughputDescription {
  @scala.inline
  def apply(): ProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughputDescription]
  }
  @scala.inline
  implicit class ProvisionedThroughputDescriptionOps[Self <: ProvisionedThroughputDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastDecreaseDateTime(value: Date): Self = this.set("LastDecreaseDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDecreaseDateTime: Self = this.set("LastDecreaseDateTime", js.undefined)
    @scala.inline
    def setLastIncreaseDateTime(value: Date): Self = this.set("LastIncreaseDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastIncreaseDateTime: Self = this.set("LastIncreaseDateTime", js.undefined)
    @scala.inline
    def setNumberOfDecreasesToday(value: PositiveLongObject): Self = this.set("NumberOfDecreasesToday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfDecreasesToday: Self = this.set("NumberOfDecreasesToday", js.undefined)
    @scala.inline
    def setReadCapacityUnits(value: NonNegativeLongObject): Self = this.set("ReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadCapacityUnits: Self = this.set("ReadCapacityUnits", js.undefined)
    @scala.inline
    def setWriteCapacityUnits(value: NonNegativeLongObject): Self = this.set("WriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteCapacityUnits: Self = this.set("WriteCapacityUnits", js.undefined)
  }
  
}

