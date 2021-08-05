package typings.configstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("configstore", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Configstore {
    def this(packageName: String) = this()
    def this(packageName: String, defaults: js.Any) = this()
    def this(packageName: String, defaults: js.Any, options: ConfigstoreOptions) = this()
    def this(packageName: String, defaults: Unit, options: ConfigstoreOptions) = this()
  }
  
  @js.native
  trait Configstore extends StObject {
    
    /**
      * Get all items as an object or replace the current config with an object.
      */
    var all: js.Any = js.native
    
    /**
      * Clear the config.
      * Equivalent to <code>Configstore.all = {};</code>
      */
    def clear(): Unit = js.native
    
    /**
      * Delete an item.
      * @param key The key to delete
      */
    def delete(key: String): Unit = js.native
    
    /**
      * Get an item
      * @param key The string key to get
      * @return The contents of the config from key $key
      */
    def get(key: String): js.Any = js.native
    
    /**
      * Determines if a key is present in the config
      * @param key The string key to test for
      * @return True if the key is present
      */
    def has(key: String): Boolean = js.native
    
    /**
      * Get the path to the config file. Can be used to show the user
      * where it is, or better, open it for them.
      */
    var path: String = js.native
    
    /**
      * Set an item
      * @param key The string key
      * @param val The value to set
      */
    def set(key: String, `val`: js.Any): Unit = js.native
    /**
      * Set all key/value pairs declared in $values
      * @param values The values object.
      */
    def set(values: js.Any): Unit = js.native
    
    /**
      * Get the item count
      */
    var size: Double = js.native
  }
  
  trait ConfigstoreOptions extends StObject {
    
    var configPath: js.UndefOr[String] = js.undefined
    
    var globalConfigPath: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigstoreOptions {
    
    inline def apply(): ConfigstoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigstoreOptions]
    }
    
    extension [Self <: ConfigstoreOptions](x: Self) {
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setGlobalConfigPath(value: Boolean): Self = StObject.set(x, "globalConfigPath", value.asInstanceOf[js.Any])
      
      inline def setGlobalConfigPathUndefined: Self = StObject.set(x, "globalConfigPath", js.undefined)
    }
  }
}
