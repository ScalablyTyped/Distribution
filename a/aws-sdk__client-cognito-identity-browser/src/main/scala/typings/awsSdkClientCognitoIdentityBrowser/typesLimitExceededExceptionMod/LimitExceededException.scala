package typings.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.createIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with CreateIdentityPoolExceptionsUnion
     with GetIdExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.LimitExceededException = js.native
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: LimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.LimitExceededException
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
  @scala.inline
  implicit class LimitExceededExceptionOps[Self <: LimitExceededException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.LimitExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

