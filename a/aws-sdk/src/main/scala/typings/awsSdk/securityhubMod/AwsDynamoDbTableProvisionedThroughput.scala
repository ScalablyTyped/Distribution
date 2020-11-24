package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableProvisionedThroughput extends js.Object {
  
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
  implicit class AwsDynamoDbTableProvisionedThroughputOps[Self <: AwsDynamoDbTableProvisionedThroughput] (val x: Self) extends AnyVal {
    
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
    def setLastDecreaseDateTime(value: NonEmptyString): Self = this.set("LastDecreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDecreaseDateTime: Self = this.set("LastDecreaseDateTime", js.undefined)
    
    @scala.inline
    def setLastIncreaseDateTime(value: NonEmptyString): Self = this.set("LastIncreaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastIncreaseDateTime: Self = this.set("LastIncreaseDateTime", js.undefined)
    
    @scala.inline
    def setNumberOfDecreasesToday(value: Integer): Self = this.set("NumberOfDecreasesToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfDecreasesToday: Self = this.set("NumberOfDecreasesToday", js.undefined)
    
    @scala.inline
    def setReadCapacityUnits(value: Integer): Self = this.set("ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadCapacityUnits: Self = this.set("ReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setWriteCapacityUnits(value: Integer): Self = this.set("WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteCapacityUnits: Self = this.set("WriteCapacityUnits", js.undefined)
  }
}
