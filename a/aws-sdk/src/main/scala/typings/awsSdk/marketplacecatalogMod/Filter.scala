package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(Name: FilterName = null, ValueList: ValueList = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ValueList != null) __obj.updateDynamic("ValueList")(ValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

