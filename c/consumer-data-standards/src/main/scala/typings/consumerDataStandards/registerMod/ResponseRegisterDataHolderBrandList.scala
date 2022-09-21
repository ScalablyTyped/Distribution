package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AuthDetails
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseRegisterDataHolderBrandList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Response data for the query
    */
  var data: js.Array[AuthDetails]
  
  var links: First
  
  var meta: TotalPages
}
object ResponseRegisterDataHolderBrandList {
  
  inline def apply(data: js.Array[AuthDetails], links: First, meta: TotalPages): ResponseRegisterDataHolderBrandList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseRegisterDataHolderBrandList]
  }
  
  extension [Self <: ResponseRegisterDataHolderBrandList](x: Self) {
    
    inline def setData(value: js.Array[AuthDetails]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: AuthDetails*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
