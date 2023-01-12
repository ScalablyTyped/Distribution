package typings.baiduApp.swan

import typings.baiduApp.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 位置-----地图组件控制
trait GetCenterLocationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetCenterLocationOptions(res: Latitude): Unit
}
object GetCenterLocationOptions {
  
  inline def apply(success: Latitude => Unit): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCenterLocationOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Latitude => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
