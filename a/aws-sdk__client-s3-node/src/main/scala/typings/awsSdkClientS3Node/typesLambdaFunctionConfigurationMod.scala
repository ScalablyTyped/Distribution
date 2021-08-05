package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonAsterisk
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCopy
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPost
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPut
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonAsterisk
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDelete
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonReducedRedundancyLostObject
import typings.awsSdkClientS3Node.typesNotificationConfigurationFilterMod.NotificationConfigurationFilter
import typings.awsSdkClientS3Node.typesNotificationConfigurationFilterMod.UnmarshalledNotificationConfigurationFilter
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLambdaFunctionConfigurationMod {
  
  trait LambdaFunctionConfiguration extends StObject {
    
    /**
      * _EventList shape
      */
    var Events: (js.Array[
        s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ]) | (Iterable[
        s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ])
    
    /**
      * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
      */
    var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
    
    /**
      * <p>Optional unique identifier for configurations in a notification configuration. If you don't provide one, Amazon S3 will assign an ID.</p>
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Lambda cloud function ARN that Amazon S3 can invoke when it detects events of the specified type.</p>
      */
    var LambdaFunctionArn: String
  }
  object LambdaFunctionConfiguration {
    
    inline def apply(
      Events: (js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]) | (Iterable[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]),
      LambdaFunctionArn: String
    ): LambdaFunctionConfiguration = {
      val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[LambdaFunctionConfiguration]
    }
    
    extension [Self <: LambdaFunctionConfiguration](x: Self) {
      
      inline def setEvents(
        value: (js.Array[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ]) | (Iterable[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ])
      ): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(
        value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
      ): Self = StObject.set(x, "Events", js.Array(value :_*))
      
      inline def setFilter(value: NotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setLambdaFunctionArn(value: String): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledLambdaFunctionConfiguration
    extends StObject
       with LambdaFunctionConfiguration {
    
    /**
      * _EventList shape
      */
    @JSName("Events")
    var Events_UnmarshalledLambdaFunctionConfiguration: js.Array[
        s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ]
    
    /**
      * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledLambdaFunctionConfiguration: js.UndefOr[UnmarshalledNotificationConfigurationFilter] = js.undefined
  }
  object UnmarshalledLambdaFunctionConfiguration {
    
    inline def apply(
      Events: js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ],
      LambdaFunctionArn: String
    ): UnmarshalledLambdaFunctionConfiguration = {
      val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLambdaFunctionConfiguration]
    }
    
    extension [Self <: UnmarshalledLambdaFunctionConfiguration](x: Self) {
      
      inline def setEvents(
        value: js.Array[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ]
      ): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(
        value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
      ): Self = StObject.set(x, "Events", js.Array(value :_*))
      
      inline def setFilter(value: UnmarshalledNotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    }
  }
}
