package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestreamDimension extends js.Object {
  
  /**
    * The metadata dimension name. This is the name of the column in the Amazon Timestream database table record. Dimensions cannot be named: measure_name, measure_value, or time. These names are reserved. Dimension names cannot start with ts_ or measure_value and they cannot contain the colon (:) character.
    */
  var name: TimestreamDimensionName = js.native
  
  /**
    * The value to write in this column of the database record.
    */
  var value: TimestreamDimensionValue = js.native
}
object TimestreamDimension {
  
  @scala.inline
  def apply(name: TimestreamDimensionName, value: TimestreamDimensionValue): TimestreamDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamDimension]
  }
  
  @scala.inline
  implicit class TimestreamDimensionOps[Self <: TimestreamDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: TimestreamDimensionName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TimestreamDimensionValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
