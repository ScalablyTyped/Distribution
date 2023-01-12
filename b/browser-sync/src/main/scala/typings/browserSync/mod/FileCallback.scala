package typings.browserSync.mod

import typings.chokidar.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCallback extends StObject {
  
  def fn(event: String, file: String): Any
  
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var options: js.UndefOr[WatchOptions] = js.undefined
}
object FileCallback {
  
  inline def apply(fn: (String, String) => Any): FileCallback = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
    __obj.asInstanceOf[FileCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileCallback] (val x: Self) extends AnyVal {
    
    inline def setFn(value: (String, String) => Any): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
    
    inline def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value*))
    
    inline def setOptions(value: WatchOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
