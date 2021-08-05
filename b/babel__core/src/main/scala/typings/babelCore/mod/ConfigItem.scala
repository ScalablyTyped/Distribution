package typings.babelCore.mod

import typings.babelCore.anon.Request
import typings.babelCore.babelCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigItem extends StObject {
  
  /**
    * The path that the options are relative to.
    */
  var dirname: String
  
  /**
    * Information about the plugin's file, if Babel knows it.
    *  *
    */
  var file: js.UndefOr[Request | Null] = js.undefined
  
  /**
    * The name that the user gave the plugin instance, e.g. `plugins: [ ['env', {}, 'my-env'] ]`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The options object passed to the plugin.
    */
  var options: js.UndefOr[js.Object | `false`] = js.undefined
  
  /**
    * The resolved value of the plugin.
    */
  var value: js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
}
object ConfigItem {
  
  inline def apply(dirname: String, value: js.Object | (js.Function1[/* repeated */ js.Any, js.Any])): ConfigItem = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
  
  extension [Self <: ConfigItem](x: Self) {
    
    inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    inline def setFile(value: Request): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Object | `false`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: js.Object | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
