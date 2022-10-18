package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamExceptionsUnionMod.AddTagsToStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesCreateStreamExceptionsUnionMod.CreateStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodExceptionsUnionMod.DecreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamExceptionsUnionMod.DeleteStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerExceptionsUnionMod.DeregisterStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerExceptionsUnionMod.DescribeStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamExceptionsUnionMod.DescribeStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryExceptionsUnionMod.DescribeStreamSummaryExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringExceptionsUnionMod.DisableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringExceptionsUnionMod.EnableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodExceptionsUnionMod.IncreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesListShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesListStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesListTagsForStreamExceptionsUnionMod.ListTagsForStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesMergeShardsExceptionsUnionMod.MergeShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerExceptionsUnionMod.RegisterStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamExceptionsUnionMod.RemoveTagsFromStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesSplitShardExceptionsUnionMod.SplitShardExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionExceptionsUnionMod.StopStreamEncryptionExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesUpdateShardCountExceptionsUnionMod.UpdateShardCountExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_LimitExceededExceptionDetails> * / any */ trait LimitExceededException
    extends StObject
       with AddTagsToStreamExceptionsUnion
       with CreateStreamExceptionsUnion
       with DecreaseStreamRetentionPeriodExceptionsUnion
       with DeleteStreamExceptionsUnion
       with DeregisterStreamConsumerExceptionsUnion
       with DescribeStreamConsumerExceptionsUnion
       with DescribeStreamExceptionsUnion
       with DescribeStreamSummaryExceptionsUnion
       with DisableEnhancedMonitoringExceptionsUnion
       with EnableEnhancedMonitoringExceptionsUnion
       with IncreaseStreamRetentionPeriodExceptionsUnion
       with ListShardsExceptionsUnion
       with ListStreamConsumersExceptionsUnion
       with ListTagsForStreamExceptionsUnion
       with MergeShardsExceptionsUnion
       with RegisterStreamConsumerExceptionsUnion
       with RemoveTagsFromStreamExceptionsUnion
       with SplitShardExceptionsUnion
       with StartStreamEncryptionExceptionsUnion
       with StopStreamEncryptionExceptionsUnion
       with UpdateShardCountExceptionsUnion {
    
    var name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException
  }
  object LimitExceededException {
    
    inline def apply(): LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[LimitExceededException]
    }
    
    extension [Self <: LimitExceededException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait LimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object LimitExceededExceptionDetails {
    
    inline def apply(): LimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitExceededExceptionDetails]
    }
    
    extension [Self <: LimitExceededExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
