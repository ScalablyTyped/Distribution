package typings.cspHtmlWebpackPlugin.mod

import typings.tapable.mod.AsyncSeriesWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Helpers for extracting the relevant generic types from
// HtmlWebpackPlugin.Hooks.
@js.native
trait HtmlPluginDataHookV3[T] extends js.Object {
  var htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, _, _] = js.native
}

object HtmlPluginDataHookV3 {
  @scala.inline
  def apply[T](htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, _, _]): HtmlPluginDataHookV3[T] = {
    val __obj = js.Dynamic.literal(htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlPluginDataHookV3[T]]
  }
  @scala.inline
  implicit class HtmlPluginDataHookV3Ops[Self <: HtmlPluginDataHookV3[_], T] (val x: Self with HtmlPluginDataHookV3[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtmlWebpackPluginAfterHtmlProcessing(value: AsyncSeriesWaterfallHook[T, _, _]): Self = this.set("htmlWebpackPluginAfterHtmlProcessing", value.asInstanceOf[js.Any])
  }
  
}

