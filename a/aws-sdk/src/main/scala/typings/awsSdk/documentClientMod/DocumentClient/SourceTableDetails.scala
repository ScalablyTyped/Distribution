package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceTableDetails extends js.Object {
  
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingMode] = js.native
  
  /**
    * Number of items in the table. Note that this is an approximate value. 
    */
  var ItemCount: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCount] = js.native
  
  /**
    * Schema of the table. 
    */
  var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
  
  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  var ProvisionedThroughput: typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput = js.native
  
  /**
    * ARN of the table for which backup was created. 
    */
  var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
  
  /**
    * Time when the source table was created. 
    */
  var TableCreationDateTime: typings.awsSdk.documentClientMod.DocumentClient.TableCreationDateTime = js.native
  
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: typings.awsSdk.documentClientMod.DocumentClient.TableId = js.native
  
  /**
    * The name of the table for which the backup was created. 
    */
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  
  /**
    * Size of the table in bytes. Note that this is an approximate value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.native
}
object SourceTableDetails {
  
  @scala.inline
  def apply(
    KeySchema: KeySchema,
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: TableCreationDateTime,
    TableId: TableId,
    TableName: TableName
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableDetails]
  }
  
  @scala.inline
  implicit class SourceTableDetailsOps[Self <: SourceTableDetails] (val x: Self) extends AnyVal {
    
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
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setKeySchema(value: KeySchema): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCreationDateTime(value: TableCreationDateTime): Self = this.set("TableCreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableId(value: TableId): Self = this.set("TableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingMode(value: BillingMode): Self = this.set("BillingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingMode: Self = this.set("BillingMode", js.undefined)
    
    @scala.inline
    def setItemCount(value: ItemCount): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    
    @scala.inline
    def setTableArn(value: TableArn): Self = this.set("TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableArn: Self = this.set("TableArn", js.undefined)
    
    @scala.inline
    def setTableSizeBytes(value: Long): Self = this.set("TableSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableSizeBytes: Self = this.set("TableSizeBytes", js.undefined)
  }
}
