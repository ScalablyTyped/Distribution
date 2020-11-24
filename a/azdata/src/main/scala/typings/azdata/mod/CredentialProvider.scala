package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialProvider extends js.Object {
  
  def deleteCredential(credentialId: String): Thenable[Boolean] = js.native
  
  var handle: Double = js.native
  
  def readCredential(credentialId: String): Thenable[Credential] = js.native
  
  def saveCredential(credentialId: String, password: String): Thenable[Boolean] = js.native
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
  
  @scala.inline
  implicit class CredentialProviderOps[Self <: CredentialProvider] (val x: Self) extends AnyVal {
    
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
    def setDeleteCredential(value: String => Thenable[Boolean]): Self = this.set("deleteCredential", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandle(value: Double): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCredential(value: String => Thenable[Credential]): Self = this.set("readCredential", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveCredential(value: (String, String) => Thenable[Boolean]): Self = this.set("saveCredential", js.Any.fromFunction2(value))
  }
}
