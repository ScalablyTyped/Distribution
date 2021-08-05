package typings.blueprintjsTimezone

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezoneMetadataMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTimezoneMetadata(timezone: String): ITimezoneMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneMetadata")(timezone.asInstanceOf[js.Any]).asInstanceOf[ITimezoneMetadata]
  inline def getTimezoneMetadata(timezone: String, date: Date): ITimezoneMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneMetadata")(timezone.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[ITimezoneMetadata]
  
  trait ITimezoneMetadata extends StObject {
    
    var abbreviation: js.UndefOr[String] = js.undefined
    
    var offset: Double
    
    var offsetAsString: String
    
    var population: js.UndefOr[Double] = js.undefined
    
    var timezone: String
  }
  object ITimezoneMetadata {
    
    inline def apply(offset: Double, offsetAsString: String, timezone: String): ITimezoneMetadata = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetAsString = offsetAsString.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimezoneMetadata]
    }
    
    extension [Self <: ITimezoneMetadata](x: Self) {
      
      inline def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
      
      inline def setAbbreviationUndefined: Self = StObject.set(x, "abbreviation", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetAsString(value: String): Self = StObject.set(x, "offsetAsString", value.asInstanceOf[js.Any])
      
      inline def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
      
      inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
