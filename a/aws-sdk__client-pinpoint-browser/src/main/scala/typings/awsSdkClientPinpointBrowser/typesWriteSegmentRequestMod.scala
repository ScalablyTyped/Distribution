package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteSegmentRequestMod {
  
  trait UnmarshalledWriteSegmentRequest
    extends StObject
       with WriteSegmentRequest {
    
    /**
      * The segment dimensions attributes.
      */
    @JSName("Dimensions")
    var Dimensions_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentDimensions] = js.undefined
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
      */
    @JSName("SegmentGroups")
    var SegmentGroups_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentGroupList] = js.undefined
  }
  object UnmarshalledWriteSegmentRequest {
    
    inline def apply(): UnmarshalledWriteSegmentRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWriteSegmentRequest]
    }
    
    extension [Self <: UnmarshalledWriteSegmentRequest](x: Self) {
      
      inline def setDimensions(value: UnmarshalledSegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      inline def setSegmentGroups(value: UnmarshalledSegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      inline def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    }
  }
  
  trait WriteSegmentRequest extends StObject {
    
    /**
      * The segment dimensions attributes.
      */
    var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
    
    /**
      * The name of segment
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
      */
    var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
  }
  object WriteSegmentRequest {
    
    inline def apply(): WriteSegmentRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteSegmentRequest]
    }
    
    extension [Self <: WriteSegmentRequest](x: Self) {
      
      inline def setDimensions(value: SegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setSegmentGroups(value: SegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      inline def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    }
  }
}
