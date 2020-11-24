package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetContentDeliveryRule extends js.Object {
  
  /**
    * The destination to which dataset contents are delivered.
    */
  var destination: DatasetContentDeliveryDestination = js.native
  
  /**
    * The name of the dataset content delivery rules entry.
    */
  var entryName: js.UndefOr[EntryName] = js.native
}
object DatasetContentDeliveryRule {
  
  @scala.inline
  def apply(destination: DatasetContentDeliveryDestination): DatasetContentDeliveryRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentDeliveryRule]
  }
  
  @scala.inline
  implicit class DatasetContentDeliveryRuleOps[Self <: DatasetContentDeliveryRule] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: DatasetContentDeliveryDestination): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryName(value: EntryName): Self = this.set("entryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryName: Self = this.set("entryName", js.undefined)
  }
}
