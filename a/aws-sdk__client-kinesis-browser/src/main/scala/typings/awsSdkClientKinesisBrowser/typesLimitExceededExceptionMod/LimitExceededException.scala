package typings.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod

import typings.awsSdkClientKinesisBrowser.addTagsToStreamExceptionsUnionMod.AddTagsToStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.createStreamExceptionsUnionMod.CreateStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.decreaseStreamRetentionPeriodExceptionsUnionMod.DecreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.deleteStreamExceptionsUnionMod.DeleteStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.deregisterStreamConsumerExceptionsUnionMod.DeregisterStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.describeStreamConsumerExceptionsUnionMod.DescribeStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.describeStreamExceptionsUnionMod.DescribeStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.describeStreamSummaryExceptionsUnionMod.DescribeStreamSummaryExceptionsUnion
import typings.awsSdkClientKinesisBrowser.disableEnhancedMonitoringExceptionsUnionMod.DisableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.enableEnhancedMonitoringExceptionsUnionMod.EnableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.increaseStreamRetentionPeriodExceptionsUnionMod.IncreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typings.awsSdkClientKinesisBrowser.listTagsForStreamExceptionsUnionMod.ListTagsForStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.mergeShardsExceptionsUnionMod.MergeShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.registerStreamConsumerExceptionsUnionMod.RegisterStreamConsumerExceptionsUnion
import typings.awsSdkClientKinesisBrowser.removeTagsFromStreamExceptionsUnionMod.RemoveTagsFromStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.splitShardExceptionsUnionMod.SplitShardExceptionsUnion
import typings.awsSdkClientKinesisBrowser.startStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typings.awsSdkClientKinesisBrowser.stopStreamEncryptionExceptionsUnionMod.StopStreamEncryptionExceptionsUnion
import typings.awsSdkClientKinesisBrowser.updateShardCountExceptionsUnionMod.UpdateShardCountExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
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
  @JSName("name")
  var name_LimitExceededException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: LimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
}

