package typings.cspHtmlWebpackPlugin.mod

import typings.tapable.mod.AsyncSeriesWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlPluginDataHookV4[T] extends js.Object {
  var beforeEmit: AsyncSeriesWaterfallHook[T, _, _] = js.native
}

object HtmlPluginDataHookV4 {
  @scala.inline
  def apply[T](beforeEmit: AsyncSeriesWaterfallHook[T, _, _]): HtmlPluginDataHookV4[T] = {
    val __obj = js.Dynamic.literal(beforeEmit = beforeEmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlPluginDataHookV4[T]]
  }
  @scala.inline
  implicit class HtmlPluginDataHookV4Ops[Self <: HtmlPluginDataHookV4[_], T] (val x: Self with HtmlPluginDataHookV4[T]) extends AnyVal {
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
    def setBeforeEmit(value: AsyncSeriesWaterfallHook[T, _, _]): Self = this.set("beforeEmit", value.asInstanceOf[js.Any])
  }
  
}

