package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInstanceFilter extends StObject {
  
  /**
    * The name of the search filter field.
    */
  var name: js.UndefOr[SystemInstanceFilterName] = js.undefined
  
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search. 
    */
  var value: js.UndefOr[SystemInstanceFilterValues] = js.undefined
}
object SystemInstanceFilter {
  
  @scala.inline
  def apply(): SystemInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceFilter]
  }
  
  @scala.inline
  implicit class SystemInstanceFilterMutableBuilder[Self <: SystemInstanceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SystemInstanceFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: SystemInstanceFilterValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: SystemInstanceFilterValue*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
