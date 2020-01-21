package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-cognito-identity/build/IndexedDbStorage", JSImport.Namespace)
@js.native
object indexedDbStorageMod extends js.Object {
  @js.native
  class IndexedDbStorage () extends Storage {
    def this(dbName: String) = this()
    val dbName: js.Any = js.native
    var getDb: js.Any = js.native
    var withObjectStore: js.Any = js.native
    /* CompleteClass */
    override def getItem(key: String): String | Null | (js.Promise[String | Null]) = js.native
    /* CompleteClass */
    override def removeItem(key: String): Unit | js.Promise[Unit] = js.native
    /* CompleteClass */
    override def setItem(key: String, data: String): Unit | js.Promise[Unit] = js.native
  }
  
}

