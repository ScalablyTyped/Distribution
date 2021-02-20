package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tier extends StObject {
  
  /**
    * The amount of buildings required to unlock the associated achievement
    */
  var achievUnlock: Double = js.native
  
  /**
    * The hex of the color to use (# required)
    */
  var color: String = js.native
  
  var iconRow: Double = js.native
  
  var name: String = js.native
  
  /**
    * The base price of a tiered upgrade, multiplied with building base price for true value
    */
  var price: Double = js.native
  
  /**
    * The name of the upgrade to be required to unlock the tier (Only checked for synergy upgrades)
    */
  var req: js.UndefOr[String] = js.native
  
  /**
    * If true, Upgrades with this tier won't count towards tiered CpS multiplier
    */
  var special: PseudoBoolean | Boolean = js.native
  
  /**
    * The amount of buildings required to unlock the associated upgrade
    */
  var unlock: Double = js.native
  
  var upgrades: js.Array[
    TieredUpgradeClass[
      /* import warning: importer.ImportType#apply Failed type conversion: this['name'] */ js.Any
    ]
  ] = js.native
}
object Tier {
  
  @scala.inline
  def apply(
    achievUnlock: Double,
    color: String,
    iconRow: Double,
    name: String,
    price: Double,
    special: PseudoBoolean | Boolean,
    unlock: Double,
    upgrades: js.Array[
      TieredUpgradeClass[
        /* import warning: importer.ImportType#apply Failed type conversion: this['name'] */ js.Any
      ]
    ]
  ): Tier = {
    val __obj = js.Dynamic.literal(achievUnlock = achievUnlock.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], iconRow = iconRow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], upgrades = upgrades.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tier]
  }
  
  @scala.inline
  implicit class TierMutableBuilder[Self <: Tier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievUnlock(value: Double): Self = StObject.set(x, "achievUnlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRow(value: Double): Self = StObject.set(x, "iconRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: String): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setSpecial(value: PseudoBoolean | Boolean): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlock(value: Double): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgrades(
      value: js.Array[
          TieredUpgradeClass[
            /* import warning: importer.ImportType#apply Failed type conversion: this['name'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "upgrades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradesVarargs(
      value: (TieredUpgradeClass[
          /* import warning: importer.ImportType#apply Failed type conversion: this['name'] */ js.Any
        ])*
    ): Self = StObject.set(x, "upgrades", js.Array(value :_*))
  }
}
