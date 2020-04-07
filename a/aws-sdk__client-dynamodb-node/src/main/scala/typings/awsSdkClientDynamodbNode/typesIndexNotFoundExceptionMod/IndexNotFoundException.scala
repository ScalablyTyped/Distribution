package typings.awsSdkClientDynamodbNode.typesIndexNotFoundExceptionMod

import typings.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexNotFoundException
  extends ServiceException[IndexNotFoundExceptionDetails]
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_IndexNotFoundException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.IndexNotFoundException
}

object IndexNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: IndexNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.IndexNotFoundException,
    stack: String = null
  ): IndexNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexNotFoundException]
  }
}

