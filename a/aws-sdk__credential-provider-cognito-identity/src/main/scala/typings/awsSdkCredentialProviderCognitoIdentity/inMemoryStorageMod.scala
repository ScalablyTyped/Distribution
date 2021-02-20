package typings.awsSdkCredentialProviderCognitoIdentity

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inMemoryStorageMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/InMemoryStorage", "InMemoryStorage")
  @js.native
  class InMemoryStorage () extends Storage {
    def this(store: StringDictionary[String]) = this()
    
    var store: js.Any = js.native
  }
}
