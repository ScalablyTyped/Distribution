package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountDetailResponseV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: EnergyAccountDetailV2
  
  var links: Links
  
  var meta: Meta
}
object EnergyAccountDetailResponseV2 {
  
  inline def apply(data: EnergyAccountDetailV2, links: Links, meta: Meta): EnergyAccountDetailResponseV2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountDetailResponseV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccountDetailResponseV2] (val x: Self) extends AnyVal {
    
    inline def setData(value: EnergyAccountDetailV2): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
