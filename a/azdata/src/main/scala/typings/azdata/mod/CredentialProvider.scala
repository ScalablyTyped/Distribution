package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialProvider extends js.Object {
  var handle: Double
  def deleteCredential(credentialId: String): Thenable[Boolean]
  def readCredential(credentialId: String): Thenable[Credential]
  def saveCredential(credentialId: String, password: String): Thenable[Boolean]
}

object CredentialProvider {
  @scala.inline
  def apply(
    deleteCredential: String => Thenable[Boolean],
    handle: Double,
    readCredential: String => Thenable[Credential],
    saveCredential: (String, String) => Thenable[Boolean]
  ): CredentialProvider = {
    val __obj = js.Dynamic.literal(deleteCredential = js.Any.fromFunction1(deleteCredential), handle = handle.asInstanceOf[js.Any], readCredential = js.Any.fromFunction1(readCredential), saveCredential = js.Any.fromFunction2(saveCredential))
    __obj.asInstanceOf[CredentialProvider]
  }
}

