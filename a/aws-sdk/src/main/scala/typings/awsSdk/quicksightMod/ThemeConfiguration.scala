package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeConfiguration extends js.Object {
  /**
    * Color properties that apply to chart data colors.
    */
  var DataColorPalette: js.UndefOr[typings.awsSdk.quicksightMod.DataColorPalette] = js.native
  /**
    * Display options related to sheets.
    */
  var Sheet: js.UndefOr[SheetStyle] = js.native
  /**
    * Color properties that apply to the UI and to charts, excluding the colors that apply to data. 
    */
  var UIColorPalette: js.UndefOr[typings.awsSdk.quicksightMod.UIColorPalette] = js.native
}

object ThemeConfiguration {
  @scala.inline
  def apply(): ThemeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeConfiguration]
  }
  @scala.inline
  implicit class ThemeConfigurationOps[Self <: ThemeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataColorPalette(value: DataColorPalette): Self = this.set("DataColorPalette", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataColorPalette: Self = this.set("DataColorPalette", js.undefined)
    @scala.inline
    def setSheet(value: SheetStyle): Self = this.set("Sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheet: Self = this.set("Sheet", js.undefined)
    @scala.inline
    def setUIColorPalette(value: UIColorPalette): Self = this.set("UIColorPalette", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUIColorPalette: Self = this.set("UIColorPalette", js.undefined)
  }
  
}

