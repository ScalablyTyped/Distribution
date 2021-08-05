package typings.contentstack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contentstack", "Assets")
  @js.native
  class Assets () extends StObject {
    
    def addParam(key: String, value: js.Any): Assets = js.native
    
    def fetch(): js.Promise[js.Any] = js.native
    
    def toJSON(): Assets = js.native
  }
  
  @JSImport("contentstack", "ContentType")
  @js.native
  class ContentType () extends StObject {
    
    def Assets(uid: String): typings.contentstack.mod.Assets = js.native
    
    def Entry(uid: String): typings.contentstack.mod.Entry = js.native
    
    def Query(): typings.contentstack.mod.Query = js.native
  }
  
  @JSImport("contentstack", "Entry")
  @js.native
  class Entry () extends StObject {
    
    def addParam(key: String, value: js.Any): Entry = js.native
    
    def addQuery(key: String, value: String): Entry = js.native
    
    def fetch(): js.Promise[js.Any] = js.native
    
    def includeContentType(): Entry = js.native
    
    def includeOwner(): Entry = js.native
    
    def includeReference(`val`: String*): Entry = js.native
    def includeReference(`val`: js.Array[String]): Entry = js.native
    
    def includeReferenceContentTypeUID(): Entry = js.native
    
    def includeSchema(): Entry = js.native
    
    def language(language_code: String): Entry = js.native
    
    def setCachePolicy(policy: Double): Entry = js.native
    
    def setCacheProvider(provider: js.Object): Entry = js.native
    
    def toJSON(): Entry = js.native
  }
  
  @JSImport("contentstack", "Query")
  @js.native
  class Query () extends Entry {
    
    def containedIn(key: String, value: js.Any): Query = js.native
    
    def count(): Query = js.native
    
    def equalTo(key: String, value: js.Any): Query = js.native
    
    def find(): js.Promise[js.Any] = js.native
    
    def findOne(): js.Promise[js.Any] = js.native
    
    def getQuery(): Query = js.native
    
    def greaterThan(key: String, value: js.Any): Query = js.native
    
    def greaterThanOrEqualTo(key: String, value: js.Any): Query = js.native
    
    def includeCount(): Query = js.native
    
    def lessThan(key: String, value: js.Any): Query = js.native
    
    def lessThanOrEqualTo(key: String, value: js.Any): Query = js.native
    
    def notEqualTo(key: String, value: js.Any): Query = js.native
    
    def query(query: js.Any): Query = js.native
    
    def referenceIn(key: String, query: Query): Query = js.native
    
    def referenceNotIn(key: String, query: Query): Query = js.native
    
    def regex(key: String, value: js.Any, options: String): Query = js.native
    
    def search(value: String): Query = js.native
    
    def tags(value: js.Array[js.Any]): Query = js.native
    
    def where(key: String, value: js.Any): Query = js.native
  }
  
  @JSImport("contentstack", "Stack")
  @js.native
  class Stack protected () extends StObject {
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
    
    def sync(params: js.Object): js.Promise[js.Any] = js.native
  }
  object Stack {
    
    @JSImport("contentstack", "Stack")
    @js.native
    def apply(api_key: String, access_token: String, environment_name: String): Stack = js.native
    @JSImport("contentstack", "Stack")
    @js.native
    def apply(config: Config): Stack = js.native
  }
  
  trait Config extends StObject {
    
    var access_token: String
    
    var api_key: String
    
    var environment: String
  }
  object Config {
    
    inline def apply(access_token: String, api_key: String, environment: String): Config = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], api_key = api_key.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    }
  }
}
