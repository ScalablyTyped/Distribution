package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserLaunchOptions extends StObject {
  
  var args: js.Array[String]
  
  var env: StringDictionary[Any]
  
  var extensions: js.Array[String]
  
  var preferences: StringDictionary[Any]
}
object BrowserLaunchOptions {
  
  inline def apply(
    args: js.Array[String],
    env: StringDictionary[Any],
    extensions: js.Array[String],
    preferences: StringDictionary[Any]
  ): BrowserLaunchOptions = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLaunchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserLaunchOptions] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setEnv(value: StringDictionary[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setPreferences(value: StringDictionary[Any]): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
  }
}
