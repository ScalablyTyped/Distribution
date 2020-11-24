package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInventoryEntriesResult extends js.Object {
  
  /**
    * The time that inventory information was collected for the instance(s).
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.native
  
  /**
    * A list of inventory items on the instance(s).
    */
  var Entries: js.UndefOr[InventoryItemEntryList] = js.native
  
  /**
    * The instance ID targeted by the request to query inventory information.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The inventory schema version used by the instance(s).
    */
  var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.native
  
  /**
    * The type of inventory item returned by the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}
object ListInventoryEntriesResult {
  
  @scala.inline
  def apply(): ListInventoryEntriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInventoryEntriesResult]
  }
  
  @scala.inline
  implicit class ListInventoryEntriesResultOps[Self <: ListInventoryEntriesResult] (val x: Self) extends AnyVal {
    
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
    def setCaptureTime(value: InventoryItemCaptureTime): Self = this.set("CaptureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureTime: Self = this.set("CaptureTime", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: InventoryItemEntry*): Self = this.set("Entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: InventoryItemEntryList): Self = this.set("Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("Entries", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: InventoryItemSchemaVersion): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersion: Self = this.set("SchemaVersion", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
  }
}
