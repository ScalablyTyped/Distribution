package typings.cfenv

import org.scalablytyped.runtime.StringDictionary
import typings.cfenv.anon.Application
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cfenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAppEnv(): AppEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppEnv")().asInstanceOf[AppEnv]
  inline def getAppEnv(options: GetAppEnvOptions): AppEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppEnv")(options.asInstanceOf[js.Any]).asInstanceOf[AppEnv]
  
  @js.native
  trait AppEnv extends StObject {
    
    var app: js.Object = js.native
    
    var bind: String = js.native
    
    def getService(spec: String): Service | Null = js.native
    def getService(spec: RegExp): Service | Null = js.native
    
    def getServiceCreds(spec: String): js.Object | Null = js.native
    def getServiceCreds(spec: RegExp): js.Object | Null = js.native
    
    def getServiceURL(spec: String): String | Null = js.native
    def getServiceURL(spec: String, replacements: js.Object): String | Null = js.native
    def getServiceURL(spec: RegExp): String | Null = js.native
    def getServiceURL(spec: RegExp, replacements: js.Object): String | Null = js.native
    
    def getServices(): StringDictionary[Service] = js.native
    
    var isLocal: Boolean = js.native
    
    var name: String = js.native
    
    var port: Double = js.native
    
    var services: js.Object = js.native
    
    def toJSON(): String = js.native
    
    var url: String = js.native
    
    var urls: js.Array[String] = js.native
  }
  
  trait GetAppEnvOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var vcap: js.UndefOr[Application] = js.undefined
    
    var vcapFile: js.UndefOr[String] = js.undefined
  }
  object GetAppEnvOptions {
    
    inline def apply(): GetAppEnvOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAppEnvOptions]
    }
    
    extension [Self <: GetAppEnvOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setVcap(value: Application): Self = StObject.set(x, "vcap", value.asInstanceOf[js.Any])
      
      inline def setVcapFile(value: String): Self = StObject.set(x, "vcapFile", value.asInstanceOf[js.Any])
      
      inline def setVcapFileUndefined: Self = StObject.set(x, "vcapFile", js.undefined)
      
      inline def setVcapUndefined: Self = StObject.set(x, "vcap", js.undefined)
    }
  }
  
  trait Service extends StObject {
    
    var credentials: js.Object
    
    var label: String
    
    var name: String
    
    var plan: String
    
    var tags: js.Array[String]
  }
  object Service {
    
    inline def apply(credentials: js.Object, label: String, name: String, plan: String, tags: js.Array[String]): Service = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setCredentials(value: js.Object): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
