package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaPaginated
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The total number of pages in the full set
    */
  var totalPages: Double
  
  /**
    * The total number of records in the full set
    */
  var totalRecords: Double
}
object MetaPaginated {
  
  inline def apply(totalPages: Double, totalRecords: Double): MetaPaginated = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any], totalRecords = totalRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPaginated]
  }
  
  extension [Self <: MetaPaginated](x: Self) {
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
  }
}
