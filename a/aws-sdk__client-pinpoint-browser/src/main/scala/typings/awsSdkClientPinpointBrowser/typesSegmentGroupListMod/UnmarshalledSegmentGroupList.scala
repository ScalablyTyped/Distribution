package typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod

import typings.awsSdkClientPinpointBrowser.typesSegmentGroupMod.UnmarshalledSegmentGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSegmentGroupList extends SegmentGroupList {
  
  /**
    * A set of segment criteria to evaluate.
    */
  @JSName("Groups")
  var Groups_UnmarshalledSegmentGroupList: js.UndefOr[js.Array[UnmarshalledSegmentGroup]] = js.native
}
object UnmarshalledSegmentGroupList {
  
  @scala.inline
  def apply(): UnmarshalledSegmentGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentGroupList]
  }
  
  @scala.inline
  implicit class UnmarshalledSegmentGroupListOps[Self <: UnmarshalledSegmentGroupList] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: UnmarshalledSegmentGroup*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[UnmarshalledSegmentGroup]): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
  }
}
