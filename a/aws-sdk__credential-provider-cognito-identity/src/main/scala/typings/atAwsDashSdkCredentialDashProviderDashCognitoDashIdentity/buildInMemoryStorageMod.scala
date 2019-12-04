package typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildStorageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-cognito-identity/build/InMemoryStorage", JSImport.Namespace)
@js.native
object buildInMemoryStorageMod extends js.Object {
  @js.native
  class InMemoryStorage () extends Storage {
    def this(store: StringDictionary[String]) = this()
    var store: js.Any = js.native
    /* CompleteClass */
    override def getItem(key: String): String | Null | (js.Promise[String | Null]) = js.native
    /* CompleteClass */
    override def removeItem(key: String): Unit | js.Promise[Unit] = js.native
    /* CompleteClass */
    override def setItem(key: String, data: String): Unit | js.Promise[Unit] = js.native
  }
  
}

