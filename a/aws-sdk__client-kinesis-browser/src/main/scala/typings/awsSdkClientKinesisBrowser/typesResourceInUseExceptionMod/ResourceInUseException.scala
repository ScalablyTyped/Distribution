package typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod

import typings.awsSdkClientKinesisBrowser.addTagsToStreamExceptionsUnionMod.AddTagsToStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.createStreamExceptionsUnionMod.CreateStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.decreaseStreamRetentionPeriodExceptionsUnionMod.DecreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.deleteStreamExceptionsUnionMod.DeleteStreamExceptionsUnion
import typings.awsSdkClientKinesisBrowser.disableEnhancedMonitoringExceptionsUnionMod.DisableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.enableEnhancedMonitoringExceptionsUnionMod.EnableEnhancedMonitoringExceptionsUnion
import typings.awsSdkClientKinesisBrowser.increaseStreamRetentionPeriodExceptionsUnionMod.IncreaseStreamRetentionPeriodExceptionsUnion
import typings.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
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

@js.native
trait ResourceInUseException
  extends ServiceException[ResourceInUseExceptionDetails]
     with AddTagsToStreamExceptionsUnion
     with CreateStreamExceptionsUnion
     with DecreaseStreamRetentionPeriodExceptionsUnion
     with DeleteStreamExceptionsUnion
     with DisableEnhancedMonitoringExceptionsUnion
     with EnableEnhancedMonitoringExceptionsUnion
     with IncreaseStreamRetentionPeriodExceptionsUnion
     with ListShardsExceptionsUnion
     with ListStreamConsumersExceptionsUnion
     with MergeShardsExceptionsUnion
     with RegisterStreamConsumerExceptionsUnion
     with RemoveTagsFromStreamExceptionsUnion
     with SplitShardExceptionsUnion
     with StartStreamEncryptionExceptionsUnion
     with StopStreamEncryptionExceptionsUnion
     with UpdateShardCountExceptionsUnion {
  @JSName("name")
  var name_ResourceInUseException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceInUseException = js.native
}

object ResourceInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceInUseExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceInUseException
  ): ResourceInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInUseException]
  }
  @scala.inline
  implicit class ResourceInUseExceptionOps[Self <: ResourceInUseException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceInUseException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

