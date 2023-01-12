package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 第三方平台
trait ExtConfig extends StObject {
  
  /** 第三方平台自定义的数据 */
  var extConfig: Any
}
object ExtConfig {
  
  inline def apply(extConfig: Any): ExtConfig = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtConfig] (val x: Self) extends AnyVal {
    
    inline def setExtConfig(value: Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
  }
}
