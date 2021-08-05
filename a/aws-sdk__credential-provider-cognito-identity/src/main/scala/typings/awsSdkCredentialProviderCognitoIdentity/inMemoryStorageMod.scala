package typings.awsSdkCredentialProviderCognitoIdentity

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inMemoryStorageMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/InMemoryStorage", "InMemoryStorage")
  @js.native
  class InMemoryStorage ()
    extends StObject
       with Storage {
    def this(store: StringDictionary[String]) = this()
    
    /* CompleteClass */
    override def getItem(key: String): String | Null | (js.Promise[String | Null]) = js.native
    
    /* CompleteClass */
    override def removeItem(key: String): Unit | js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setItem(key: String, data: String): Unit | js.Promise[Unit] = js.native
    
    /* private */ var store: js.Any = js.native
  }
}
