package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentReferenceMod.SegmentReference
import typings.awsSdkClientPinpointBrowser.typesSegmentReferenceMod.UnmarshalledSegmentReference
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentGroupMod {
  
  @js.native
  trait SegmentGroup extends StObject {
    
    /**
      * List of dimensions to include or exclude.
      */
    var Dimensions: js.UndefOr[js.Array[SegmentDimensions] | Iterable[SegmentDimensions]] = js.native
    
    /**
      * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
      *
      * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
      */
    var SourceSegments: js.UndefOr[js.Array[SegmentReference] | Iterable[SegmentReference]] = js.native
    
    /**
      * Specify how to handle multiple source segments. For example, if you specify three source segments, should the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
      */
    var SourceType: js.UndefOr[ALL | ANY | NONE | String] = js.native
    
    /**
      * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values: ALL, ANY, or NONE.
      */
    var Type: js.UndefOr[ALL | ANY | NONE | String] = js.native
  }
  object SegmentGroup {
    
    @scala.inline
    def apply(): SegmentGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentGroup]
    }
    
    @scala.inline
    implicit class SegmentGroupMutableBuilder[Self <: SegmentGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: js.Array[SegmentDimensions] | Iterable[SegmentDimensions]): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setDimensionsVarargs(value: SegmentDimensions*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
      
      @scala.inline
      def setSourceSegments(value: js.Array[SegmentReference] | Iterable[SegmentReference]): Self = StObject.set(x, "SourceSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSegmentsUndefined: Self = StObject.set(x, "SourceSegments", js.undefined)
      
      @scala.inline
      def setSourceSegmentsVarargs(value: SegmentReference*): Self = StObject.set(x, "SourceSegments", js.Array(value :_*))
      
      @scala.inline
      def setSourceType(value: ALL | ANY | NONE | String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
      
      @scala.inline
      def setType(value: ALL | ANY | NONE | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSegmentGroup extends SegmentGroup {
    
    /**
      * List of dimensions to include or exclude.
      */
    @JSName("Dimensions")
    var Dimensions_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentDimensions]] = js.native
    
    /**
      * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
      *
      * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
      */
    @JSName("SourceSegments")
    var SourceSegments_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentReference]] = js.native
  }
  object UnmarshalledSegmentGroup {
    
    @scala.inline
    def apply(): UnmarshalledSegmentGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentGroup]
    }
    
    @scala.inline
    implicit class UnmarshalledSegmentGroupMutableBuilder[Self <: UnmarshalledSegmentGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: js.Array[UnmarshalledSegmentDimensions]): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setDimensionsVarargs(value: UnmarshalledSegmentDimensions*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
      
      @scala.inline
      def setSourceSegments(value: js.Array[UnmarshalledSegmentReference]): Self = StObject.set(x, "SourceSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSegmentsUndefined: Self = StObject.set(x, "SourceSegments", js.undefined)
      
      @scala.inline
      def setSourceSegmentsVarargs(value: UnmarshalledSegmentReference*): Self = StObject.set(x, "SourceSegments", js.Array(value :_*))
    }
  }
}
