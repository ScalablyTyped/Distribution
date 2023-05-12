package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkBalance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyBalanceResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkBalance
  
  var links: Links
  
  var meta: js.UndefOr[Meta] = js.undefined
}
object EnergyBalanceResponse {
  
  inline def apply(data: DictkBalance, links: Links): EnergyBalanceResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyBalanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyBalanceResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: DictkBalance): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
