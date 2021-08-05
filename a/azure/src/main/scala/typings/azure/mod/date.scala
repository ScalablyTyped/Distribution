package typings.azure.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object date {
  
  @JSImport("azure", "date")
  @js.native
  val ^ : js.Any = js.native
  
  inline def daysFromNow(days: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("daysFromNow")(days.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def hoursFromNow(hours: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("hoursFromNow")(hours.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def minutesFromNow(minutes: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("minutesFromNow")(minutes.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def secondsFromNow(seconds: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("secondsFromNow")(seconds.asInstanceOf[js.Any]).asInstanceOf[Date]
}
