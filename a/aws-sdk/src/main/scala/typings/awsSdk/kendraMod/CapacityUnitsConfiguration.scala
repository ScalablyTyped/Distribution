package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityUnitsConfiguration extends StObject {
  
  /**
    * The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and 40,000 queries per day.
    */
  var QueryCapacityUnits: QueryCapacityUnit
  
  /**
    * The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or 500,000 documents, whichever is reached first.
    */
  var StorageCapacityUnits: StorageCapacityUnit
}
object CapacityUnitsConfiguration {
  
  @scala.inline
  def apply(QueryCapacityUnits: QueryCapacityUnit, StorageCapacityUnits: StorageCapacityUnit): CapacityUnitsConfiguration = {
    val __obj = js.Dynamic.literal(QueryCapacityUnits = QueryCapacityUnits.asInstanceOf[js.Any], StorageCapacityUnits = StorageCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityUnitsConfiguration]
  }
  
  @scala.inline
  implicit class CapacityUnitsConfigurationMutableBuilder[Self <: CapacityUnitsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryCapacityUnits(value: QueryCapacityUnit): Self = StObject.set(x, "QueryCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageCapacityUnits(value: StorageCapacityUnit): Self = StObject.set(x, "StorageCapacityUnits", value.asInstanceOf[js.Any])
  }
}
