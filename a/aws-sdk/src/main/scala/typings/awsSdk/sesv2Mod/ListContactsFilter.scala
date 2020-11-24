package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactsFilter extends js.Object {
  
  /**
    * The status by which you are filtering: OPT_IN or OPT_OUT.
    */
  var FilteredStatus: js.UndefOr[SubscriptionStatus] = js.native
  
  /**
    * Used for filtering by a specific topic preference.
    */
  var TopicFilter: js.UndefOr[typings.awsSdk.sesv2Mod.TopicFilter] = js.native
}
object ListContactsFilter {
  
  @scala.inline
  def apply(): ListContactsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsFilter]
  }
  
  @scala.inline
  implicit class ListContactsFilterOps[Self <: ListContactsFilter] (val x: Self) extends AnyVal {
    
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
    def setFilteredStatus(value: SubscriptionStatus): Self = this.set("FilteredStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteredStatus: Self = this.set("FilteredStatus", js.undefined)
    
    @scala.inline
    def setTopicFilter(value: TopicFilter): Self = this.set("TopicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicFilter: Self = this.set("TopicFilter", js.undefined)
  }
}
