package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GardenSoil extends StObject {
  
  /**
    * The multiplier of garden effects
    */
  var effMult: Double
  
  /**
    * The HTML string describing the effects of the soil
    */
  var effsStr: String
  
  /**
    * The soil icon column in the plant icon sheet
    */
  var icon: Double
  
  var id: Double
  
  /**
    * The internal name of the soil
    */
  var key: String
  
  /**
    * The displayed name of the soil
    */
  var name: String
  
  /**
    * The flavour text of the soil
    */
  var q: String
  
  /**
    * The amount of farms required to unlock the soil
    */
  var req: Double
  
  /**
    * The amount of minutes per tick
    */
  var tick: Double
  
  /**
    * The multiplier of weed amount
    */
  var weedMult: Double
}
object GardenSoil {
  
  inline def apply(
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
  
  extension [Self <: GardenSoil](x: Self) {
    
    inline def setEffMult(value: Double): Self = StObject.set(x, "effMult", value.asInstanceOf[js.Any])
    
    inline def setEffsStr(value: String): Self = StObject.set(x, "effsStr", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setReq(value: Double): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setTick(value: Double): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setWeedMult(value: Double): Self = StObject.set(x, "weedMult", value.asInstanceOf[js.Any])
  }
}
