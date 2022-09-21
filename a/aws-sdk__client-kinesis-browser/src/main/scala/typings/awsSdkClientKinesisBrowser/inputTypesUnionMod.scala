package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ALL
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingBytes
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingRecords
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IteratorAgeMilliseconds
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingBytes
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingRecords
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ReadProvisionedThroughputExceeded
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UNIFORM_SCALING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.WriteProvisionedThroughputExceeded
import typings.awsSdkClientKinesisBrowser.typesPutRecordsRequestEntryMod.PutRecordsRequestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput
    - typings.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
    - typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
    - typings.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput
    - typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
    - typings.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typings.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput
    - typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput
    - typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput
    - typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
    - typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
    - typings.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
    - typings.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
    - typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
    - typings.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput
    - typings.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
    - typings.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
    - typings.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
    - typings.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput
    - typings.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput
    - typings.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput
    - typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
    - typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput
    - typings.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
    - typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
    - typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput
    - typings.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def AddTagsToStreamInput(StreamName: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput]
    }
    
    inline def CreateStreamInput(ShardCount: Double, StreamName: String): typings.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput = {
      val __obj = js.Dynamic.literal(ShardCount = ShardCount.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput]
    }
    
    inline def DecreaseStreamRetentionPeriodInput(RetentionPeriodHours: Double, StreamName: String): typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput]
    }
    
    inline def DeleteStreamInput(StreamName: String): typings.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput]
    }
    
    inline def DeregisterStreamConsumerInput(): typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput]
    }
    
    inline def DescribeLimitsInput(): typings.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    inline def DescribeStreamConsumerInput(): typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput]
    }
    
    inline def DescribeStreamInput(StreamName: String): typings.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput]
    }
    
    inline def DescribeStreamSummaryInput(StreamName: String): typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput]
    }
    
    inline def DisableEnhancedMonitoringInput(
      ShardLevelMetrics: (js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]) | (js.Iterable[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]),
      StreamName: String
    ): typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput]
    }
    
    inline def EnableEnhancedMonitoringInput(
      ShardLevelMetrics: (js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]) | (js.Iterable[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]),
      StreamName: String
    ): typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput]
    }
    
    inline def GetRecordsInput(ShardIterator: String): typings.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput = {
      val __obj = js.Dynamic.literal(ShardIterator = ShardIterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput]
    }
    
    inline def GetShardIteratorInput(
      ShardId: String,
      ShardIteratorType: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
      StreamName: String
    ): typings.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput = {
      val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput]
    }
    
    inline def IncreaseStreamRetentionPeriodInput(RetentionPeriodHours: Double, StreamName: String): typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput]
    }
    
    inline def ListShardsInput(): typings.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput]
    }
    
    inline def ListStreamConsumersInput(StreamARN: String): typings.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput = {
      val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput]
    }
    
    inline def ListStreamsInput(): typings.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput]
    }
    
    inline def ListTagsForStreamInput(StreamName: String): typings.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput]
    }
    
    inline def MergeShardsInput(AdjacentShardToMerge: String, ShardToMerge: String, StreamName: String): typings.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput = {
      val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput]
    }
    
    inline def PutRecordInput(
      Data: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      PartitionKey: String,
      StreamName: String
    ): typings.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput]
    }
    
    inline def PutRecordsInput(
      Records: js.Array[PutRecordsRequestEntry] | js.Iterable[PutRecordsRequestEntry],
      StreamName: String
    ): typings.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput]
    }
    
    inline def RegisterStreamConsumerInput(ConsumerName: String, StreamARN: String): typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal(ConsumerName = ConsumerName.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput]
    }
    
    inline def RemoveTagsFromStreamInput(StreamName: String, TagKeys: js.Array[String] | js.Iterable[String]): typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput]
    }
    
    inline def SplitShardInput(NewStartingHashKey: String, ShardToSplit: String, StreamName: String): typings.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput = {
      val __obj = js.Dynamic.literal(NewStartingHashKey = NewStartingHashKey.asInstanceOf[js.Any], ShardToSplit = ShardToSplit.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput]
    }
    
    inline def StartStreamEncryptionInput(EncryptionType: NONE | KMS | String, KeyId: String, StreamName: String): typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput]
    }
    
    inline def StopStreamEncryptionInput(EncryptionType: NONE | KMS | String, KeyId: String, StreamName: String): typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput]
    }
    
    inline def UpdateShardCountInput(ScalingType: UNIFORM_SCALING | String, StreamName: String, TargetShardCount: Double): typings.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput = {
      val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], TargetShardCount = TargetShardCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput]
    }
  }
}
