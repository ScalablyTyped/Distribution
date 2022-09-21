package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait CredentialsContainer extends StObject {
  
  def create(): Promise[Credential | Null] = js.native
  def create(options: CredentialCreationOptions): Promise[Credential | Null] = js.native
  
  def get(): Promise[Credential | Null] = js.native
  def get(options: CredentialRequestOptions): Promise[Credential | Null] = js.native
  
  def preventSilentAccess(): Promise[Unit] = js.native
  
  def store(credential: Credential): Promise[Credential] = js.native
}
