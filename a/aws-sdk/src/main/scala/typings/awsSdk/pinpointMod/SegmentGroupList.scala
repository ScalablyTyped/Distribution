package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentGroupList extends StObject {
  
  /**
    * An array that defines the set of segment criteria to evaluate when handling segment groups for the segment.
    */
  var Groups: js.UndefOr[ListOfSegmentGroup] = js.undefined
  
  /**
    * Specifies how to handle multiple segment groups for the segment. For example, if the segment includes three segment groups, whether the resulting segment includes endpoints that match all, any, or none of the segment groups.
    */
  var Include: js.UndefOr[typings.awsSdk.pinpointMod.Include] = js.undefined
}
object SegmentGroupList {
  
  @scala.inline
  def apply(): SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentGroupList]
  }
  
  @scala.inline
  implicit class SegmentGroupListMutableBuilder[Self <: SegmentGroupList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: ListOfSegmentGroup): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: SegmentGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: Include): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
  }
}
