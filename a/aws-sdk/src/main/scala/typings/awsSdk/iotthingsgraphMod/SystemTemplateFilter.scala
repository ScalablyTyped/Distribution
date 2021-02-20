package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemTemplateFilter extends StObject {
  
  /**
    * The name of the system search filter field.
    */
  var name: SystemTemplateFilterName = js.native
  
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: SystemTemplateFilterValues = js.native
}
object SystemTemplateFilter {
  
  @scala.inline
  def apply(name: SystemTemplateFilterName, value: SystemTemplateFilterValues): SystemTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTemplateFilter]
  }
  
  @scala.inline
  implicit class SystemTemplateFilterMutableBuilder[Self <: SystemTemplateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SystemTemplateFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SystemTemplateFilterValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: SystemTemplateFilterValue*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
