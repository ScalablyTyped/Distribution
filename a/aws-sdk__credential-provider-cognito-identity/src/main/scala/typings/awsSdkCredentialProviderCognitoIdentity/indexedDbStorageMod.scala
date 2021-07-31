package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedDbStorageMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/IndexedDbStorage", "IndexedDbStorage")
  @js.native
  class IndexedDbStorage ()
    extends StObject
       with Storage {
    def this(dbName: String) = this()
    
    val dbName: js.Any = js.native
    
    var getDb: js.Any = js.native
    
    /* CompleteClass */
    override def getItem(key: String): String | Null | (js.Promise[String | Null]) = js.native
    
    /* CompleteClass */
    override def removeItem(key: String): Unit | js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setItem(key: String, data: String): Unit | js.Promise[Unit] = js.native
    
    var withObjectStore: js.Any = js.native
  }
}
