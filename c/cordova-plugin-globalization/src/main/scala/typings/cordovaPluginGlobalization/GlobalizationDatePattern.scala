package typings.cordovaPluginGlobalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Pattern to format and parse dates according to the client's user preferences.*/
trait GlobalizationDatePattern extends StObject {
  
  /* The current daylight saving time offset in seconds between the client's non-daylight saving's time zone and the client's daylight saving's time zone. */
  var dst_offset: Double
  
  /* The date and time pattern to format and parse dates. The patterns follow Unicode Technical Standard #35. */
  var pattern: String
  
  /* The abbreviated name of the time zone on the client. */
  var timezone: String
  
  /* The current difference in seconds between the client's time zone and coordinated universal time. */
  var utc_offset: Double
}
object GlobalizationDatePattern {
  
  inline def apply(dst_offset: Double, pattern: String, timezone: String, utc_offset: Double): GlobalizationDatePattern = {
    val __obj = js.Dynamic.literal(dst_offset = dst_offset.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], utc_offset = utc_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationDatePattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalizationDatePattern] (val x: Self) extends AnyVal {
    
    inline def setDst_offset(value: Double): Self = StObject.set(x, "dst_offset", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setUtc_offset(value: Double): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
  }
}
