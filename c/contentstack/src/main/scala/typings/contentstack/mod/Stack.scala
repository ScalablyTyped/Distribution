package typings.contentstack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "Stack")
@js.native
class Stack protected () extends js.Object {
  def this(config: Config) = this()
  def this(api_key: String, access_token: String, environment_name: String) = this()
  
  def Assets(uid: String): typings.contentstack.mod.Assets = js.native
  
  def ContentType(uid: String): typings.contentstack.mod.ContentType = js.native
  
  def Entry(uid: String): typings.contentstack.mod.Entry = js.native
  
  def Query(): typings.contentstack.mod.Query = js.native
  
  def clearAll(): Stack = js.native
  
  def clearByContentType(): Stack = js.native
  
  def clearByQuery(): Stack = js.native
  
  def fetch(): ContentType = js.native
  
  def getCacheProvider(): Stack = js.native
  
  def getContentTypes(param: String): Stack = js.native
  
  def getLastActivites(): Stack = js.native
  
  def imageTransform(url: String, params: js.Any): String = js.native
  
  def setCachePolicy(policy: Double): Stack = js.native
  
  def setCacheProvider(provider: js.Object): Stack = js.native
  
  def setHost(host: String): Stack = js.native
  
  def setPort(port: Double): Stack = js.native
  
  def setProtocol(protocol: String): Stack = js.native
  
  def sync(params: js.Object): js.Promise[_] = js.native
}
@JSImport("contentstack", "Stack")
@js.native
object Stack extends js.Object {
  
  def apply(api_key: String, access_token: String, environment_name: String): Stack = js.native
  def apply(config: Config): Stack = js.native
}
