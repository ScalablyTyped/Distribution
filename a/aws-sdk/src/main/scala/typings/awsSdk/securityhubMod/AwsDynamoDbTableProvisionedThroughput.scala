package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableProvisionedThroughput extends StObject {
  
  /**
    * Indicates when the provisioned throughput was last decreased. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastDecreaseDateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the provisioned throughput was last increased. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastIncreaseDateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of times during the current UTC calendar day that the provisioned throughput was decreased.
    */
  var NumberOfDecreasesToday: js.UndefOr[Integer] = js.native
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ReadCapacityUnits: js.UndefOr[Integer] = js.native
  
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var WriteCapacityUnits: js.UndefOr[Integer] = js.native
}
object AwsDynamoDbTableProvisionedThroughput {
  
  @scala.inline
  def apply(): AwsDynamoDbTableProvisionedThroughput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProvisionedThroughput]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableProvisionedThroughputMutableBuilder[Self <: AwsDynamoDbTableProvisionedThroughput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastDecreaseDateTime(value: NonEmptyString): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
    
    @scala.inline
    def setLastIncreaseDateTime(value: NonEmptyString): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
    
    @scala.inline
    def setNumberOfDecreasesToday(value: Integer): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
    
    @scala.inline
    def setReadCapacityUnits(value: Integer): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setWriteCapacityUnits(value: Integer): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
