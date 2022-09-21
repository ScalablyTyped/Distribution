package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeOptions extends StObject {
  
  /**
    * Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should use only supported datetime specifiers and separation characters, all literal a-z or A-Z characters should be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
    */
  var Format: DatetimeFormat
  
  /**
    * Optional value for a non-US locale code, needed for correct interpretation of some date formats.
    */
  var LocaleCode: js.UndefOr[typings.awsSdk.databrewMod.LocaleCode] = js.undefined
  
  /**
    * Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be used if Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
    */
  var TimezoneOffset: js.UndefOr[typings.awsSdk.databrewMod.TimezoneOffset] = js.undefined
}
object DatetimeOptions {
  
  inline def apply(Format: DatetimeFormat): DatetimeOptions = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeOptions]
  }
  
  extension [Self <: DatetimeOptions](x: Self) {
    
    inline def setFormat(value: DatetimeFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setLocaleCode(value: LocaleCode): Self = StObject.set(x, "LocaleCode", value.asInstanceOf[js.Any])
    
    inline def setLocaleCodeUndefined: Self = StObject.set(x, "LocaleCode", js.undefined)
    
    inline def setTimezoneOffset(value: TimezoneOffset): Self = StObject.set(x, "TimezoneOffset", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetUndefined: Self = StObject.set(x, "TimezoneOffset", js.undefined)
  }
}
