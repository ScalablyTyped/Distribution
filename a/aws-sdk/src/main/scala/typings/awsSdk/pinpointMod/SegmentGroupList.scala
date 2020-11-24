package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentGroupList extends js.Object {
  
  /**
    * An array that defines the set of segment criteria to evaluate when handling segment groups for the segment.
    */
  var Groups: js.UndefOr[ListOfSegmentGroup] = js.native
  
  /**
    * Specifies how to handle multiple segment groups for the segment. For example, if the segment includes three segment groups, whether the resulting segment includes endpoints that match all, any, or none of the segment groups.
    */
  var Include: js.UndefOr[typings.awsSdk.pinpointMod.Include] = js.native
}
object SegmentGroupList {
  
  @scala.inline
  def apply(): SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentGroupList]
  }
  
  @scala.inline
  implicit class SegmentGroupListOps[Self <: SegmentGroupList] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: SegmentGroup*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: ListOfSegmentGroup): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setInclude(value: Include): Self = this.set("Include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("Include", js.undefined)
  }
}
