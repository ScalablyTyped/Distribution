package typings.blueprintjsTimezone

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezoneMetadataMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneMetadata", "getTimezoneMetadata")
  @js.native
  def getTimezoneMetadata(timezone: String): ITimezoneMetadata = js.native
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneMetadata", "getTimezoneMetadata")
  @js.native
  def getTimezoneMetadata(timezone: String, date: Date): ITimezoneMetadata = js.native
  
  @js.native
  trait ITimezoneMetadata extends StObject {
    
    var abbreviation: js.UndefOr[String] = js.native
    
    var offset: Double = js.native
    
    var offsetAsString: String = js.native
    
    var population: js.UndefOr[Double] = js.native
    
    var timezone: String = js.native
  }
  object ITimezoneMetadata {
    
    @scala.inline
    def apply(offset: Double, offsetAsString: String, timezone: String): ITimezoneMetadata = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetAsString = offsetAsString.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimezoneMetadata]
    }
    
    @scala.inline
    implicit class ITimezoneMetadataMutableBuilder[Self <: ITimezoneMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbreviationUndefined: Self = StObject.set(x, "abbreviation", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetAsString(value: String): Self = StObject.set(x, "offsetAsString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
