package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageStatistics extends StObject {
  
  /**
    * The usage statistic sum organized by account ID.
    */
  var SumByAccount: js.UndefOr[UsageAccountResultList] = js.undefined
  
  /**
    * The usage statistic sum organized by on data source.
    */
  var SumByDataSource: js.UndefOr[UsageDataSourceResultList] = js.undefined
  
  /**
    * The usage statistic sum organized by resource.
    */
  var SumByResource: js.UndefOr[UsageResourceResultList] = js.undefined
  
  /**
    * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
    */
  var TopResources: js.UndefOr[UsageResourceResultList] = js.undefined
}
object UsageStatistics {
  
  inline def apply(): UsageStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatistics]
  }
  
  extension [Self <: UsageStatistics](x: Self) {
    
    inline def setSumByAccount(value: UsageAccountResultList): Self = StObject.set(x, "SumByAccount", value.asInstanceOf[js.Any])
    
    inline def setSumByAccountUndefined: Self = StObject.set(x, "SumByAccount", js.undefined)
    
    inline def setSumByAccountVarargs(value: UsageAccountResult*): Self = StObject.set(x, "SumByAccount", js.Array(value :_*))
    
    inline def setSumByDataSource(value: UsageDataSourceResultList): Self = StObject.set(x, "SumByDataSource", value.asInstanceOf[js.Any])
    
    inline def setSumByDataSourceUndefined: Self = StObject.set(x, "SumByDataSource", js.undefined)
    
    inline def setSumByDataSourceVarargs(value: UsageDataSourceResult*): Self = StObject.set(x, "SumByDataSource", js.Array(value :_*))
    
    inline def setSumByResource(value: UsageResourceResultList): Self = StObject.set(x, "SumByResource", value.asInstanceOf[js.Any])
    
    inline def setSumByResourceUndefined: Self = StObject.set(x, "SumByResource", js.undefined)
    
    inline def setSumByResourceVarargs(value: UsageResourceResult*): Self = StObject.set(x, "SumByResource", js.Array(value :_*))
    
    inline def setTopResources(value: UsageResourceResultList): Self = StObject.set(x, "TopResources", value.asInstanceOf[js.Any])
    
    inline def setTopResourcesUndefined: Self = StObject.set(x, "TopResources", js.undefined)
    
    inline def setTopResourcesVarargs(value: UsageResourceResult*): Self = StObject.set(x, "TopResources", js.Array(value :_*))
  }
}
