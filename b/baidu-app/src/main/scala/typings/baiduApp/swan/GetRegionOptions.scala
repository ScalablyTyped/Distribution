package typings.baiduApp.swan

import typings.baiduApp.anon.Northeast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegionOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetRegionOptions(res: Northeast): Unit
}
object GetRegionOptions {
  
  inline def apply(success: Northeast => Unit): GetRegionOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetRegionOptions]
  }
  
  extension [Self <: GetRegionOptions](x: Self) {
    
    inline def setSuccess(value: Northeast => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
