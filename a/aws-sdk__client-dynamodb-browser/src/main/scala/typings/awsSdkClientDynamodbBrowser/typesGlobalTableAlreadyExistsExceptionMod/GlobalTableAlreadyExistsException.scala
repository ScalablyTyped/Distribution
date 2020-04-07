package typings.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod

import typings.awsSdkClientDynamodbBrowser.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableAlreadyExistsException
  extends ServiceException[GlobalTableAlreadyExistsExceptionDetails]
     with CreateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_GlobalTableAlreadyExistsException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableAlreadyExistsException
}

object GlobalTableAlreadyExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: GlobalTableAlreadyExistsExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableAlreadyExistsException,
    stack: String = null
  ): GlobalTableAlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableAlreadyExistsException]
  }
}

