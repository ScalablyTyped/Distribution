package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.achievement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Achievement extends StObject {
  
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
  implicit class AchievementMutableBuilder[Self <: Achievement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseDesc(value: String): Self = StObject.set(x, "baseDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickFunction(value: () => Unit): Self = StObject.set(x, "clickFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickFunctionUndefined: Self = StObject.set(x, "clickFunction", js.undefined)
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: PseudoBoolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: AchievementPool): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: achievement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVanilla(value: PseudoBoolean): Self = StObject.set(x, "vanilla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWon(value: PseudoBoolean): Self = StObject.set(x, "won", value.asInstanceOf[js.Any])
  }
}
