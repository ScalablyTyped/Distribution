package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 数据缓存
trait SetStorageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 需要存储的内容 */
  var data: Any
  
  /** 本地缓存中的指定的 key */
  var key: String
}
object SetStorageOptions {
  
  inline def apply(data: Any, key: String): SetStorageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStorageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetStorageOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
