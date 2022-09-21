package typings.dateTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Custom date.
    	@default new Date()
    	*/
    val date: js.UndefOr[js.Date] = js.undefined
    
    /**
    	Show the date in the local time zone.
    	@default false
    	*/
    val local: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Show the milliseconds in the date if any.
    	@default false
    	*/
    val showMilliseconds: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Show the UTC time zone postfix.
    	@default false
    	*/
    val showTimeZone: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setShowMilliseconds(value: Boolean): Self = StObject.set(x, "showMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setShowMillisecondsUndefined: Self = StObject.set(x, "showMilliseconds", js.undefined)
      
      inline def setShowTimeZone(value: Boolean): Self = StObject.set(x, "showTimeZone", value.asInstanceOf[js.Any])
      
      inline def setShowTimeZoneUndefined: Self = StObject.set(x, "showTimeZone", js.undefined)
    }
  }
}
