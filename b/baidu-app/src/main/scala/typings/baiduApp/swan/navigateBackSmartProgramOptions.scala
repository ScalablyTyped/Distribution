package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  返回上一个小程序(参数)
  */
@js.native
trait navigateBackSmartProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要返回给上一个小程序的数据，上一个小程序可在
    * App.onLaunch()，App.onShow() 中获取到这份数据。
    */
  var extraData: js.UndefOr[js.Any] = js.native
}
object navigateBackSmartProgramOptions {
  
  @scala.inline
  def apply(): navigateBackSmartProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[navigateBackSmartProgramOptions]
  }
  
  @scala.inline
  implicit class navigateBackSmartProgramOptionsMutableBuilder[Self <: navigateBackSmartProgramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
  }
}
