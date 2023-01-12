package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountListResponseV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: js.Array[EnergyAccountV2]
  
  var links: LinksPaginated
  
  var meta: MetaPaginated
}
object EnergyAccountListResponseV2 {
  
  inline def apply(data: js.Array[EnergyAccountV2], links: LinksPaginated, meta: MetaPaginated): EnergyAccountListResponseV2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountListResponseV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccountListResponseV2] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[EnergyAccountV2]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: EnergyAccountV2*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
