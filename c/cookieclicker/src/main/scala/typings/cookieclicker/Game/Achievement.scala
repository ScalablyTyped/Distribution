package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.achievement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Achievement extends js.Object {
  
  /**
    * The description of the upgrade without auto-adjusted text
    */
  var baseDesc: String = js.native
  
  /**
    * Called when the achievement crate is clicked, calls `clickFunction`
    */
  def click(): Unit = js.native
  
  /**
    * Called when the achievement crate is clicked
    */
  var clickFunction: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The description of the upgrade with auto-adjusted text
    */
  var desc: String = js.native
  
  /** Unused @deprecated */
  var disabled: PseudoBoolean = js.native
  
  var icon: Icon = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  /**
    * The place of the achievement in the achievement list
    */
  var order: Double = js.native
  
  var pool: AchievementPool = js.native
  
  /**
    * Toggles the achievement state
    */
  def toggle(): Unit = js.native
  
  var `type`: achievement = js.native
  
  var vanilla: PseudoBoolean = js.native
  
  var won: PseudoBoolean = js.native
}
object Achievement {
  
  @scala.inline
  def apply(
    baseDesc: String,
    click: () => Unit,
    desc: String,
    disabled: PseudoBoolean,
    icon: Icon,
    id: Double,
    name: String,
    order: Double,
    pool: AchievementPool,
    toggle: () => Unit,
    `type`: achievement,
    vanilla: PseudoBoolean,
    won: PseudoBoolean
  ): Achievement = {
    val __obj = js.Dynamic.literal(baseDesc = baseDesc.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), desc = desc.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), vanilla = vanilla.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Achievement]
  }
  
  @scala.inline
  implicit class AchievementOps[Self <: Achievement] (val x: Self) extends AnyVal {
    
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
    def setBaseDesc(value: String): Self = this.set("baseDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: PseudoBoolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: AchievementPool): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: achievement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVanilla(value: PseudoBoolean): Self = this.set("vanilla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWon(value: PseudoBoolean): Self = this.set("won", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickFunction(value: () => Unit): Self = this.set("clickFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClickFunction: Self = this.set("clickFunction", js.undefined)
  }
}
