package typings.baiduApp.swan

import typings.baiduApp.anon.ScrollTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Page 实现的接口对象
  */
@js.native
trait PageOptions extends StObject {
  
  /**
    * 页面的初始数据
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * 生命周期函数--监听页面隐藏
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 生命周期函数--监听页面加载
    * @param options 接收页面参数可以获取swan.navigateTo和swan.redirectTo及<navigator/>中的 query
    */
  var onLoad: js.UndefOr[js.Function1[/* options */ js.Object, Unit]] = js.native
  
  /**
    * 页面滚动触发事件的处理函数
    * 监听用户滑动页面事件。
    * 参数为 Object，包含以下字段：
    */
  var onPageScroll: js.UndefOr[js.Function1[/* option */ ScrollTop, Unit]] = js.native
  
  /**
    * 下拉刷新
    * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
    * 需要在 config 的window选项中开启 enablePullDownRefresh。
    * 当处理完数据刷新后，swan.stopPullDownRefresh可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 页面上拉触底事件的处理函数
    * 监听用户上拉触底事件。
    * 可以在app.json的window选项中或页面配置中设置触发距离onReachBottomDistance。
    * 在触发距离内滑动期间，本事件只会被触发一次。
    */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 生命周期函数--监听页面初次渲染完成
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 在 Page 中定义 onShareAppMessage 函数，设置该页面的转发信息。
    * + 只有定义了此事件处理函数，右上角菜单才会显示 “转发” 按
    * + 用户点击转发按钮的时候会调
    * + 此事件需要 return 一个 Object，用于自定义转发内容
    */
  var onShareAppMessage: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[PageShareAppMessageOptions], ShareAppMessage]
  ] = js.native
  
  /**
    * 生命周期函数--监听页面显示
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 当前是 tab 页时，点击 tab 时触发
    */
  var onTabItemTap: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.native
  
  /**
    * 生命周期函数--监听页面卸载
    */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.native
}
object PageOptions {
  
  @scala.inline
  def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  
  @scala.inline
  implicit class PageOptionsMutableBuilder[Self <: PageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* options */ js.Object => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnPageScroll(value: /* option */ ScrollTop => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: () => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnReachBottom(value: () => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnShareAppMessage(value: /* options */ js.UndefOr[PageShareAppMessageOptions] => ShareAppMessage): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* item */ js.Any => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
  }
}
