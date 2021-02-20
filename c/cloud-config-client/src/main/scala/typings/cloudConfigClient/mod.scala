package typings.cloudConfigClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("cloud-config-client", "load")
  @js.native
  def load(options: Options): js.Promise[Config] = js.native
  @JSImport("cloud-config-client", "load")
  @js.native
  def load(options: Options, callback: LoadCallback): js.Promise[Config] = js.native
  
  @js.native
  trait Auth extends StObject {
    
    var pass: String = js.native
    
    var user: String = js.native
  }
  object Auth {
    
    @scala.inline
    def apply(pass: String, user: String): Auth = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigData extends StObject {
    
    var label: String = js.native
    
    var name: String = js.native
    
    var profiles: js.Array[String] = js.native
    
    var propertySources: js.Array[ConfigFile] = js.native
    
    var version: String = js.native
  }
  object ConfigData {
    
    @scala.inline
    def apply(
      label: String,
      name: String,
      profiles: js.Array[String],
      propertySources: js.Array[ConfigFile],
      version: String
    ): ConfigData = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], propertySources = propertySources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigData]
    }
    
    @scala.inline
    implicit class ConfigDataMutableBuilder[Self <: ConfigData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfiles(value: js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value :_*))
      
      @scala.inline
      def setPropertySources(value: js.Array[ConfigFile]): Self = StObject.set(x, "propertySources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertySourcesVarargs(value: ConfigFile*): Self = StObject.set(x, "propertySources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigFile extends StObject {
    
    var name: String = js.native
    
    var source: ConfigSource = js.native
  }
  object ConfigFile {
    
    @scala.inline
    def apply(name: String, source: ConfigSource): ConfigFile = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigFile]
    }
    
    @scala.inline
    implicit class ConfigFileMutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: ConfigSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigSource = StringDictionary[js.Any]
  
  type LoadCallback = js.Function2[/* error */ Error, /* config */ js.UndefOr[Config], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.native
    
    /** @deprecated use name */
    var application: js.UndefOr[String] = js.native
    
    var auth: js.UndefOr[Auth] = js.native
    
    var context: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var endpoint: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var profiles: js.UndefOr[String | js.Array[String]] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(name: String): Options = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfiles(value: String | js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
      
      @scala.inline
      def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value :_*))
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
}
