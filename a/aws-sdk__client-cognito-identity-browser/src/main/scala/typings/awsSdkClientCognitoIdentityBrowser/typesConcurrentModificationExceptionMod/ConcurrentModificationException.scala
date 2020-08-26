package typings.awsSdkClientCognitoIdentityBrowser.typesConcurrentModificationExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcurrentModificationException
  extends ServiceException[ConcurrentModificationExceptionDetails]
     with SetIdentityPoolRolesExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_ConcurrentModificationException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException = js.native
}

object ConcurrentModificationException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ConcurrentModificationExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
  ): ConcurrentModificationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcurrentModificationException]
  }
  @scala.inline
  implicit class ConcurrentModificationExceptionOps[Self <: ConcurrentModificationException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

