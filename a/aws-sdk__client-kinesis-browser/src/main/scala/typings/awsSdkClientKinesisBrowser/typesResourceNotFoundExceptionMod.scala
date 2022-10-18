package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamExceptionsUnionMod.AddTagsToStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodExceptionsUnionMod.DecreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamExceptionsUnionMod.DeleteStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerExceptionsUnionMod.DeregisterStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerExceptionsUnionMod.DescribeStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamExceptionsUnionMod.DescribeStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryExceptionsUnionMod.DescribeStreamSummaryExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringExceptionsUnionMod.DisableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringExceptionsUnionMod.EnableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesGetShardIteratorExceptionsUnionMod.GetShardIteratorExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodExceptionsUnionMod.IncreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesListShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesListStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesListTagsForStreamExceptionsUnionMod.ListTagsForStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesMergeShardsExceptionsUnionMod.MergeShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerExceptionsUnionMod.RegisterStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamExceptionsUnionMod.RemoveTagsFromStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesSplitShardExceptionsUnionMod.SplitShardExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionExceptionsUnionMod.StopStreamEncryptionExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesUpdateShardCountExceptionsUnionMod.UpdateShardCountExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ trait ResourceNotFoundException
    extends StObject
       with AddTagsToStreamExceptionsUnion
       with DecreaseStreamRetentionPeriodExceptionsUnion
       with DeleteStreamExceptionsUnion
       with DeregisterStreamConsumerExceptionsUnion
       with DescribeStreamConsumerExceptionsUnion
       with DescribeStreamExceptionsUnion
       with DescribeStreamSummaryExceptionsUnion
       with DisableEnhancedMonitoringExceptionsUnion
       with EnableEnhancedMonitoringExceptionsUnion
       with GetRecordsExceptionsUnion
       with GetShardIteratorExceptionsUnion
       with IncreaseStreamRetentionPeriodExceptionsUnion
       with ListShardsExceptionsUnion
       with ListStreamConsumersExceptionsUnion
       with ListTagsForStreamExceptionsUnion
       with MergeShardsExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion
       with RegisterStreamConsumerExceptionsUnion
       with RemoveTagsFromStreamExceptionsUnion
       with SplitShardExceptionsUnion
       with StartStreamEncryptionExceptionsUnion
       with StopStreamEncryptionExceptionsUnion
       with UpdateShardCountExceptionsUnion {
    
    var name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceNotFoundException
  }
  object ResourceNotFoundException {
    
    inline def apply(): ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[ResourceNotFoundException]
    }
    
    extension [Self <: ResourceNotFoundException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ResourceNotFoundExceptionDetails {
    
    inline def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    extension [Self <: ResourceNotFoundExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
