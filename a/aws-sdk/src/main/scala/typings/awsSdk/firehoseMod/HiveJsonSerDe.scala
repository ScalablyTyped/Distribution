package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HiveJsonSerDe extends StObject {
  
  /**
    * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format strings. For more information, see Class DateTimeFormat. You can also use the special value millis to parse timestamps in epoch milliseconds. If you don't specify a format, Kinesis Data Firehose uses java.sql.Timestamp::valueOf by default.
    */
  var TimestampFormats: js.UndefOr[ListOfNonEmptyStrings] = js.undefined
}
object HiveJsonSerDe {
  
  inline def apply(): HiveJsonSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiveJsonSerDe]
  }
  
  extension [Self <: HiveJsonSerDe](x: Self) {
    
    inline def setTimestampFormats(value: ListOfNonEmptyStrings): Self = StObject.set(x, "TimestampFormats", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatsUndefined: Self = StObject.set(x, "TimestampFormats", js.undefined)
    
    inline def setTimestampFormatsVarargs(value: NonEmptyString*): Self = StObject.set(x, "TimestampFormats", js.Array(value :_*))
  }
}
