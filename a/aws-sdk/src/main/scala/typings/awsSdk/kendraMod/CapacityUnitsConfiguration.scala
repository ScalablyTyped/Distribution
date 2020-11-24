package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityUnitsConfiguration extends js.Object {
  
  /**
    * The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and 40,000 queries per day.
    */
  var QueryCapacityUnits: QueryCapacityUnit = js.native
  
  /**
    * The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or 500,000 documents, whichever is reached first.
    */
  var StorageCapacityUnits: StorageCapacityUnit = js.native
}
object CapacityUnitsConfiguration {
  
  @scala.inline
  def apply(QueryCapacityUnits: QueryCapacityUnit, StorageCapacityUnits: StorageCapacityUnit): CapacityUnitsConfiguration = {
    val __obj = js.Dynamic.literal(QueryCapacityUnits = QueryCapacityUnits.asInstanceOf[js.Any], StorageCapacityUnits = StorageCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityUnitsConfiguration]
  }
  
  @scala.inline
  implicit class CapacityUnitsConfigurationOps[Self <: CapacityUnitsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setQueryCapacityUnits(value: QueryCapacityUnit): Self = this.set("QueryCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageCapacityUnits(value: StorageCapacityUnit): Self = this.set("StorageCapacityUnits", value.asInstanceOf[js.Any])
  }
}
