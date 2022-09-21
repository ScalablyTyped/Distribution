package typings.consumerDataStandards.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Organisation
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseCommonCustomerDetailV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Organisation
  
  var links: Self
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ResponseCommonCustomerDetailV2 {
  
  inline def apply(data: Organisation, links: Self): ResponseCommonCustomerDetailV2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCommonCustomerDetailV2]
  }
  
  extension [Self <: ResponseCommonCustomerDetailV2](x: Self) {
    
    inline def setData(value: Organisation): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
