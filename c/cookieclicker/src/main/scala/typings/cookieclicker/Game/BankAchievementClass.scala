package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankAchievementClass
  extends StObject
     with Achievement {
  
  /**
    * The amount of cookies required to be baked this ascension to get this achievement
    */
  var treshold: Double
}
object BankAchievementClass {
  
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
    treshold: Double,
    vanilla: PseudoBoolean,
    won: PseudoBoolean
  ): BankAchievementClass = {
    val __obj = js.Dynamic.literal(baseDesc = baseDesc.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), ddesc = ddesc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dname = dname.asInstanceOf[js.Any], getType = js.Any.fromFunction0(getType), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), treshold = treshold.asInstanceOf[js.Any], vanilla = vanilla.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("achievement")
    __obj.asInstanceOf[BankAchievementClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankAchievementClass] (val x: Self) extends AnyVal {
    
    inline def setTreshold(value: Double): Self = StObject.set(x, "treshold", value.asInstanceOf[js.Any])
  }
}
