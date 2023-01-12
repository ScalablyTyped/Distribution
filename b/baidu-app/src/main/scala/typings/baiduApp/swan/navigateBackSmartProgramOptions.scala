package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  返回上一个小程序(参数)
  */
trait navigateBackSmartProgramOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 需要返回给上一个小程序的数据，上一个小程序可在
    * App.onLaunch()，App.onShow() 中获取到这份数据。
    */
  var extraData: js.UndefOr[Any] = js.undefined
}
object navigateBackSmartProgramOptions {
  
  inline def apply(): navigateBackSmartProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[navigateBackSmartProgramOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: navigateBackSmartProgramOptions] (val x: Self) extends AnyVal {
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
  }
}
