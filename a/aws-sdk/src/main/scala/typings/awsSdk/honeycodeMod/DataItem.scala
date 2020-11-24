package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataItem extends js.Object {
  
  /**
    * The formatted value of the data. e.g. John Smith.
    */
  var formattedValue: js.UndefOr[FormattedValue] = js.native
  
  /**
    *  The overrideFormat is optional and is specified only if a particular row of data has a different format for the data than the default format defined on the screen or the table. 
    */
  var overrideFormat: js.UndefOr[Format] = js.native
  
  /**
    * The raw value of the data. e.g. jsmith@example.com
    */
  var rawValue: js.UndefOr[RawValue] = js.native
}
object DataItem {
  
  @scala.inline
  def apply(): DataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataItem]
  }
  
  @scala.inline
  implicit class DataItemOps[Self <: DataItem] (val x: Self) extends AnyVal {
    
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
    def setFormattedValue(value: FormattedValue): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedValue: Self = this.set("formattedValue", js.undefined)
    
    @scala.inline
    def setOverrideFormat(value: Format): Self = this.set("overrideFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideFormat: Self = this.set("overrideFormat", js.undefined)
    
    @scala.inline
    def setRawValue(value: RawValue): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawValue: Self = this.set("rawValue", js.undefined)
  }
}
