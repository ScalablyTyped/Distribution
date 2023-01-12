package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.FRI
import typings.consumerDataStandards.consumerDataStandardsStrings.MON
import typings.consumerDataStandards.consumerDataStandardsStrings.PUBLIC_HOLIDAYS
import typings.consumerDataStandards.consumerDataStandardsStrings.SAT
import typings.consumerDataStandards.consumerDataStandardsStrings.SUN
import typings.consumerDataStandards.consumerDataStandardsStrings.THU
import typings.consumerDataStandards.consumerDataStandardsStrings.TUE
import typings.consumerDataStandards.consumerDataStandardsStrings.WED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the contrlled load, for e.g. controlled load availability if specific day/time is not known. Required if startTime and endTime absent or if additionalInfoUri provided
    */
  var additionalInfo: js.UndefOr[String] = js.undefined
  
  /**
    * Optional link to additional information regarding the controlled load
    */
  var additionalInfoUri: js.UndefOr[String] = js.undefined
  
  /**
    * The days that the rate applies to
    */
  var days: js.UndefOr[js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]] = js.undefined
  
  /**
    * The end of the time period per day for which the controlled load rate applies. Required if startTime provided
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The beginning of the time period per day for which the controlled load rate applies. Required if endTime provided
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object Days {
  
  inline def apply(): Days = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Days]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Days] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setDays(value: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setDaysVarargs(value: (SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS)*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
