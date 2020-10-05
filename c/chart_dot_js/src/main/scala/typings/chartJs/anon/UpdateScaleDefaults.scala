package typings.chartJs.anon

import typings.chartJs.mod.ChartScales
import typings.chartJs.mod.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateScaleDefaults extends js.Object {
  def updateScaleDefaults(`type`: ScaleType, updates: ChartScales): Unit = js.native
}

object UpdateScaleDefaults {
  @scala.inline
  def apply(updateScaleDefaults: (ScaleType, ChartScales) => Unit): UpdateScaleDefaults = {
    val __obj = js.Dynamic.literal(updateScaleDefaults = js.Any.fromFunction2(updateScaleDefaults))
    __obj.asInstanceOf[UpdateScaleDefaults]
  }
  @scala.inline
  implicit class UpdateScaleDefaultsOps[Self <: UpdateScaleDefaults] (val x: Self) extends AnyVal {
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
    def setUpdateScaleDefaults(value: (ScaleType, ChartScales) => Unit): Self = this.set("updateScaleDefaults", js.Any.fromFunction2(value))
  }
  
}

