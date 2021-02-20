package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageCriteria extends StObject {
  
  /**
    * The account IDs to aggregate usage statistics from.
    */
  var AccountIds: js.UndefOr[typings.awsSdk.guarddutyMod.AccountIds] = js.native
  
  /**
    * The data sources to aggregate usage statistics from.
    */
  var DataSources: DataSourceList = js.native
  
  /**
    * The resources to aggregate usage statistics from. Only accepts exact resource names.
    */
  var Resources: js.UndefOr[ResourceList] = js.native
}
object UsageCriteria {
  
  @scala.inline
  def apply(DataSources: DataSourceList): UsageCriteria = {
    val __obj = js.Dynamic.literal(DataSources = DataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageCriteria]
  }
  
  @scala.inline
  implicit class UsageCriteriaMutableBuilder[Self <: UsageCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setDataSources(value: DataSourceList): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "DataSources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: ResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
