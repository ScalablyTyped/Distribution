package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.KMS
import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.NONE
import typings.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import typings.awsSdkClientXrayNode.typesSamplingRuleUpdateMod.SamplingRuleUpdate
import typings.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod.SamplingStatisticsDocument
import typings.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
    - typings.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
    - typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
    - typings.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
    - typings.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
    - typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
    - typings.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
    - typings.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
    - typings.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
    - typings.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
    - typings.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
    - typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
    - typings.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
    - typings.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def BatchGetTracesInput(TraceIds: js.Array[String] | Iterable[String]): typings.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput = {
      val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput]
    }
    
    inline def CreateSamplingRuleInput(SamplingRule: SamplingRule): typings.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput = {
      val __obj = js.Dynamic.literal(SamplingRule = SamplingRule.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput]
    }
    
    inline def DeleteSamplingRuleInput(): typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput]
    }
    
    inline def GetEncryptionConfigInput(): typings.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput]
    }
    
    inline def GetSamplingRulesInput(): typings.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput]
    }
    
    inline def GetSamplingStatisticSummariesInput(): typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput]
    }
    
    inline def GetSamplingTargetsInput(
      SamplingStatisticsDocuments: js.Array[SamplingStatisticsDocument] | Iterable[SamplingStatisticsDocument]
    ): typings.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput = {
      val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput]
    }
    
    inline def GetServiceGraphInput(EndTime: Date | String | Double, StartTime: Date | String | Double): typings.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput]
    }
    
    inline def GetTraceGraphInput(TraceIds: js.Array[String] | Iterable[String]): typings.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput = {
      val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput]
    }
    
    inline def GetTraceSummariesInput(EndTime: Date | String | Double, StartTime: Date | String | Double): typings.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput]
    }
    
    inline def PutEncryptionConfigInput(Type: NONE | KMS | String): typings.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput]
    }
    
    inline def PutTelemetryRecordsInput(TelemetryRecords: js.Array[TelemetryRecord] | Iterable[TelemetryRecord]): typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput = {
      val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput]
    }
    
    inline def PutTraceSegmentsInput(TraceSegmentDocuments: js.Array[String] | Iterable[String]): typings.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput = {
      val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput]
    }
    
    inline def UpdateSamplingRuleInput(SamplingRuleUpdate: SamplingRuleUpdate): typings.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput = {
      val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput]
    }
  }
}
