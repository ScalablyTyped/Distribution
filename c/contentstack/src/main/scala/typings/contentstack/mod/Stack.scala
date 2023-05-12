package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "Stack")
@js.native
open class Stack protected () extends StObject {
  def this(config: Config) = this()
  /**
    * @deprecated since version 3.15.0
    */
  def this(api_key: String, delivery_token: String, environment_name: String) = this()
  def this(api_key: String, delivery_token: String, environment_name: String, region: Region) = this()
  def this(
    api_key: String,
    delivery_token: String,
    environment_name: String,
    region: Unit,
    fetchOptions: FetchOptions
  ) = this()
  def this(
    api_key: String,
    delivery_token: String,
    environment_name: String,
    region: Region,
    fetchOptions: FetchOptions
  ) = this()
  def this(
    api_key: String,
    delivery_token: String,
    environment_name: String,
    region: Unit,
    fetchOptions: Unit,
    live_preview: LivePreview
  ) = this()
  def this(
    api_key: String,
    delivery_token: String,
    environment_name: String,
    region: Unit,
    fetchOptions: FetchOptions,
    live_preview: LivePreview
  ) = this()
  def this(
    api_key: String,
    delivery_token: String,
    environment_name: String,
    region: Region,
    fetchOptions: Unit,
    live_preview: LivePreview
  ) = this()
  def this(
    api_key: String,
    delivery_token: String,
    environment_name: String,
    region: Region,
    fetchOptions: FetchOptions,
    live_preview: LivePreview
  ) = this()
  
  def Assets(): typings.contentstack.mod.Assets = js.native
  def Assets(uid: String): Asset = js.native
  
  def ContentType(uid: String): typings.contentstack.mod.ContentType = js.native
  
  var cachePolicy: CachePolicy = js.native
  
  def clearAll(): Stack = js.native
  
  def clearByContentType(): Stack = js.native
  
  def clearByQuery(): Stack = js.native
  
  var config: StackConfig = js.native
  
  var environment: String = js.native
  
  var fetchOptions: Any = js.native
  
  def getCacheProvider(): js.Object = js.native
  
  def getContentTypes(): js.Promise[ContentTypeCollection] = js.native
  def getContentTypes(param: js.Object): js.Promise[ContentTypeCollection] = js.native
  
  def getLastActivities(): js.Promise[Any] = js.native
  
  def imageTransform(url: String, params: Any): String = js.native
  
  def livePreviewQuery(query: LivePreviewQuery): Unit = js.native
  
  def setCachePolicy(policy: CachePolicy): Stack = js.native
  
  def setCacheProvider(provider: js.Object): Stack = js.native
  
  def setHost(host: String): Stack = js.native
  
  def setPort(port: Double): Stack = js.native
  
  def setProtocol(protocol: String): Stack = js.native
  
  def sync(params: js.Object): js.Promise[SyncResult] = js.native
}
object Stack {
  
  @JSImport("contentstack", "Stack")
  @js.native
  def apply(api_key: String, access_token: String, environment_name: String): Stack = js.native
  @JSImport("contentstack", "Stack")
  @js.native
  def apply(api_key: String, access_token: String, environment_name: String, region: String): Stack = js.native
  @JSImport("contentstack", "Stack")
  @js.native
  def apply(
    api_key: String,
    access_token: String,
    environment_name: String,
    region: String,
    fetchOptions: FetchOptions
  ): Stack = js.native
  @JSImport("contentstack", "Stack")
  @js.native
  def apply(
    api_key: String,
    access_token: String,
    environment_name: String,
    region: Unit,
    fetchOptions: FetchOptions
  ): Stack = js.native
  @JSImport("contentstack", "Stack")
  @js.native
  def apply(config: Config): Stack = js.native
}
