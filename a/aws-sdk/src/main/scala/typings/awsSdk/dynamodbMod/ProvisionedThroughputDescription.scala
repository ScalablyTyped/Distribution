package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedThroughputDescription extends StObject {
  
  /**
    * The date and time of the last provisioned throughput decrease for this table.
    */
  var LastDecreaseDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The date and time of the last provisioned throughput increase for this table.
    */
  var LastIncreaseDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
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
  implicit class ProvisionedThroughputDescriptionMutableBuilder[Self <: ProvisionedThroughputDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastDecreaseDateTime(value: Date): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
    
    @scala.inline
    def setLastIncreaseDateTime(value: Date): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
    
    @scala.inline
    def setNumberOfDecreasesToday(value: PositiveLongObject): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
    
    @scala.inline
    def setReadCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setWriteCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
