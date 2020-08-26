package typings.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod

import typings.awsSdkClientDynamodbBrowser.createTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceInUseException
  extends ServiceException[ResourceInUseExceptionDetails]
     with CreateTableExceptionsUnion
     with DeleteTableExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion
     with UpdateTableExceptionsUnion
     with UpdateTimeToLiveExceptionsUnion {
  @JSName("name")
  var name_ResourceInUseException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException = js.native
}

object ResourceInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceInUseExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException
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
    def setName(
      value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

