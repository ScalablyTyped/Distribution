package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesConsumerDescriptionMod.UnmarshalledConsumerDescription
import typings.awsSdkClientKinesisBrowser.typesConsumerMod.UnmarshalledConsumer
import typings.awsSdkClientKinesisBrowser.typesPutRecordsResultEntryMod.UnmarshalledPutRecordsResultEntry
import typings.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import typings.awsSdkClientKinesisBrowser.typesStreamDescriptionMod.UnmarshalledStreamDescription
import typings.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod.UnmarshalledStreamDescriptionSummary
import typings.awsSdkClientKinesisBrowser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamOutputMod.AddTagsToStreamOutput
    - typings.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput
    - typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput
    - typings.awsSdkClientKinesisBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput
    - typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput
    - typings.awsSdkClientKinesisBrowser.typesDescribeLimitsOutputMod.DescribeLimitsOutput
    - typings.awsSdkClientKinesisBrowser.typesDescribeStreamOutputMod.DescribeStreamOutput
    - typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod.DescribeStreamConsumerOutput
    - typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod.DescribeStreamSummaryOutput
    - typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput
    - typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput
    - typings.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput
    - typings.awsSdkClientKinesisBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput
    - typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput
    - typings.awsSdkClientKinesisBrowser.typesListShardsOutputMod.ListShardsOutput
    - typings.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput
    - typings.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput
    - typings.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput
    - typings.awsSdkClientKinesisBrowser.typesMergeShardsOutputMod.MergeShardsOutput
    - typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod.PutRecordOutput
    - typings.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod.PutRecordsOutput
    - typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput
    - typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamOutputMod.RemoveTagsFromStreamOutput
    - typings.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput
    - typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput
    - typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionOutputMod.StopStreamEncryptionOutput
    - typings.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def AddTagsToStreamOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamOutputMod.AddTagsToStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamOutputMod.AddTagsToStreamOutput]
    }
    
    @scala.inline
    def CreateStreamOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput]
    }
    
    @scala.inline
    def DecreaseStreamRetentionPeriodOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput]
    }
    
    @scala.inline
    def DeleteStreamOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput]
    }
    
    @scala.inline
    def DeregisterStreamConsumerOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput]
    }
    
    @scala.inline
    def DescribeLimitsOutput($metadata: ResponseMetadata, OpenShardCount: Double, ShardLimit: Double): typings.awsSdkClientKinesisBrowser.typesDescribeLimitsOutputMod.DescribeLimitsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeLimitsOutputMod.DescribeLimitsOutput]
    }
    
    @scala.inline
    def DescribeStreamConsumerOutput($metadata: ResponseMetadata, ConsumerDescription: UnmarshalledConsumerDescription): typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod.DescribeStreamConsumerOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod.DescribeStreamConsumerOutput]
    }
    
    @scala.inline
    def DescribeStreamOutput($metadata: ResponseMetadata, StreamDescription: UnmarshalledStreamDescription): typings.awsSdkClientKinesisBrowser.typesDescribeStreamOutputMod.DescribeStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescription = StreamDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeStreamOutputMod.DescribeStreamOutput]
    }
    
    @scala.inline
    def DescribeStreamSummaryOutput($metadata: ResponseMetadata, StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary): typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod.DescribeStreamSummaryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescriptionSummary = StreamDescriptionSummary.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod.DescribeStreamSummaryOutput]
    }
    
    @scala.inline
    def DisableEnhancedMonitoringOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput]
    }
    
    @scala.inline
    def EnableEnhancedMonitoringOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput]
    }
    
    @scala.inline
    def GetRecordsOutput($metadata: ResponseMetadata, Records: js.Array[UnmarshalledRecord]): typings.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput]
    }
    
    @scala.inline
    def GetShardIteratorOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput]
    }
    
    @scala.inline
    def IncreaseStreamRetentionPeriodOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput]
    }
    
    @scala.inline
    def ListShardsOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesListShardsOutputMod.ListShardsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListShardsOutputMod.ListShardsOutput]
    }
    
    @scala.inline
    def ListStreamConsumersOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput]
    }
    
    @scala.inline
    def ListStreamsOutput($metadata: ResponseMetadata, HasMoreStreams: Boolean, StreamNames: js.Array[String]): typings.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], HasMoreStreams = HasMoreStreams.asInstanceOf[js.Any], StreamNames = StreamNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput]
    }
    
    @scala.inline
    def ListTagsForStreamOutput($metadata: ResponseMetadata, HasMoreTags: Boolean, Tags: js.Array[UnmarshalledTag]): typings.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput]
    }
    
    @scala.inline
    def MergeShardsOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesMergeShardsOutputMod.MergeShardsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesMergeShardsOutputMod.MergeShardsOutput]
    }
    
    @scala.inline
    def PutRecordOutput($metadata: ResponseMetadata, SequenceNumber: String, ShardId: String): typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod.PutRecordOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod.PutRecordOutput]
    }
    
    @scala.inline
    def PutRecordsOutput($metadata: ResponseMetadata, Records: js.Array[UnmarshalledPutRecordsResultEntry]): typings.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod.PutRecordsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod.PutRecordsOutput]
    }
    
    @scala.inline
    def RegisterStreamConsumerOutput($metadata: ResponseMetadata, Consumer: UnmarshalledConsumer): typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Consumer = Consumer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput]
    }
    
    @scala.inline
    def RemoveTagsFromStreamOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamOutputMod.RemoveTagsFromStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamOutputMod.RemoveTagsFromStreamOutput]
    }
    
    @scala.inline
    def SplitShardOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput]
    }
    
    @scala.inline
    def StartStreamEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput]
    }
    
    @scala.inline
    def StopStreamEncryptionOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionOutputMod.StopStreamEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionOutputMod.StopStreamEncryptionOutput]
    }
    
    @scala.inline
    def UpdateShardCountOutput($metadata: ResponseMetadata): typings.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput]
    }
  }
}
