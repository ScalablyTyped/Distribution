package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The name of the plan if one exists
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The end date of the applicability of this plan
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * The start date of the applicability of this plan
    */
  var startDate: String
}
object DisplayName {
  
  inline def apply(startDate: String): DisplayName = {
    val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
