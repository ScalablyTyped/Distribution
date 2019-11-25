package typings.atAwsDashSdkClientDashDynamodbDashNode.typesGlobalTableNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableNotFoundException
  extends ServiceException[_GlobalTableNotFoundExceptionDetails]
     with DescribeGlobalTableExceptionsUnion
     with DescribeGlobalTableSettingsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_GlobalTableNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.GlobalTableNotFoundException
}

object GlobalTableNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _GlobalTableNotFoundExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.GlobalTableNotFoundException,
    stack: String = null
  ): GlobalTableNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableNotFoundException]
  }
}

