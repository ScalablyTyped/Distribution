package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * For ListEntities, the supported value for this is an EntityId. For ListChangeSets, the supported values are as follows:
    */
  var Name: js.UndefOr[FilterName] = js.undefined
  
  /**
    *  ListEntities - This is a list of unique EntityIds.  ListChangeSets - The supported filter names and associated ValueLists is as follows:    ChangeSetName - The supported ValueList is a list of non-unique ChangeSetNames. These are defined when you call the StartChangeSet action.    Status - The supported ValueList is a list of statuses for all change set requests.    EntityId - The supported ValueList is a list of unique EntityIds.    BeforeStartTime - The supported ValueList is a list of all change sets that started before the filter value.    AfterStartTime - The supported ValueList is a list of all change sets that started after the filter value.    BeforeEndTime - The supported ValueList is a list of all change sets that ended before the filter value.    AfterEndTime - The supported ValueList is a list of all change sets that ended after the filter value.  
    */
  var ValueList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ValueList] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValueList(value: ValueList): Self = StObject.set(x, "ValueList", value.asInstanceOf[js.Any])
    
    inline def setValueListUndefined: Self = StObject.set(x, "ValueList", js.undefined)
    
    inline def setValueListVarargs(value: StringValue*): Self = StObject.set(x, "ValueList", js.Array(value :_*))
  }
}
