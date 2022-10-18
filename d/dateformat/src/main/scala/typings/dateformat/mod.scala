package typings.dateformat

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dateformat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(mask: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mask.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(mask: String, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(mask: String, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(mask: Unit, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(mask: Unit, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTimezone(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTimezone")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatTimezone(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTimezone")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("dateformat", "i18n")
  @js.native
  def i18n: DateFormatI18n = js.native
  inline def i18n_=(x: DateFormatI18n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18n")(x.asInstanceOf[js.Any])
  
  @JSImport("dateformat", "masks")
  @js.native
  def masks: DateFormatMasks = js.native
  inline def masks_=(x: DateFormatMasks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("masks")(x.asInstanceOf[js.Any])
  
  trait DateFormatI18n extends StObject {
    
    var dayNames: js.Array[String]
    
    var monthNames: js.Array[String]
    
    var timeNames: js.Array[String]
  }
  object DateFormatI18n {
    
    inline def apply(dayNames: js.Array[String], monthNames: js.Array[String], timeNames: js.Array[String]): DateFormatI18n = {
      val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], timeNames = timeNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateFormatI18n]
    }
    
    extension [Self <: DateFormatI18n](x: Self) {
      
      inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value*))
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
      
      inline def setTimeNames(value: js.Array[String]): Self = StObject.set(x, "timeNames", value.asInstanceOf[js.Any])
      
      inline def setTimeNamesVarargs(value: String*): Self = StObject.set(x, "timeNames", js.Array(value*))
    }
  }
  
  trait DateFormatMasks
    extends StObject
       with /* key */ StringDictionary[String] {
    
    /**
      * @default "ddd mmm dd yyyy HH:MM:ss"
      */
    var default: String
    
    /**
      * @default "ddd, dd mmm yyyy HH:MM:ss Z"
      */
    var expiresHeaderFormat: String
    
    /**
      * @default "dddd, mmmm d, yyyy"
      */
    var fullDate: String
    
    /**
      * @default "yyyy-mm-dd"
      */
    var isoDate: String
    
    /**
      * @default "yyyy-mm-dd'T'HH:MM:sso"
      */
    var isoDateTime: String
    
    /**
      * @default "HH:MM:ss"
      */
    var isoTime: String
    
    /**
      * @default "UTC:yyyy-mm-dd'T'HH:MM:ss'Z'"
      */
    var isoUtcDateTime: String
    
    /**
      * @default "mmmm d, yyyy"
      */
    var longDate: String
    
    /**
      * @default "h:MM:ss TT Z"
      */
    var longTime: String
    
    /**
      * @default "mmm d, yyyy"
      */
    var mediumDate: String
    
    /**
      * @default "h:MM:ss TT"
      */
    var mediumTime: String
    
    /**
      * @default "mm/dd/yyyy"
      */
    var paddedShortDate: String
    
    /**
      * @default "m/d/yy"
      */
    var shortDate: String
    
    /**
      * @default "h:MM TT"
      */
    var shortTime: String
  }
  object DateFormatMasks {
    
    inline def apply(
      default: String,
      expiresHeaderFormat: String,
      fullDate: String,
      isoDate: String,
      isoDateTime: String,
      isoTime: String,
      isoUtcDateTime: String,
      longDate: String,
      longTime: String,
      mediumDate: String,
      mediumTime: String,
      paddedShortDate: String,
      shortDate: String,
      shortTime: String
    ): DateFormatMasks = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], expiresHeaderFormat = expiresHeaderFormat.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], isoDate = isoDate.asInstanceOf[js.Any], isoDateTime = isoDateTime.asInstanceOf[js.Any], isoTime = isoTime.asInstanceOf[js.Any], isoUtcDateTime = isoUtcDateTime.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], paddedShortDate = paddedShortDate.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateFormatMasks]
    }
    
    extension [Self <: DateFormatMasks](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setExpiresHeaderFormat(value: String): Self = StObject.set(x, "expiresHeaderFormat", value.asInstanceOf[js.Any])
      
      inline def setFullDate(value: String): Self = StObject.set(x, "fullDate", value.asInstanceOf[js.Any])
      
      inline def setIsoDate(value: String): Self = StObject.set(x, "isoDate", value.asInstanceOf[js.Any])
      
      inline def setIsoDateTime(value: String): Self = StObject.set(x, "isoDateTime", value.asInstanceOf[js.Any])
      
      inline def setIsoTime(value: String): Self = StObject.set(x, "isoTime", value.asInstanceOf[js.Any])
      
      inline def setIsoUtcDateTime(value: String): Self = StObject.set(x, "isoUtcDateTime", value.asInstanceOf[js.Any])
      
      inline def setLongDate(value: String): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
      
      inline def setLongTime(value: String): Self = StObject.set(x, "longTime", value.asInstanceOf[js.Any])
      
      inline def setMediumDate(value: String): Self = StObject.set(x, "mediumDate", value.asInstanceOf[js.Any])
      
      inline def setMediumTime(value: String): Self = StObject.set(x, "mediumTime", value.asInstanceOf[js.Any])
      
      inline def setPaddedShortDate(value: String): Self = StObject.set(x, "paddedShortDate", value.asInstanceOf[js.Any])
      
      inline def setShortDate(value: String): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
      
      inline def setShortTime(value: String): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
    }
  }
}
