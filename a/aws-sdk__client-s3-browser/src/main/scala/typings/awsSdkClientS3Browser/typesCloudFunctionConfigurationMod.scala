package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonAsterisk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCopy
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPost
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPut
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonAsterisk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDelete
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonReducedRedundancyLostObject
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCloudFunctionConfigurationMod {
  
  trait CloudFunctionConfiguration extends StObject {
    
    /**
      * _CloudFunction shape
      */
    var CloudFunction: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Bucket event for which to send notifications.</p>
      */
    var Event: js.UndefOr[
        s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ] = js.undefined
    
    /**
      * _EventList shape
      */
    var Events: js.UndefOr[
        (js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]) | (Iterable[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ])
      ] = js.undefined
    
    /**
      * <p>Optional unique identifier for configurations in a notification configuration. If you don't provide one, Amazon S3 will assign an ID.</p>
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * _CloudFunctionInvocationRole shape
      */
    var InvocationRole: js.UndefOr[String] = js.undefined
  }
  object CloudFunctionConfiguration {
    
    @scala.inline
    def apply(): CloudFunctionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloudFunctionConfiguration]
    }
    
    @scala.inline
    implicit class CloudFunctionConfigurationMutableBuilder[Self <: CloudFunctionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudFunction(value: String): Self = StObject.set(x, "CloudFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudFunctionUndefined: Self = StObject.set(x, "CloudFunction", js.undefined)
      
      @scala.inline
      def setEvent(
        value: s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
      
      @scala.inline
      def setEvents(
        value: (js.Array[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ]) | (Iterable[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ])
      ): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(
        value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
      ): Self = StObject.set(x, "Events", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setInvocationRole(value: String): Self = StObject.set(x, "InvocationRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationRoleUndefined: Self = StObject.set(x, "InvocationRole", js.undefined)
    }
  }
  
  trait UnmarshalledCloudFunctionConfiguration
    extends StObject
       with CloudFunctionConfiguration {
    
    /**
      * _EventList shape
      */
    @JSName("Events")
    var Events_UnmarshalledCloudFunctionConfiguration: js.UndefOr[
        js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]
      ] = js.undefined
  }
  object UnmarshalledCloudFunctionConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledCloudFunctionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCloudFunctionConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledCloudFunctionConfigurationMutableBuilder[Self <: UnmarshalledCloudFunctionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(
        value: js.Array[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ]
      ): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(
        value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
      ): Self = StObject.set(x, "Events", js.Array(value :_*))
    }
  }
}
