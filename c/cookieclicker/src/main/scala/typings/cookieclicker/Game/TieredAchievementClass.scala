package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TieredAchievementClass[Tier /* <: String | Double */]
  extends StObject
     with Achievement {
  
  var buildingTie: GameObject
  
  var tier: Tier
}
object TieredAchievementClass {
  
  inline def apply[Tier /* <: String | Double */](
    baseDesc: String,
    buildingTie: GameObject,
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
    tier: Tier,
    toggle: () => Unit,
    vanilla: PseudoBoolean,
    won: PseudoBoolean
  ): TieredAchievementClass[Tier] = {
    val __obj = js.Dynamic.literal(baseDesc = baseDesc.asInstanceOf[js.Any], buildingTie = buildingTie.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), ddesc = ddesc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dname = dname.asInstanceOf[js.Any], getType = js.Any.fromFunction0(getType), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), vanilla = vanilla.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("achievement")
    __obj.asInstanceOf[TieredAchievementClass[Tier]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TieredAchievementClass[?], Tier /* <: String | Double */] (val x: Self & TieredAchievementClass[Tier]) extends AnyVal {
    
    inline def setBuildingTie(value: GameObject): Self = StObject.set(x, "buildingTie", value.asInstanceOf[js.Any])
    
    inline def setTier(value: Tier): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
  }
}
