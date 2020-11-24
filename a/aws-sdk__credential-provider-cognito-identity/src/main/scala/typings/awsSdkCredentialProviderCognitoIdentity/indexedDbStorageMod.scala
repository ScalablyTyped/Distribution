package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/IndexedDbStorage", JSImport.Namespace)
@js.native
object indexedDbStorageMod extends js.Object {
  
  @js.native
  class IndexedDbStorage () extends Storage {
    def this(dbName: String) = this()
    
    val dbName: js.Any = js.native
    
    var getDb: js.Any = js.native
    
    var withObjectStore: js.Any = js.native
  }
}
