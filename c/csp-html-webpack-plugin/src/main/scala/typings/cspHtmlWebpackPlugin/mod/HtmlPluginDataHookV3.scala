package typings.cspHtmlWebpackPlugin.mod

import typings.tapable.mod.AsyncSeriesWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Helpers for extracting the relevant generic types from
// HtmlWebpackPlugin.Hooks.
trait HtmlPluginDataHookV3[T] extends js.Object {
  var htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, _, _]
}

object HtmlPluginDataHookV3 {
  @scala.inline
  def apply[T](htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, _, _]): HtmlPluginDataHookV3[T] = {
    val __obj = js.Dynamic.literal(htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HtmlPluginDataHookV3[T]]
  }
}

