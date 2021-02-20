package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedDbStorageMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/IndexedDbStorage", "IndexedDbStorage")
  @js.native
  class IndexedDbStorage () extends Storage {
    def this(dbName: String) = this()
    
    val dbName: js.Any = js.native
    
    var getDb: js.Any = js.native
    
    var withObjectStore: js.Any = js.native
  }
}
