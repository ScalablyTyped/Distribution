package typings.carbonThemes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends js.Object {
  
  var active01: String = js.native
  
  var activeDanger: String = js.native
  
  var activePrimary: String = js.native
  
  var activeSecondary: String = js.native
  
  var activeTertiary: String = js.native
  
  var activeUI: String = js.native
  
  var brand01: String = js.native
  
  var brand02: String = js.native
  
  var brand03: String = js.native
  
  var disabled01: String = js.native
  
  var disabled02: String = js.native
  
  var disabled03: String = js.native
  
  var field01: String = js.native
  
  var field02: String = js.native
  
  var focus: String = js.native
  
  var highlight: String = js.native
  
  var hoverDanger: String = js.native
  
  var hoverField: String = js.native
  
  var hoverPrimary: String = js.native
  
  var hoverPrimaryText: String = js.native
  
  var hoverRow: String = js.native
  
  var hoverSecondary: String = js.native
  
  var hoverSelectedUI: String = js.native
  
  var hoverTertiary: String = js.native
  
  var hoverUI: String = js.native
  
  var icon01: String = js.native
  
  var icon02: String = js.native
  
  var interactive01: String = js.native
  
  var interactive02: String = js.native
  
  var interactive03: String = js.native
  
  var inverse01: String = js.native
  
  var inverse02: String = js.native
  
  var overlay01: String = js.native
  
  var selectedUI: String = js.native
  
  var support01: String = js.native
  
  var support02: String = js.native
  
  var support03: String = js.native
  
  var support04: String = js.native
  
  var text01: String = js.native
  
  var text02: String = js.native
  
  var text03: String = js.native
  
  var text04: String = js.native
  
  var ui01: String = js.native
  
  var ui02: String = js.native
  
  var ui03: String = js.native
  
  var ui04: String = js.native
  
  var ui05: String = js.native
  
  var uiBackground: String = js.native
  
  var visitedLink: String = js.native
}
object Theme {
  
