package typings.browserSync.mod

import typings.chokidar.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCallback extends js.Object {
  
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
  implicit class FileCallbackOps[Self <: FileCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFn(value: (String, String) => js.Any): Self = this.set("fn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatchVarargs(value: String*): Self = this.set("match", js.Array(value :_*))
    
    @scala.inline
    def setMatch(value: String | js.Array[String]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setOptions(value: WatchOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
