package typings.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidAliasNameExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAliasNameException
  extends ServiceException[_InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidAliasNameException
}

object InvalidAliasNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidAliasNameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidAliasNameException,
    stack: String = null
  ): InvalidAliasNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAliasNameException]
  }
}

