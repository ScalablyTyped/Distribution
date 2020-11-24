package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableBillingModeSummary extends js.Object {
  
  /**
    * The method used to charge for read and write throughput and to manage capacity.
    */
  var BillingMode: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * If the billing mode is PAY_PER_REQUEST, indicates when the billing mode was set to that value. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastUpdateToPayPerRequestDateTime: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableBillingModeSummary {
  
  @scala.inline
  def apply(): AwsDynamoDbTableBillingModeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableBillingModeSummary]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableBillingModeSummaryOps[Self <: AwsDynamoDbTableBillingModeSummary] (val x: Self) extends AnyVal {
    
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
    def setBillingMode(value: NonEmptyString): Self = this.set("BillingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingMode: Self = this.set("BillingMode", js.undefined)
    
    @scala.inline
    def setLastUpdateToPayPerRequestDateTime(value: NonEmptyString): Self = this.set("LastUpdateToPayPerRequestDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateToPayPerRequestDateTime: Self = this.set("LastUpdateToPayPerRequestDateTime", js.undefined)
  }
}