  @scala.inline
  def apply(
    active01: String,
    activeDanger: String,
    activePrimary: String,
    activeSecondary: String,
    activeTertiary: String,
    activeUI: String,
    brand01: String,
    brand02: String,
    brand03: String,
    disabled01: String,
    disabled02: String,
    disabled03: String,
    field01: String,
    field02: String,
    focus: String,
    highlight: String,
    hoverDanger: String,
    hoverField: String,
    hoverPrimary: String,
    hoverPrimaryText: String,
    hoverRow: String,
    hoverSecondary: String,
    hoverSelectedUI: String,
    hoverTertiary: String,
    hoverUI: String,
    icon01: String,
    icon02: String,
    interactive01: String,
    interactive02: String,
    interactive03: String,
    inverse01: String,
    inverse02: String,
    overlay01: String,
    selectedUI: String,
    support01: String,
    support02: String,
    support03: String,
    support04: String,
    text01: String,
    text02: String,
    text03: String,
    text04: String,
    ui01: String,
    ui02: String,
    ui03: String,
    ui04: String,
    ui05: String,
    uiBackground: String,
    visitedLink: String
  ): Theme = {
    val __obj = js.Dynamic.literal(active01 = active01.asInstanceOf[js.Any], activeDanger = activeDanger.asInstanceOf[js.Any], activePrimary = activePrimary.asInstanceOf[js.Any], activeSecondary = activeSecondary.asInstanceOf[js.Any], activeTertiary = activeTertiary.asInstanceOf[js.Any], activeUI = activeUI.asInstanceOf[js.Any], brand01 = brand01.asInstanceOf[js.Any], brand02 = brand02.asInstanceOf[js.Any], brand03 = brand03.asInstanceOf[js.Any], disabled01 = disabled01.asInstanceOf[js.Any], disabled02 = disabled02.asInstanceOf[js.Any], disabled03 = disabled03.asInstanceOf[js.Any], field01 = field01.asInstanceOf[js.Any], field02 = field02.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], hoverDanger = hoverDanger.asInstanceOf[js.Any], hoverField = hoverField.asInstanceOf[js.Any], hoverPrimary = hoverPrimary.asInstanceOf[js.Any], hoverPrimaryText = hoverPrimaryText.asInstanceOf[js.Any], hoverRow = hoverRow.asInstanceOf[js.Any], hoverSecondary = hoverSecondary.asInstanceOf[js.Any], hoverSelectedUI = hoverSelectedUI.asInstanceOf[js.Any], hoverTertiary = hoverTertiary.asInstanceOf[js.Any], hoverUI = hoverUI.asInstanceOf[js.Any], icon01 = icon01.asInstanceOf[js.Any], icon02 = icon02.asInstanceOf[js.Any], interactive01 = interactive01.asInstanceOf[js.Any], interactive02 = interactive02.asInstanceOf[js.Any], interactive03 = interactive03.asInstanceOf[js.Any], inverse01 = inverse01.asInstanceOf[js.Any], inverse02 = inverse02.asInstanceOf[js.Any], overlay01 = overlay01.asInstanceOf[js.Any], selectedUI = selectedUI.asInstanceOf[js.Any], support01 = support01.asInstanceOf[js.Any], support02 = support02.asInstanceOf[js.Any], support03 = support03.asInstanceOf[js.Any], support04 = support04.asInstanceOf[js.Any], text01 = text01.asInstanceOf[js.Any], text02 = text02.asInstanceOf[js.Any], text03 = text03.asInstanceOf[js.Any], text04 = text04.asInstanceOf[js.Any], ui01 = ui01.asInstanceOf[js.Any], ui02 = ui02.asInstanceOf[js.Any], ui03 = ui03.asInstanceOf[js.Any], ui04 = ui04.asInstanceOf[js.Any], ui05 = ui05.asInstanceOf[js.Any], uiBackground = uiBackground.asInstanceOf[js.Any], visitedLink = visitedLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    
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
    def setActive01(value: String): Self = this.set("active01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDanger(value: String): Self = this.set("activeDanger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePrimary(value: String): Self = this.set("activePrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSecondary(value: String): Self = this.set("activeSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTertiary(value: String): Self = this.set("activeTertiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUI(value: String): Self = this.set("activeUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand01(value: String): Self = this.set("brand01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand02(value: String): Self = this.set("brand02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand03(value: String): Self = this.set("brand03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled01(value: String): Self = this.set("disabled01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled02(value: String): Self = this.set("disabled02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled03(value: String): Self = this.set("disabled03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField01(value: String): Self = this.set("field01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField02(value: String): Self = this.set("field02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: String): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: String): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverDanger(value: String): Self = this.set("hoverDanger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverField(value: String): Self = this.set("hoverField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverPrimary(value: String): Self = this.set("hoverPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverPrimaryText(value: String): Self = this.set("hoverPrimaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverRow(value: String): Self = this.set("hoverRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverSecondary(value: String): Self = this.set("hoverSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverSelectedUI(value: String): Self = this.set("hoverSelectedUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverTertiary(value: String): Self = this.set("hoverTertiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUI(value: String): Self = this.set("hoverUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon01(value: String): Self = this.set("icon01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon02(value: String): Self = this.set("icon02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive01(value: String): Self = this.set("interactive01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive02(value: String): Self = this.set("interactive02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive03(value: String): Self = this.set("interactive03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverse01(value: String): Self = this.set("inverse01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverse02(value: String): Self = this.set("inverse02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay01(value: String): Self = this.set("overlay01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUI(value: String): Self = this.set("selectedUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupport01(value: String): Self = this.set("support01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupport02(value: String): Self = this.set("support02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupport03(value: String): Self = this.set("support03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupport04(value: String): Self = this.set("support04", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText01(value: String): Self = this.set("text01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText02(value: String): Self = this.set("text02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText03(value: String): Self = this.set("text03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText04(value: String): Self = this.set("text04", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi01(value: String): Self = this.set("ui01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi02(value: String): Self = this.set("ui02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi03(value: String): Self = this.set("ui03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi04(value: String): Self = this.set("ui04", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi05(value: String): Self = this.set("ui05", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiBackground(value: String): Self = this.set("uiBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitedLink(value: String): Self = this.set("visitedLink", value.asInstanceOf[js.Any])
  }
}
