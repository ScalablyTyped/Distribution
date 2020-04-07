package typings.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod

import typings.awsSdkClientKmsBrowser.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsBrowser.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidGrantIdException
  extends ServiceException[InvalidGrantIdExceptionDetails]
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantIdException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantIdException
}

object InvalidGrantIdException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidGrantIdExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantIdException,
    stack: String = null
  ): InvalidGrantIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidGrantIdException]
  }
}

