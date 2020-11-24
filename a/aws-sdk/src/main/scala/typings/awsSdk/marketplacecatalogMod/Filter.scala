package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /**
    * For ListEntities, the supported value for this is an EntityId. For ListChangeSets, the supported values are as follows:
    */
  var Name: js.UndefOr[FilterName] = js.native
  
  /**
    *  ListEntities - This is a list of unique EntityIds.  ListChangeSets - The supported filter names and associated ValueLists is as follows:    ChangeSetName - The supported ValueList is a list of non-unique ChangeSetNames. These are defined when you call the StartChangeSet action.    Status - The supported ValueList is a list of statuses for all change set requests.    EntityId - The supported ValueList is a list of unique EntityIds.    BeforeStartTime - The supported ValueList is a list of all change sets that started before the filter value.    AfterStartTime - The supported ValueList is a list of all change sets that started after the filter value.    BeforeEndTime - The supported ValueList is a list of all change sets that ended before the filter value.    AfterEndTime - The supported ValueList is a list of all change sets that ended after the filter value.  
    */
  var ValueList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ValueList] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setName(value: FilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValueListVarargs(value: StringValue*): Self = this.set("ValueList", js.Array(value :_*))
    
    @scala.inline
    def setValueList(value: ValueList): Self = this.set("ValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueList: Self = this.set("ValueList", js.undefined)
  }
}
