package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserHierarchyGroupResponse extends js.Object {
  
  /**
    * Information about the hierarchy group.
    */
  var HierarchyGroup: js.UndefOr[typings.awsSdk.connectMod.HierarchyGroup] = js.native
}
object DescribeUserHierarchyGroupResponse {
  
  @scala.inline
  def apply(): DescribeUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeUserHierarchyGroupResponseOps[Self <: DescribeUserHierarchyGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHierarchyGroup(value: HierarchyGroup): Self = this.set("HierarchyGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyGroup: Self = this.set("HierarchyGroup", js.undefined)
  }
}
