package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalPages
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The total number of pages in the full set. See [pagination](#pagination).
    */
  var totalPages: Double
  
  /**
    * The total number of records in the full set. See [pagination](#pagination).
    */
  var totalRecords: Double
}
object TotalPages {
  
  inline def apply(totalPages: Double, totalRecords: Double): TotalPages = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any], totalRecords = totalRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalPages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalPages] (val x: Self) extends AnyVal {
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
  }
}
