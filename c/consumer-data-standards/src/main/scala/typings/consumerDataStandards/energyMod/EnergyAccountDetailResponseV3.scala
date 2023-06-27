package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountDetailResponseV3
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: EnergyAccountDetailV3
  
  var links: Links
  
  var meta: Meta
}
object EnergyAccountDetailResponseV3 {
  
  inline def apply(data: EnergyAccountDetailV3, links: Links, meta: Meta): EnergyAccountDetailResponseV3 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountDetailResponseV3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccountDetailResponseV3] (val x: Self) extends AnyVal {
    
    inline def setData(value: EnergyAccountDetailV3): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
