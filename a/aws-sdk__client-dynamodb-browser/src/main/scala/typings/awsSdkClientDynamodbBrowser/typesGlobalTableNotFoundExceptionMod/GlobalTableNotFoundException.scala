package typings.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod

import typings.awsSdkClientDynamodbBrowser.describeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.describeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableNotFoundException
  extends ServiceException[GlobalTableNotFoundExceptionDetails]
     with DescribeGlobalTableExceptionsUnion
     with DescribeGlobalTableSettingsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_GlobalTableNotFoundException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableNotFoundException
}

object GlobalTableNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: GlobalTableNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableNotFoundException,
    stack: String = null
  ): GlobalTableNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableNotFoundException]
  }
}

