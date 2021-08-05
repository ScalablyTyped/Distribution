package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenXJsonSerDe extends StObject {
  
  /**
    * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
    */
  var CaseInsensitive: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to {"ts": "timestamp"} to map this key to a column named ts.
    */
  var ColumnToJsonKeyMappings: js.UndefOr[typings.awsSdk.firehoseMod.ColumnToJsonKeyMappings] = js.undefined
  
  /**
    * When set to true, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. The default is false.
    */
  var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.undefined
}
object OpenXJsonSerDe {
  
  inline def apply(): OpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenXJsonSerDe]
  }
  
  extension [Self <: OpenXJsonSerDe](x: Self) {
    
    inline def setCaseInsensitive(value: BooleanObject): Self = StObject.set(x, "CaseInsensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "CaseInsensitive", js.undefined)
    
    inline def setColumnToJsonKeyMappings(value: ColumnToJsonKeyMappings): Self = StObject.set(x, "ColumnToJsonKeyMappings", value.asInstanceOf[js.Any])
    
    inline def setColumnToJsonKeyMappingsUndefined: Self = StObject.set(x, "ColumnToJsonKeyMappings", js.undefined)
    
    inline def setConvertDotsInJsonKeysToUnderscores(value: BooleanObject): Self = StObject.set(x, "ConvertDotsInJsonKeysToUnderscores", value.asInstanceOf[js.Any])
    
    inline def setConvertDotsInJsonKeysToUnderscoresUndefined: Self = StObject.set(x, "ConvertDotsInJsonKeysToUnderscores", js.undefined)
  }
}
