package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLimitsOutput extends js.Object {
  
  /**
    * The maximum total read capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The maximum total write capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this Region, including the read capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this Region, including the write capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}
object DescribeLimitsOutput {
  
  @scala.inline
  def apply(): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  
  @scala.inline
  implicit class DescribeLimitsOutputOps[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    
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
    def setAccountMaxReadCapacityUnits(value: PositiveLongObject): Self = this.set("AccountMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountMaxReadCapacityUnits: Self = this.set("AccountMaxReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setAccountMaxWriteCapacityUnits(value: PositiveLongObject): Self = this.set("AccountMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountMaxWriteCapacityUnits: Self = this.set("AccountMaxWriteCapacityUnits", js.undefined)
    
    @scala.inline
    def setTableMaxReadCapacityUnits(value: PositiveLongObject): Self = this.set("TableMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableMaxReadCapacityUnits: Self = this.set("TableMaxReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setTableMaxWriteCapacityUnits(value: PositiveLongObject): Self = this.set("TableMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableMaxWriteCapacityUnits: Self = this.set("TableMaxWriteCapacityUnits", js.undefined)
  }
}
