package typings.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod

import typings.awsSdkClientDynamodbBrowser.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableAlreadyExistsException
  extends ServiceException[GlobalTableAlreadyExistsExceptionDetails]
     with CreateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_GlobalTableAlreadyExistsException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableAlreadyExistsException = js.native
}

object GlobalTableAlreadyExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: GlobalTableAlreadyExistsExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableAlreadyExistsException
  ): GlobalTableAlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableAlreadyExistsException]
  }
  @scala.inline
  implicit class GlobalTableAlreadyExistsExceptionOps[Self <: GlobalTableAlreadyExistsException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableAlreadyExistsException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

