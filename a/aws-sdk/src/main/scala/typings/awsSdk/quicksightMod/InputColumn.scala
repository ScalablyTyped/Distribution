package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputColumn extends StObject {
  
  /**
    * The name of this column in the underlying data source.
    */
  var Name: ColumnName = js.native
  
  /**
    * The data type of the column.
    */
  var Type: InputColumnDataType = js.native
}
object InputColumn {
  
  @scala.inline
  def apply(Name: ColumnName, Type: InputColumnDataType): InputColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputColumn]
  }
  
  @scala.inline
  implicit class InputColumnMutableBuilder[Self <: InputColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InputColumnDataType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
