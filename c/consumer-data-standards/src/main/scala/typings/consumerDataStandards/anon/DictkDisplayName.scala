package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkDisplayName
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The name of the plan if one exists
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The end date of the applicability of this plan
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start date of the applicability of this plan
    */
  var startDate: String
}
object DictkDisplayName {
  
  inline def apply(startDate: String): DictkDisplayName = {
    val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkDisplayName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkDisplayName] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
