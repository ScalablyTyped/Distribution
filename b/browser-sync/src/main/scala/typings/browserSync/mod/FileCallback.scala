package typings.browserSync.mod

import typings.chokidar.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCallback extends StObject {
  
  def fn(event: String, file: String): js.Any = js.native
  
  var `match`: js.UndefOr[String | js.Array[String]] = js.native
  
  var options: js.UndefOr[WatchOptions] = js.native
}
object FileCallback {
  
  @scala.inline
  def apply(fn: (String, String) => js.Any): FileCallback = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
    __obj.asInstanceOf[FileCallback]
  }
  
  @scala.inline
  implicit class FileCallbackMutableBuilder[Self <: FileCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: (String, String) => js.Any): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: WatchOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
