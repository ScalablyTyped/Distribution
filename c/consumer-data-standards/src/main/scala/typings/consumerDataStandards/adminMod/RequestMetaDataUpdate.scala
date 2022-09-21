package typings.consumerDataStandards.adminMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMetaDataUpdate
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Action
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object RequestMetaDataUpdate {
  
  inline def apply(data: Action): RequestMetaDataUpdate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetaDataUpdate]
  }
  
  extension [Self <: RequestMetaDataUpdate](x: Self) {
    
    inline def setData(value: Action): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
