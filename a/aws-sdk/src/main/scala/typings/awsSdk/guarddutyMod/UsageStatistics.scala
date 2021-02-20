package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageStatistics extends StObject {
  
  /**
    * The usage statistic sum organized by account ID.
    */
  var SumByAccount: js.UndefOr[UsageAccountResultList] = js.native
  
  /**
    * The usage statistic sum organized by on data source.
    */
  var SumByDataSource: js.UndefOr[UsageDataSourceResultList] = js.native
  
  /**
    * The usage statistic sum organized by resource.
    */
  var SumByResource: js.UndefOr[UsageResourceResultList] = js.native
  
  /**
    * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
    */
  var TopResources: js.UndefOr[UsageResourceResultList] = js.native
}
object UsageStatistics {
  
  @scala.inline
  def apply(): UsageStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatistics]
  }
  
  @scala.inline
  implicit class UsageStatisticsMutableBuilder[Self <: UsageStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSumByAccount(value: UsageAccountResultList): Self = StObject.set(x, "SumByAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumByAccountUndefined: Self = StObject.set(x, "SumByAccount", js.undefined)
    
    @scala.inline
    def setSumByAccountVarargs(value: UsageAccountResult*): Self = StObject.set(x, "SumByAccount", js.Array(value :_*))
    
    @scala.inline
    def setSumByDataSource(value: UsageDataSourceResultList): Self = StObject.set(x, "SumByDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumByDataSourceUndefined: Self = StObject.set(x, "SumByDataSource", js.undefined)
    
    @scala.inline
    def setSumByDataSourceVarargs(value: UsageDataSourceResult*): Self = StObject.set(x, "SumByDataSource", js.Array(value :_*))
    
    @scala.inline
    def setSumByResource(value: UsageResourceResultList): Self = StObject.set(x, "SumByResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumByResourceUndefined: Self = StObject.set(x, "SumByResource", js.undefined)
    
    @scala.inline
    def setSumByResourceVarargs(value: UsageResourceResult*): Self = StObject.set(x, "SumByResource", js.Array(value :_*))
    
    @scala.inline
    def setTopResources(value: UsageResourceResultList): Self = StObject.set(x, "TopResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopResourcesUndefined: Self = StObject.set(x, "TopResources", js.undefined)
    
    @scala.inline
    def setTopResourcesVarargs(value: UsageResourceResult*): Self = StObject.set(x, "TopResources", js.Array(value :_*))
  }
}
