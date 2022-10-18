package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.distTypesStorageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIndexedDbStorageMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist-types/IndexedDbStorage", "IndexedDbStorage")
  @js.native
  open class IndexedDbStorage ()
    extends StObject
       with Storage {
    def this(dbName: String) = this()
    
    /* private */ val dbName: Any = js.native
    
    /* private */ var getDb: Any = js.native
    
    /* CompleteClass */
    override def getItem(key: String): String | Null | (js.Promise[String | Null]) = js.native
    
    /* CompleteClass */
    override def removeItem(key: String): Unit | js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setItem(key: String, data: String): Unit | js.Promise[Unit] = js.native
    
    /* private */ var withObjectStore: Any = js.native
  }
}
