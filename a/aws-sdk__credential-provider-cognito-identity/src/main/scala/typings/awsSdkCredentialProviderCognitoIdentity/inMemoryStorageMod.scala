package typings.awsSdkCredentialProviderCognitoIdentity

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/InMemoryStorage", JSImport.Namespace)
@js.native
object inMemoryStorageMod extends js.Object {
  
  @js.native
  class InMemoryStorage () extends Storage {
    def this(store: StringDictionary[String]) = this()
    
    var store: js.Any = js.native
  }
}
