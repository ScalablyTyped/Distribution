package typings.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.createIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with CreateIdentityPoolExceptionsUnion
     with GetIdExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: LimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
}

