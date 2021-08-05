package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsFilter extends StObject {
  
  /**
    * The status by which you are filtering: OPT_IN or OPT_OUT.
    */
  var FilteredStatus: js.UndefOr[SubscriptionStatus] = js.undefined
  
  /**
    * Used for filtering by a specific topic preference.
    */
  var TopicFilter: js.UndefOr[typings.awsSdk.sesv2Mod.TopicFilter] = js.undefined
}
object ListContactsFilter {
  
  inline def apply(): ListContactsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsFilter]
  }
  
  extension [Self <: ListContactsFilter](x: Self) {
    
    inline def setFilteredStatus(value: SubscriptionStatus): Self = StObject.set(x, "FilteredStatus", value.asInstanceOf[js.Any])
    
    inline def setFilteredStatusUndefined: Self = StObject.set(x, "FilteredStatus", js.undefined)
    
    inline def setTopicFilter(value: TopicFilter): Self = StObject.set(x, "TopicFilter", value.asInstanceOf[js.Any])
    
    inline def setTopicFilterUndefined: Self = StObject.set(x, "TopicFilter", js.undefined)
  }
}
