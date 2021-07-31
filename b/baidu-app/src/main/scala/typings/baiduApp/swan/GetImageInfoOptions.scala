package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageInfoOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
    */
  var src: String
}
object GetImageInfoOptions {
  
  @scala.inline
  def apply(src: String): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfoOptions]
  }
  
  @scala.inline
  implicit class GetImageInfoOptionsMutableBuilder[Self <: GetImageInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
