package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimension extends js.Object {
  
  /**
    * The data type of the dimension for the time series data point.
    */
  var DimensionValueType: js.UndefOr[typings.awsSdk.timestreamwriteMod.DimensionValueType] = js.native
  
  /**
    *  Dimension represents the meta data attributes of the time series. For example, the name and availability zone of an EC2 instance or the name of the manufacturer of a wind turbine are dimensions. Dimension names can only contain alphanumeric characters and underscores. Dimension names cannot end with an underscore. 
    */
  var Name: StringValue256 = js.native
  
  /**
    * The value of the dimension.
    */
  var Value: StringValue2048 = js.native
}
object Dimension {
  
  @scala.inline
  def apply(Name: StringValue256, Value: StringValue2048): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionOps[Self <: Dimension] (val x: Self) extends AnyVal {
    
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
    def setName(value: StringValue256): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StringValue2048): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionValueType(value: DimensionValueType): Self = this.set("DimensionValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValueType: Self = this.set("DimensionValueType", js.undefined)
  }
}
