package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 本地缓存中的指定的 key */
  var key: String
  
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  def success_MGetStorageOptions(res: DataResponse): Unit
}
object GetStorageOptions {
  
  @scala.inline
  def apply(key: String, success: DataResponse => Unit): GetStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageOptions]
  }
  
  @scala.inline
  implicit class GetStorageOptionsMutableBuilder[Self <: GetStorageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: DataResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
