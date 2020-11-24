package typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputDescriptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedThroughputDescription extends js.Object {
  
  /**
    * <p>The date and time of the last provisioned throughput decrease for this table.</p>
    */
  var LastDecreaseDateTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The date and time of the last provisioned throughput increase for this table.</p>
    */
  var LastIncreaseDateTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var NumberOfDecreasesToday: js.UndefOr[Double] = js.native
  
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent <code>ReadCapacityUnits</code> per second.</p>
    */
  var ReadCapacityUnits: js.UndefOr[Double] = js.native
  
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var WriteCapacityUnits: js.UndefOr[Double] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastDecreaseDateTime(value: Date | String | Double): Self = this.set("LastDecreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDecreaseDateTime: Self = this.set("LastDecreaseDateTime", js.undefined)
    
    @scala.inline
    def setLastIncreaseDateTime(value: Date | String | Double): Self = this.set("LastIncreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastIncreaseDateTime: Self = this.set("LastIncreaseDateTime", js.undefined)
    
    @scala.inline
    def setNumberOfDecreasesToday(value: Double): Self = this.set("NumberOfDecreasesToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfDecreasesToday: Self = this.set("NumberOfDecreasesToday", js.undefined)
    
    @scala.inline
    def setReadCapacityUnits(value: Double): Self = this.set("ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadCapacityUnits: Self = this.set("ReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setWriteCapacityUnits(value: Double): Self = this.set("WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteCapacityUnits: Self = this.set("WriteCapacityUnits", js.undefined)
  }
}
