package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkStringUnknown
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkStringUnknown
  
  var links: First
  
  var meta: TotalPages
}
object EnergyAccountListResponse {
  
  inline def apply(data: DictkStringUnknown, links: First, meta: TotalPages): EnergyAccountListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccountListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: DictkStringUnknown): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
