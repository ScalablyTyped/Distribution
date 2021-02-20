package typings.baiduApp.swan

import typings.baiduApp.anon.FilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSavedFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var filePath: String = js.native
  
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_RemoveSavedFileOptions: js.UndefOr[js.Function1[/* res */ FilePath, Unit]] = js.native
}
object RemoveSavedFileOptions {
  
  @scala.inline
  def apply(filePath: String): RemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSavedFileOptions]
  }
  
  @scala.inline
  implicit class RemoveSavedFileOptionsMutableBuilder[Self <: RemoveSavedFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ FilePath => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
