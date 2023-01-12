package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
/**
  * App 实现的接口对象
  * 开发者可以添加任意的函数或数据到 Object 参数中，用 this 可以访问
  */
trait AppOptions extends StObject {
  
  /**
    * 全局Data
    */
  var globalData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * 错误监听函数
    * 当小程序发生脚本错误或者 api 调用失败时
    * 会触发 onError 并带上错误信息
    */
  var onError: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  
  /**
    * 监听小程序隐藏。
    * 当小程序从前台进入后台，会触发 onHide
    * 生命周期函数
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 监听小程序初始化。
    * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
    * 生命周期函数
    */
  var onLaunch: js.UndefOr[js.Function1[/* option */ LaunchOptions, Unit]] = js.undefined
  
  /**
    * 监听小程序显示。
    * 当小程序启动，或从后台进入前台显示，会触发 onShow
    * 生命周期函数
    */
  var onShow: js.UndefOr[js.Function1[/* option */ LaunchOptions, Unit]] = js.undefined
  
  /**
    * 小程序退出时触发
    */
  var onUnlaunch: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object AppOptions {
  
  inline def apply(): AppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
    
    inline def setGlobalData(value: js.Object): Self = StObject.set(x, "globalData", value.asInstanceOf[js.Any])
    
    inline def setGlobalDataUndefined: Self = StObject.set(x, "globalData", js.undefined)
    
    inline def setOnError(value: /* msg */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLaunch(value: /* option */ LaunchOptions => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
    
    inline def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    inline def setOnShow(value: /* option */ LaunchOptions => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnUnlaunch(value: () => Unit): Self = StObject.set(x, "onUnlaunch", js.Any.fromFunction0(value))
    
    inline def setOnUnlaunchUndefined: Self = StObject.set(x, "onUnlaunch", js.undefined)
  }
}
