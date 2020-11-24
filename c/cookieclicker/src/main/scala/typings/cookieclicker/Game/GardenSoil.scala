package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GardenSoil extends js.Object {
  
  /**
    * The multiplier of garden effects
    */
  var effMult: Double = js.native
  
  /**
    * The HTML string describing the effects of the soil
    */
  var effsStr: String = js.native
  
  /**
    * The soil icon column in the plant icon sheet
    */
  var icon: Double = js.native
  
  var id: Double = js.native
  
  /**
    * The internal name of the soil
    */
  var key: String = js.native
  
  /**
    * The displayed name of the soil
    */
  var name: String = js.native
  
  /**
    * The flavour text of the soil
    */
  var q: String = js.native
  
  /**
    * The amount of farms required to unlock the soil
    */
  var req: Double = js.native
  
  /**
    * The amount of minutes per tick
    */
  var tick: Double = js.native
  
  /**
    * The multiplier of weed amount
    */
  var weedMult: Double = js.native
}
object GardenSoil {
  
  @scala.inline
  def apply(
    effMult: Double,
    effsStr: String,
    icon: Double,
    id: Double,
    key: String,
    name: String,
    q: String,
    req: Double,
    tick: Double,
    weedMult: Double
  ): GardenSoil = {
    val __obj = js.Dynamic.literal(effMult = effMult.asInstanceOf[js.Any], effsStr = effsStr.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], weedMult = weedMult.asInstanceOf[js.Any])
    __obj.asInstanceOf[GardenSoil]
  }
  
  @scala.inline
  implicit class GardenSoilOps[Self <: GardenSoil] (val x: Self) extends AnyVal {
    
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
    def setEffMult(value: Double): Self = this.set("effMult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffsStr(value: String): Self = this.set("effsStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Double): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: Double): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick(value: Double): Self = this.set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeedMult(value: Double): Self = this.set("weedMult", value.asInstanceOf[js.Any])
  }
}
