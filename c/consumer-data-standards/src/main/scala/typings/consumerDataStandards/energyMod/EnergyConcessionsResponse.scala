package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Concessions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyConcessionsResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Concessions
  
  var links: Links
  
  var meta: js.UndefOr[Meta] = js.undefined
}
object EnergyConcessionsResponse {
  
  inline def apply(data: Concessions, links: Links): EnergyConcessionsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyConcessionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyConcessionsResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Concessions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
