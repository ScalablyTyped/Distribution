package typings.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod

import typings.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.getShardIteratorExceptionsUnionMod.GetShardIteratorExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typings.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedThroughputExceededException
  extends ServiceException[ProvisionedThroughputExceededExceptionDetails]
     with GetRecordsExceptionsUnion
     with GetShardIteratorExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion {
  @JSName("name")
  var name_ProvisionedThroughputExceededException: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException
}

object ProvisionedThroughputExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ProvisionedThroughputExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException,
    stack: String = null
  ): ProvisionedThroughputExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputExceededException]
  }
}

