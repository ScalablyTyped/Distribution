package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于检测和识别图片中的品牌 LOGO 信息
  */
trait logoClassifyOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  // 图像资源地址
  var custom_lib: js.UndefOr[Boolean] = js.undefined
  
  var image: String
  
  // 是否只检索用户子库，true则只检索用户子库，false(默认)为检索底库+用户子库。
  @JSName("success")
  var success_logoClassifyOptions: js.UndefOr[js.Function1[/* res */ logoClassifyResponse, Unit]] = js.undefined
}
object logoClassifyOptions {
  
  inline def apply(image: String): logoClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[logoClassifyOptions]
  }
  
  extension [Self <: logoClassifyOptions](x: Self) {
    
    inline def setCustom_lib(value: Boolean): Self = StObject.set(x, "custom_lib", value.asInstanceOf[js.Any])
    
    inline def setCustom_libUndefined: Self = StObject.set(x, "custom_lib", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ logoClassifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
