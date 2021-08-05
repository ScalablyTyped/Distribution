package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupMod.SegmentGroup
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupMod.UnmarshalledSegmentGroup
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentGroupListMod {
  
  trait SegmentGroupList extends StObject {
    
    /**
      * A set of segment criteria to evaluate.
      */
    var Groups: js.UndefOr[js.Array[SegmentGroup] | Iterable[SegmentGroup]] = js.undefined
    
    /**
      * Specify how to handle multiple segment groups. For example, if the segment includes three segment groups, should the resulting segment include endpoints that are matched by all, any, or none of the segment groups you created. Acceptable values: ALL, ANY, or NONE.
      */
    var Include: js.UndefOr[ALL | ANY | NONE | String] = js.undefined
  }
  object SegmentGroupList {
    
    inline def apply(): SegmentGroupList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentGroupList]
    }
    
    extension [Self <: SegmentGroupList](x: Self) {
      
      inline def setGroups(value: js.Array[SegmentGroup] | Iterable[SegmentGroup]): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
      
      inline def setGroupsVarargs(value: SegmentGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
      
      inline def setInclude(value: ALL | ANY | NONE | String): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
    }
  }
  
  trait UnmarshalledSegmentGroupList
    extends StObject
       with SegmentGroupList {
    
    /**
      * A set of segment criteria to evaluate.
      */
    @JSName("Groups")
    var Groups_UnmarshalledSegmentGroupList: js.UndefOr[js.Array[UnmarshalledSegmentGroup]] = js.undefined
  }
  object UnmarshalledSegmentGroupList {
    
    inline def apply(): UnmarshalledSegmentGroupList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentGroupList]
    }
    
    extension [Self <: UnmarshalledSegmentGroupList](x: Self) {
      
      inline def setGroups(value: js.Array[UnmarshalledSegmentGroup]): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
      
      inline def setGroupsVarargs(value: UnmarshalledSegmentGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    }
  }
}
