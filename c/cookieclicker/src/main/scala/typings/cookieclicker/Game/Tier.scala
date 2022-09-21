package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tier extends StObject {
  
  /**
    * The amount of buildings required to unlock the associated achievement
    */
  var achievUnlock: Double
  
  /**
    * The hex of the color to use (# required)
    */
  var color: String
  
  var iconRow: Double
  
  var name: String
  
  /**
    * The base price of a tiered upgrade, multiplied with building base price for true value
    */
  var price: Double
  
  /**
    * The name of the upgrade to be required to unlock the tier (Only checked for synergy upgrades)
    */
  var req: js.UndefOr[String] = js.undefined
  
  /**
    * If true, Upgrades with this tier won't count towards tiered CpS multiplier
    */
  var special: PseudoBoolean | Boolean
  
  /**
    * The amount of buildings required to unlock the associated upgrade
    */
  var unlock: Double
  
  var unshackleUpgrade: js.UndefOr[HeavenlyUpgrade] = js.undefined
  
  var upgrades: js.Array[GenericTieredUpgrade[String | Double]]
}
object Tier {
  
  inline def apply(
    achievUnlock: Double,
    color: String,
    iconRow: Double,
    name: String,
    price: Double,
    special: PseudoBoolean | Boolean,
    unlock: Double,
    upgrades: js.Array[GenericTieredUpgrade[String | Double]]
  ): Tier = {
    val __obj = js.Dynamic.literal(achievUnlock = achievUnlock.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], iconRow = iconRow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], upgrades = upgrades.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tier]
  }
  
  extension [Self <: Tier](x: Self) {
    
    inline def setAchievUnlock(value: Double): Self = StObject.set(x, "achievUnlock", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIconRow(value: Double): Self = StObject.set(x, "iconRow", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setReq(value: String): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setSpecial(value: PseudoBoolean | Boolean): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    inline def setUnlock(value: Double): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
    
    inline def setUnshackleUpgrade(value: HeavenlyUpgrade): Self = StObject.set(x, "unshackleUpgrade", value.asInstanceOf[js.Any])
    
    inline def setUnshackleUpgradeUndefined: Self = StObject.set(x, "unshackleUpgrade", js.undefined)
    
    inline def setUpgrades(value: js.Array[GenericTieredUpgrade[String | Double]]): Self = StObject.set(x, "upgrades", value.asInstanceOf[js.Any])
    
    inline def setUpgradesVarargs(value: (GenericTieredUpgrade[String | Double])*): Self = StObject.set(x, "upgrades", js.Array(value*))
  }
}
