package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.achievement_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Achievement extends StObject {
  
  /**
    * The description of the upgrade without auto-adjusted text
    */
  var baseDesc: String
  
  /**
    * Called when the achievement crate is clicked, calls `clickFunction`
    */
  def click(): Unit
  
  /**
    * Called when the achievement crate is clicked
    */
  var clickFunction: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ddesc: String
  
  /**
    * The description of the upgrade with auto-adjusted text
    */
  var desc: String
  
  /** Unused @deprecated */
  var disabled: PseudoBoolean
  
  var dname: String
  
  def getType(): typings.cookieclicker.cookieclickerStrings.Achievement
  
  var icon: Icon
  
  var id: Double
  
  var name: String
  
  /**
    * The place of the achievement in the achievement list
    */
  var order: Double
  
  var pool: AchievementPool
  
  /**
    * Toggles the achievement state
    */
  def toggle(): Unit
  
  var `type`: achievement_
  
  var vanilla: PseudoBoolean
  
  var won: PseudoBoolean
}
object Achievement {
  
  inline def apply(
    baseDesc: String,
    click: () => Unit,
    ddesc: String,
    desc: String,
    disabled: PseudoBoolean,
    dname: String,
    getType: () => typings.cookieclicker.cookieclickerStrings.Achievement,
    icon: Icon,
    id: Double,
    name: String,
    order: Double,
    pool: AchievementPool,
    toggle: () => Unit,
    vanilla: PseudoBoolean,
    won: PseudoBoolean
  ): Achievement = {
    val __obj = js.Dynamic.literal(baseDesc = baseDesc.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), ddesc = ddesc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dname = dname.asInstanceOf[js.Any], getType = js.Any.fromFunction0(getType), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), vanilla = vanilla.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("achievement")
    __obj.asInstanceOf[Achievement]
  }
  
  extension [Self <: Achievement](x: Self) {
    
    inline def setBaseDesc(value: String): Self = StObject.set(x, "baseDesc", value.asInstanceOf[js.Any])
    
    inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setClickFunction(value: () => Unit): Self = StObject.set(x, "clickFunction", js.Any.fromFunction0(value))
    
    inline def setClickFunctionUndefined: Self = StObject.set(x, "clickFunction", js.undefined)
    
    inline def setDdesc(value: String): Self = StObject.set(x, "ddesc", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: PseudoBoolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDname(value: String): Self = StObject.set(x, "dname", value.asInstanceOf[js.Any])
    
    inline def setGetType(value: () => typings.cookieclicker.cookieclickerStrings.Achievement): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setPool(value: AchievementPool): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    inline def setType(value: achievement_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVanilla(value: PseudoBoolean): Self = StObject.set(x, "vanilla", value.asInstanceOf[js.Any])
    
    inline def setWon(value: PseudoBoolean): Self = StObject.set(x, "won", value.asInstanceOf[js.Any])
  }
}
