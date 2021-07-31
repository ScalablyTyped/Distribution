package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestreamDimension extends StObject {
  
  /**
    * The metadata dimension name. This is the name of the column in the Amazon Timestream database table record. Dimensions cannot be named: measure_name, measure_value, or time. These names are reserved. Dimension names cannot start with ts_ or measure_value and they cannot contain the colon (:) character.
    */
  var name: TimestreamDimensionName
  
  /**
    * The value to write in this column of the database record.
    */
  var value: TimestreamDimensionValue
}
object TimestreamDimension {
  
  @scala.inline
  def apply(name: TimestreamDimensionName, value: TimestreamDimensionValue): TimestreamDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamDimension]
  }
  
  @scala.inline
  implicit class TimestreamDimensionMutableBuilder[Self <: TimestreamDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: TimestreamDimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TimestreamDimensionValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
