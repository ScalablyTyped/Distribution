package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effects extends js.Object {
  
  var buildingCost: Double = js.native
  
  var click: Double = js.native
  
  var cps: Double = js.native
  
  var cursorCps: Double = js.native
  
  var goldenCookieDur: Double = js.native
  
  var goldenCookieEffDur: Double = js.native
  
  var goldenCookieFreq: Double = js.native
  
  var goldenCookieGain: Double = js.native
  
  var grandmaCps: Double = js.native
  
  var itemDrops: Double = js.native
  
  var milk: Double = js.native
  
  var reindeerDur: Double = js.native
  
  var reindeerFreq: Double = js.native
  
  var reindeerGain: Double = js.native
  
  var upgradeCost: Double = js.native
  
  var wrathCookieDur: Double = js.native
  
  var wrathCookieEffDur: Double = js.native
  
  var wrathCookieFreq: Double = js.native
  
  var wrathCookieGain: Double = js.native
  
  var wrinklerEat: Double = js.native
  
  var wrinklerSpawn: Double = js.native
}
object Effects {
  
  @scala.inline
  def apply(
    buildingCost: Double,
    click: Double,
    cps: Double,
    cursorCps: Double,
    goldenCookieDur: Double,
    goldenCookieEffDur: Double,
    goldenCookieFreq: Double,
    goldenCookieGain: Double,
    grandmaCps: Double,
    itemDrops: Double,
    milk: Double,
    reindeerDur: Double,
    reindeerFreq: Double,
    reindeerGain: Double,
    upgradeCost: Double,
    wrathCookieDur: Double,
    wrathCookieEffDur: Double,
    wrathCookieFreq: Double,
    wrathCookieGain: Double,
    wrinklerEat: Double,
    wrinklerSpawn: Double
  ): Effects = {
    val __obj = js.Dynamic.literal(buildingCost = buildingCost.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], cps = cps.asInstanceOf[js.Any], cursorCps = cursorCps.asInstanceOf[js.Any], goldenCookieDur = goldenCookieDur.asInstanceOf[js.Any], goldenCookieEffDur = goldenCookieEffDur.asInstanceOf[js.Any], goldenCookieFreq = goldenCookieFreq.asInstanceOf[js.Any], goldenCookieGain = goldenCookieGain.asInstanceOf[js.Any], grandmaCps = grandmaCps.asInstanceOf[js.Any], itemDrops = itemDrops.asInstanceOf[js.Any], milk = milk.asInstanceOf[js.Any], reindeerDur = reindeerDur.asInstanceOf[js.Any], reindeerFreq = reindeerFreq.asInstanceOf[js.Any], reindeerGain = reindeerGain.asInstanceOf[js.Any], upgradeCost = upgradeCost.asInstanceOf[js.Any], wrathCookieDur = wrathCookieDur.asInstanceOf[js.Any], wrathCookieEffDur = wrathCookieEffDur.asInstanceOf[js.Any], wrathCookieFreq = wrathCookieFreq.asInstanceOf[js.Any], wrathCookieGain = wrathCookieGain.asInstanceOf[js.Any], wrinklerEat = wrinklerEat.asInstanceOf[js.Any], wrinklerSpawn = wrinklerSpawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effects]
  }
  
  @scala.inline
  implicit class EffectsOps[Self <: Effects] (val x: Self) extends AnyVal {
    
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
    def setBuildingCost(value: Double): Self = this.set("buildingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: Double): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCps(value: Double): Self = this.set("cps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorCps(value: Double): Self = this.set("cursorCps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoldenCookieDur(value: Double): Self = this.set("goldenCookieDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoldenCookieEffDur(value: Double): Self = this.set("goldenCookieEffDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoldenCookieFreq(value: Double): Self = this.set("goldenCookieFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoldenCookieGain(value: Double): Self = this.set("goldenCookieGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrandmaCps(value: Double): Self = this.set("grandmaCps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDrops(value: Double): Self = this.set("itemDrops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilk(value: Double): Self = this.set("milk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReindeerDur(value: Double): Self = this.set("reindeerDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReindeerFreq(value: Double): Self = this.set("reindeerFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReindeerGain(value: Double): Self = this.set("reindeerGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeCost(value: Double): Self = this.set("upgradeCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrathCookieDur(value: Double): Self = this.set("wrathCookieDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrathCookieEffDur(value: Double): Self = this.set("wrathCookieEffDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrathCookieFreq(value: Double): Self = this.set("wrathCookieFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrathCookieGain(value: Double): Self = this.set("wrathCookieGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrinklerEat(value: Double): Self = this.set("wrinklerEat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrinklerSpawn(value: Double): Self = this.set("wrinklerSpawn", value.asInstanceOf[js.Any])
  }
}
