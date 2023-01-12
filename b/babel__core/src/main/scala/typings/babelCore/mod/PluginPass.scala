package typings.babelCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginPass
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var cwd: String
  
  var file: BabelFile
  
  var filename: js.UndefOr[String] = js.undefined
  
  def get(key: Any): Any
  
  var key: String
  
  var opts: js.Object
  
  def set(key: Any, value: Any): Unit
}
object PluginPass {
  
  inline def apply(
    cwd: String,
    file: BabelFile,
    get: Any => Any,
    key: String,
    opts: js.Object,
    set: (Any, Any) => Unit
  ): PluginPass = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PluginPass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginPass] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setFile(value: BabelFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
