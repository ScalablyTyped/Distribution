package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputColumn extends StObject {
  
  /**
    * A description for a column.
    */
  var Description: js.UndefOr[ColumnDescriptiveText] = js.native
  
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ColumnName] = js.native
  
  /**
    * Type.
    */
  var Type: js.UndefOr[ColumnDataType] = js.native
}
object OutputColumn {
  
  @scala.inline
  def apply(): OutputColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputColumn]
  }
  
  @scala.inline
  implicit class OutputColumnMutableBuilder[Self <: OutputColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ColumnDescriptiveText): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: ColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setType(value: ColumnDataType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
