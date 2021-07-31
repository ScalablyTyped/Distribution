package typings.confit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(optionsOrBaseDir: String): ConfigFactory = ^.asInstanceOf[js.Dynamic].apply(optionsOrBaseDir.asInstanceOf[js.Any]).asInstanceOf[ConfigFactory]
  @scala.inline
  def apply(optionsOrBaseDir: options): ConfigFactory = ^.asInstanceOf[js.Dynamic].apply(optionsOrBaseDir.asInstanceOf[js.Any]).asInstanceOf[ConfigFactory]
  
  @JSImport("confit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ConfigFactory extends StObject {
    
    def addDefault(filepathOrSettingsObj: String): this.type = js.native
    def addDefault(filepathOrSettingsObj: js.Object): this.type = js.native
    
    def addOverride(filepathOrSettingsObj: String): this.type = js.native
    def addOverride(filepathOrSettingsObj: js.Object): this.type = js.native
    
    def create(callback: js.Function2[/* err */ js.Any, /* config */ ConfigStore, js.Any]): Unit = js.native
  }
  
  trait ConfigStore extends StObject {
    
    def get(name: String): js.Any
    
    def set[T](name: String, newValue: T): T
    
    def use(newSettings: js.Object): Unit
  }
  object ConfigStore {
    
    @scala.inline
    def apply(get: String => js.Any, set: (String, js.Any) => js.Any, use: js.Object => Unit): ConfigStore = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[ConfigStore]
    }
    
    @scala.inline
    implicit class ConfigStoreMutableBuilder[Self <: ConfigStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUse(value: js.Object => Unit): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  type ProtocolsSet = ProtocolsSetPrivate
  
  type ProtocolsSetPrivate = StringDictionary[js.Function2[/* value */ js.Any, /* callback */ js.UndefOr[js.Any], Unit]]
  
  trait options extends StObject {
    
    var basedir: String
    
    var protocols: ProtocolsSetPrivate
  }
  object options {
    
    @scala.inline
    def apply(basedir: String, protocols: ProtocolsSetPrivate): options = {
      val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit class optionsMutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocols(value: ProtocolsSetPrivate): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    }
  }
}
