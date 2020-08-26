package typings.awsSdkClientDynamodbBrowser.typesIndexNotFoundExceptionMod

import typings.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexNotFoundException
  extends ServiceException[IndexNotFoundExceptionDetails]
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_IndexNotFoundException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.IndexNotFoundException = js.native
}

object IndexNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: IndexNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.IndexNotFoundException
  ): IndexNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexNotFoundException]
  }
  @scala.inline
  implicit class IndexNotFoundExceptionOps[Self <: IndexNotFoundException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.IndexNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

