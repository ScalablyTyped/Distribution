package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageCriteria extends StObject {
  
  /**
    * The account IDs to aggregate usage statistics from.
    */
  var AccountIds: js.UndefOr[typings.awsSdk.guarddutyMod.AccountIds] = js.undefined
  
  /**
    * The data sources to aggregate usage statistics from.
    */
  var DataSources: DataSourceList
  
  /**
    * The resources to aggregate usage statistics from. Only accepts exact resource names.
    */
  var Resources: js.UndefOr[ResourceList] = js.undefined
}
object UsageCriteria {
  
  inline def apply(DataSources: DataSourceList): UsageCriteria = {
    val __obj = js.Dynamic.literal(DataSources = DataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageCriteria]
  }
  
  extension [Self <: UsageCriteria](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    inline def setDataSources(value: DataSourceList): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "DataSources", js.Array(value :_*))
    
    inline def setResources(value: ResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
