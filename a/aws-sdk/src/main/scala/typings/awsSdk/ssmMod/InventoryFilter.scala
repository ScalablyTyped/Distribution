package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryFilter extends js.Object {
  
  /**
    * The name of the filter key.
    */
  var Key: InventoryFilterKey = js.native
  
  /**
    * The type of filter.  The Exists filter must be used with aggregators. For more information, see Aggregating inventory data in the AWS Systems Manager User Guide. 
    */
  var Type: js.UndefOr[InventoryQueryOperatorType] = js.native
  
  /**
    * Inventory filter values. Example: inventory filter where instance IDs are specified as values Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal 
    */
  var Values: InventoryFilterValueList = js.native
}
object InventoryFilter {
  
  @scala.inline
  def apply(Key: InventoryFilterKey, Values: InventoryFilterValueList): InventoryFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
  
  @scala.inline
  implicit class InventoryFilterOps[Self <: InventoryFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: InventoryFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: InventoryFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: InventoryFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InventoryQueryOperatorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
