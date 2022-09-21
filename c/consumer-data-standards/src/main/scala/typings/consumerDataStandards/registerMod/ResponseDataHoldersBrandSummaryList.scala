package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Arbn
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDataHoldersBrandSummaryList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Response data for the query
    */
  var data: js.Array[Arbn]
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object ResponseDataHoldersBrandSummaryList {
  
  inline def apply(data: js.Array[Arbn], links: Self, meta: StringDictionary[Any]): ResponseDataHoldersBrandSummaryList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDataHoldersBrandSummaryList]
  }
  
  extension [Self <: ResponseDataHoldersBrandSummaryList](x: Self) {
    
    inline def setData(value: js.Array[Arbn]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Arbn*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
