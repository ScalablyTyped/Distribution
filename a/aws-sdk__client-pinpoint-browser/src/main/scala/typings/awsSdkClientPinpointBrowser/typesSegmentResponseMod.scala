package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DIMENSIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.IMPORT
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.SegmentImportResource
import typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.UnmarshalledSegmentImportResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentResponseMod {
  
  @js.native
  trait SegmentResponse extends StObject {
    
    /**
      * The ID of the application that the segment applies to.
      */
    var ApplicationId: js.UndefOr[String] = js.native
    
    /**
      * The date and time when the segment was created.
      */
    var CreationDate: js.UndefOr[String] = js.native
    
    /**
      * The segment dimensions attributes.
      */
    var Dimensions: js.UndefOr[SegmentDimensions] = js.native
    
    /**
      * The unique segment ID.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * The import job settings.
      */
    var ImportDefinition: js.UndefOr[SegmentImportResource] = js.native
    
    /**
      * The date and time when the segment was last modified.
      */
    var LastModifiedDate: js.UndefOr[String] = js.native
    
    /**
      * The name of the segment.
      */
    var Name: js.UndefOr[String] = js.native
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
      */
    var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
    
    /**
      * The segment type:
      * DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by making a POST request to the segments resource.
      * IMPORT - A static segment built from an imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a POST request to the jobs/import resource.
      */
    var SegmentType: js.UndefOr[DIMENSIONAL | IMPORT | String] = js.native
    
    /**
      * The segment version number.
      */
    var Version: js.UndefOr[Double] = js.native
  }
  object SegmentResponse {
    
    @scala.inline
    def apply(): SegmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentResponse]
    }
    
    @scala.inline
    implicit class SegmentResponseMutableBuilder[Self <: SegmentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setDimensions(value: SegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setImportDefinition(value: SegmentImportResource): Self = StObject.set(x, "ImportDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportDefinitionUndefined: Self = StObject.set(x, "ImportDefinition", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setSegmentGroups(value: SegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
      
      @scala.inline
      def setSegmentType(value: DIMENSIONAL | IMPORT | String): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentTypeUndefined: Self = StObject.set(x, "SegmentType", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSegmentResponse extends SegmentResponse {
    
    /**
      * The segment dimensions attributes.
      */
    @JSName("Dimensions")
    var Dimensions_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentDimensions] = js.native
    
    /**
      * The import job settings.
      */
    @JSName("ImportDefinition")
    var ImportDefinition_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentImportResource] = js.native
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
      */
    @JSName("SegmentGroups")
    var SegmentGroups_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentGroupList] = js.native
  }
  object UnmarshalledSegmentResponse {
    
    @scala.inline
    def apply(): UnmarshalledSegmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledSegmentResponseMutableBuilder[Self <: UnmarshalledSegmentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: UnmarshalledSegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setImportDefinition(value: UnmarshalledSegmentImportResource): Self = StObject.set(x, "ImportDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportDefinitionUndefined: Self = StObject.set(x, "ImportDefinition", js.undefined)
      
      @scala.inline
      def setSegmentGroups(value: UnmarshalledSegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    }
  }
}
