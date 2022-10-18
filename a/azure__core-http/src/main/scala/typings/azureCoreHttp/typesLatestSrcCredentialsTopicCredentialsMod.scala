package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcCredentialsApiKeyCredentialsMod.ApiKeyCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcCredentialsTopicCredentialsMod {
  
  @JSImport("@azure/core-http/types/latest/src/credentials/topicCredentials", "TopicCredentials")
  @js.native
  open class TopicCredentials protected () extends ApiKeyCredentials {
    /**
      * Creates a new EventGrid TopicCredentials object.
      *
      * @param topicKey - The EventGrid topic key
      */
    def this(topicKey: String) = this()
  }
}
