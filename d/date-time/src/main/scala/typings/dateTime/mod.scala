package typings.dateTime

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Pretty datetime: `2014-01-09 06:46:01`.
  	@example
  	```
  	import dateTime = require('date-time');
  	dateTime();
  	//=> '2017-05-20 17:07:05'
  	dateTime({date: new Date(1989, 2, 4, 10)});
  	//=> '1989-03-04 09:00:00'
  	dateTime({showTimeZone: true});
  	//=> '2017-05-20 17:07:05 UTC+7'
  	dateTime({local: false});
  	//=> '2017-05-20 10:07:05'
  	dateTime({local: false, showTimeZone: true});
  	//=> '2017-05-20 10:07:05 UTC'
  	dateTime({showMilliseconds: true});
  	//=> '2017-05-20 17:07:05 6ms'
  	```
  	*/
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("date-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function dateTime(options?: dateTime.Options): string;
  // export = dateTime;
  @JSImport("date-time", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dateTime */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dateTime */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		Custom date.
    		@default new Date()
    		*/
    var date: js.UndefOr[Date] = js.undefined
    
    /**
    		Show the date in the local time zone.
    		@default false
    		*/
    var local: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Show the milliseconds in the date if any.
    		@default false
    		*/
    var showMilliseconds: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Show the UTC time zone postfix.
    		@default false
    		*/
    var showTimeZone: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
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
