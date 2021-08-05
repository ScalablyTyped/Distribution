package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typings.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.EnhancedMetrics
import typings.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.UnmarshalledEnhancedMetrics
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStreamDescriptionSummaryMod {
  
  trait StreamDescriptionSummary extends StObject {
    
    /**
      * <p>The number of enhanced fan-out consumers registered with the stream.</p>
      */
    var ConsumerCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The encryption type used. This value is one of the following:</p> <ul> <li> <p> <code>KMS</code> </p> </li> <li> <p> <code>NONE</code> </p> </li> </ul>
      */
    var EncryptionType: js.UndefOr[NONE | KMS | String] = js.undefined
    
    /**
      * <p>Represents the current enhanced monitoring settings of the stream.</p>
      */
    var EnhancedMonitoring: js.Array[EnhancedMetrics] | Iterable[EnhancedMetrics]
    
    /**
      * <p>The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.</p> <ul> <li> <p>Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code> </p> </li> <li> <p>Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias name example: <code>alias/MyAliasName</code> </p> </li> <li> <p>Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code> </p> </li> </ul>
      */
    var KeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The number of open shards in the stream.</p>
      */
    var OpenShardCount: Double
    
    /**
      * <p>The current retention period, in hours.</p>
      */
    var RetentionPeriodHours: Double
    
    /**
      * <p>The Amazon Resource Name (ARN) for the stream being described.</p>
      */
    var StreamARN: String
    
    /**
      * <p>The approximate time that the stream was created.</p>
      */
    var StreamCreationTimestamp: Date | String | Double
    
    /**
      * <p>The name of the stream being described.</p>
      */
    var StreamName: String
    
    /**
      * <p>The current status of the stream being described. The stream status is one of the following states:</p> <ul> <li> <p> <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets <code>StreamStatus</code> to <code>CREATING</code>.</p> </li> <li> <p> <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state until Kinesis Data Streams completes the deletion.</p> </li> <li> <p> <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an <code>ACTIVE</code> stream.</p> </li> <li> <p> <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the <code>UPDATING</code> state.</p> </li> </ul>
      */
    var StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
  }
  object StreamDescriptionSummary {
    
    inline def apply(
      EnhancedMonitoring: js.Array[EnhancedMetrics] | Iterable[EnhancedMetrics],
      OpenShardCount: Double,
      RetentionPeriodHours: Double,
      StreamARN: String,
      StreamCreationTimestamp: Date | String | Double,
      StreamName: String,
      StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
    ): StreamDescriptionSummary = {
      val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamDescriptionSummary]
    }
    
    extension [Self <: StreamDescriptionSummary](x: Self) {
      
      inline def setConsumerCount(value: Double): Self = StObject.set(x, "ConsumerCount", value.asInstanceOf[js.Any])
      
      inline def setConsumerCountUndefined: Self = StObject.set(x, "ConsumerCount", js.undefined)
      
      inline def setEncryptionType(value: NONE | KMS | String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
      
      inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
      
      inline def setEnhancedMonitoring(value: js.Array[EnhancedMetrics] | Iterable[EnhancedMetrics]): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
      
      inline def setEnhancedMonitoringVarargs(value: EnhancedMetrics*): Self = StObject.set(x, "EnhancedMonitoring", js.Array(value :_*))
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      inline def setOpenShardCount(value: Double): Self = StObject.set(x, "OpenShardCount", value.asInstanceOf[js.Any])
      
      inline def setRetentionPeriodHours(value: Double): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
      
      inline def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
      
      inline def setStreamCreationTimestamp(value: Date | String | Double): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      inline def setStreamStatus(value: CREATING | DELETING | ACTIVE | UPDATING | String): Self = StObject.set(x, "StreamStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledStreamDescriptionSummary
    extends StObject
       with StreamDescriptionSummary {
    
    /**
      * <p>Represents the current enhanced monitoring settings of the stream.</p>
      */
    @JSName("EnhancedMonitoring")
    var EnhancedMonitoring_UnmarshalledStreamDescriptionSummary: js.Array[UnmarshalledEnhancedMetrics]
    
    /**
      * <p>The approximate time that the stream was created.</p>
      */
    @JSName("StreamCreationTimestamp")
    var StreamCreationTimestamp_UnmarshalledStreamDescriptionSummary: Date
  }
  object UnmarshalledStreamDescriptionSummary {
    
    inline def apply(
      EnhancedMonitoring: js.Array[UnmarshalledEnhancedMetrics],
      OpenShardCount: Double,
      RetentionPeriodHours: Double,
      StreamARN: String,
      StreamCreationTimestamp: Date,
      StreamName: String,
      StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
    ): UnmarshalledStreamDescriptionSummary = {
      val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledStreamDescriptionSummary]
    }
    
    extension [Self <: UnmarshalledStreamDescriptionSummary](x: Self) {
      
      inline def setEnhancedMonitoring(value: js.Array[UnmarshalledEnhancedMetrics]): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
      
      inline def setEnhancedMonitoringVarargs(value: UnmarshalledEnhancedMetrics*): Self = StObject.set(x, "EnhancedMonitoring", js.Array(value :_*))
      
      inline def setStreamCreationTimestamp(value: Date): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
