package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxProperties extends StObject {
  
  var selectedRow: js.UndefOr[Double] = js.undefined
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object ListBoxProperties {
  
  @scala.inline
  def apply(): ListBoxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxProperties]
  }
  
  @scala.inline
  implicit class ListBoxPropertiesMutableBuilder[Self <: ListBoxProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
