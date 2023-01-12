package typings.config

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("config", JSImport.Namespace)
  @js.native
  val ^ : IConfig = js.native
  
  trait IConfig extends StObject {
    
    def get[T](setting: String): T
    
    def has(setting: String): Boolean
    
    var util: IUtil
  }
  object IConfig {
    
    inline def apply(get: String => Any, has: String => Boolean, util: IUtil): IConfig = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), util = util.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setUtil(value: IUtil): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    }
  }
  
  trait IConfigSource extends StObject {
    
    var name: String
    
    var original: js.UndefOr[String] = js.undefined
    
    var parsed: Any
  }
  object IConfigSource {
    
    inline def apply(name: String, parsed: Any): IConfigSource = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfigSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfigSource] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setParsed(value: Any): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    }
  }
  
  // see https://github.com/lorenwest/node-config/wiki/Using-Config-Utilities
  @js.native
  trait IUtil extends StObject {
    
    // Return a deep copy of the specified object.
    def cloneDeep(copyFrom: Any): Any = js.native
    def cloneDeep(copyFrom: Any, depth: Double): Any = js.native
    
    // Returns an object containing all elements that differ between two objects.
    def diffDeep(object1: Any, object2: Any): Any = js.native
    def diffDeep(object1: Any, object2: Any, depth: Double): Any = js.native
    
    // Return true if two objects have equal contents.
    def equalsDeep(object1: Any, object2: Any): Boolean = js.native
    def equalsDeep(object1: Any, object2: Any, dept: Double): Boolean = js.native
    
    def extendDeep(mergeInto: Any, mergeFrom1: Any, mergeFrom2: Any): Any = js.native
    def extendDeep(mergeInto: Any, mergeFrom1: Any, mergeFrom2: Any, depth: Double): Any = js.native
    // Extend an object (and any object it contains) with one or more objects (and objects contained in them).
    def extendDeep(mergeInto: Any, mergeFrom: Any): Any = js.native
    def extendDeep(mergeInto: Any, mergeFrom: Any, depth: Double): Any = js.native
    
    // Return the sources for the configurations
    def getConfigSources(): js.Array[IConfigSource] = js.native
    
    // Get the current value of a config environment variable
    def getEnv(varName: String): String = js.native
    
    // Return the config for the project based on directory param if not directory then return default one (config).
    def loadFileConfigs(): Any = js.native
    def loadFileConfigs(configDir: String): Any = js.native
    
    // Make an object property hidden so it doesn't appear when enumerating elements of the object.
    def makeHidden(`object`: Any, propertyName: String): Any = js.native
    def makeHidden(`object`: Any, propertyName: String, propertyValue: String): Any = js.native
    
    // Make a javascript object property immutable (assuring it cannot be changed from the current value).
    def makeImmutable(`object`: Any): Any = js.native
    def makeImmutable(`object`: Any, propertyName: String): Any = js.native
    def makeImmutable(`object`: Any, propertyName: String, propertyValue: String): Any = js.native
    def makeImmutable(`object`: Any, propertyName: Unit, propertyValue: String): Any = js.native
    
    /**
      * This allows module developers to attach their configurations onto the default configuration object
      * so they can be configured by the consumers of the module.
      */
    def setModuleDefaults(moduleName: String, defaults: Any): Any = js.native
    
    // Returns a new deep copy of the current config object, or any part of the config if provided.
    def toObject(): Any = js.native
    def toObject(config: Any): Any = js.native
  }
  
  type _To = IConfig
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IConfig = ^
}
