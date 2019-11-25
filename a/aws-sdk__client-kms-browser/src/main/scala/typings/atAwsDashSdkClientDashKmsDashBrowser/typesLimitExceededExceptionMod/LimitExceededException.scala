package typings.atAwsDashSdkClientDashKmsDashBrowser.typesLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEnableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededException
  extends ServiceException[_LimitExceededExceptionDetails]
     with CreateAliasExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with EnableKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with TagResourceExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _LimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
}

