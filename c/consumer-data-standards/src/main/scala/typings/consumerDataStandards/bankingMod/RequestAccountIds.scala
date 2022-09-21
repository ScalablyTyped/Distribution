package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AccountIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestAccountIds
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: AccountIds
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object RequestAccountIds {
  
  inline def apply(data: AccountIds): RequestAccountIds = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAccountIds]
  }
  
  extension [Self <: RequestAccountIds](x: Self) {
    
    inline def setData(value: AccountIds): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
