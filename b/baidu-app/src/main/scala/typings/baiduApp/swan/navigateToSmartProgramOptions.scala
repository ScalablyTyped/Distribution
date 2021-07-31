package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  打开另一个小程序。(参数)
  */
trait navigateToSmartProgramOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 要打开的小程序App Key
    */
  var appKey: String
  
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()
    * App.onShow() 中获取到这份数据。
    */
  var extraData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 打开的页面路径，如果为空则打开首页 。
    */
  var path: js.UndefOr[String] = js.undefined
}
object navigateToSmartProgramOptions {
  
  @scala.inline
  def apply(appKey: String): navigateToSmartProgramOptions = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[navigateToSmartProgramOptions]
  }
  
  @scala.inline
  implicit class navigateToSmartProgramOptionsMutableBuilder[Self <: navigateToSmartProgramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
