package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenXJsonSerDe extends js.Object {
  
  /**
    * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
    */
  var CaseInsensitive: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to {"ts": "timestamp"} to map this key to a column named ts.
    */
  var ColumnToJsonKeyMappings: js.UndefOr[typings.awsSdk.firehoseMod.ColumnToJsonKeyMappings] = js.native
  
  /**
    * When set to true, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. The default is false.
    */
  var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.native
}
object OpenXJsonSerDe {
  
  @scala.inline
  def apply(): OpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenXJsonSerDe]
  }
  
  @scala.inline
  implicit class OpenXJsonSerDeOps[Self <: OpenXJsonSerDe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaseInsensitive(value: BooleanObject): Self = this.set("CaseInsensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseInsensitive: Self = this.set("CaseInsensitive", js.undefined)
    
    @scala.inline
    def setColumnToJsonKeyMappings(value: ColumnToJsonKeyMappings): Self = this.set("ColumnToJsonKeyMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnToJsonKeyMappings: Self = this.set("ColumnToJsonKeyMappings", js.undefined)
    
    @scala.inline
    def setConvertDotsInJsonKeysToUnderscores(value: BooleanObject): Self = this.set("ConvertDotsInJsonKeysToUnderscores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertDotsInJsonKeysToUnderscores: Self = this.set("ConvertDotsInJsonKeysToUnderscores", js.undefined)
  }
}
