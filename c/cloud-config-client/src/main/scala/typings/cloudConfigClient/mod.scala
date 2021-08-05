package typings.cloudConfigClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cloud-config-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cloud-config-client", "Config")
  @js.native
  abstract class Config protected () extends StObject {
    def this(data: ConfigData, context: StringDictionary[js.Any]) = this()
    
    def forEach(callback: js.Function2[/* property */ String, /* value */ String, Unit]): Unit = js.native
    def forEach(
      callback: js.Function2[/* property */ String, /* value */ String, Unit],
      includeOverridden: Boolean
    ): Unit = js.native
    
    def get(keyParts: String): js.Any = js.native
    
    def properties(): StringDictionary[js.Any] = js.native
    
    def raw(): StringDictionary[js.Any] = js.native
    
    def toObject(): StringDictionary[js.Any] = js.native
    
    def toString(spaces: Double): String = js.native
  }
  
  inline def load(options: Options): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config]]
  inline def load(options: Options, callback: LoadCallback): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  
  trait Auth extends StObject {
    
    var pass: String
    
    var user: String
  }
  object Auth {
    
    inline def apply(pass: String, user: String): Auth = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigData extends StObject {
    
    var label: String
    
    var name: String
    
    var profiles: js.Array[String]
    
    var propertySources: js.Array[ConfigFile]
    
    var version: String
  }
  object ConfigData {
    
    inline def apply(
      label: String,
      name: String,
      profiles: js.Array[String],
      propertySources: js.Array[ConfigFile],
      version: String
    ): ConfigData = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], propertySources = propertySources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigData]
    }
    
    extension [Self <: ConfigData](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProfiles(value: js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
      
      inline def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value :_*))
      
      inline def setPropertySources(value: js.Array[ConfigFile]): Self = StObject.set(x, "propertySources", value.asInstanceOf[js.Any])
      
      inline def setPropertySourcesVarargs(value: ConfigFile*): Self = StObject.set(x, "propertySources", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigFile extends StObject {
    
    var name: String
    
    var source: ConfigSource
  }
  object ConfigFile {
    
    inline def apply(name: String, source: ConfigSource): ConfigFile = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigFile]
    }
    
    extension [Self <: ConfigFile](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: ConfigSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigSource = StringDictionary[js.Any]
  
  type LoadCallback = js.Function2[/* error */ Error, /* config */ js.UndefOr[Config], Unit]
  
  trait Options extends StObject {
    
    var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.undefined
    
    /** @deprecated use name */
    var application: js.UndefOr[String] = js.undefined
    
    var auth: js.UndefOr[Auth] = js.undefined
    
    var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var profiles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(name: String): Options = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProfiles(value: String | js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
      
      inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
      
      inline def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value :_*))
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
}
