package typings.consumerDataStandards.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Outages
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDiscoveryOutagesList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Outages
  
  var links: Self
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ResponseDiscoveryOutagesList {
  
  inline def apply(data: Outages, links: Self): ResponseDiscoveryOutagesList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDiscoveryOutagesList]
  }
  
  extension [Self <: ResponseDiscoveryOutagesList](x: Self) {
    
    inline def setData(value: Outages): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
