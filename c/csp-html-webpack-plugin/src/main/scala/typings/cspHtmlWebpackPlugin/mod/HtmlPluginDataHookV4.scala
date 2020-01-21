package typings.cspHtmlWebpackPlugin.mod

import typings.tapable.mod.AsyncSeriesWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlPluginDataHookV4[T] extends js.Object {
  var beforeEmit: AsyncSeriesWaterfallHook[T, _, _]
}

object HtmlPluginDataHookV4 {
  @scala.inline
  def apply[T](beforeEmit: AsyncSeriesWaterfallHook[T, _, _]): HtmlPluginDataHookV4[T] = {
    val __obj = js.Dynamic.literal(beforeEmit = beforeEmit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HtmlPluginDataHookV4[T]]
  }
}

