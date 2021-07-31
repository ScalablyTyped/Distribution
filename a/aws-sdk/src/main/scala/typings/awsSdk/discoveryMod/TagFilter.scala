package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    * A name of the tag filter.
    */
  var name: FilterName
  
  /**
    * Values for the tag filter.
    */
  var values: FilterValues
}
object TagFilter {
  
  @scala.inline
  def apply(name: FilterName, values: FilterValues): TagFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilter]
  }
  
  @scala.inline
  implicit class TagFilterMutableBuilder[Self <: TagFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
