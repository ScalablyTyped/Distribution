package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInformationFilter extends StObject {
  
  /**
    * The name of the filter. 
    */
  var key: InstanceInformationFilterKey
  
  /**
    * The filter values.
    */
  var valueSet: InstanceInformationFilterValueSet
}
object InstanceInformationFilter {
  
  @scala.inline
  def apply(key: InstanceInformationFilterKey, valueSet: InstanceInformationFilterValueSet): InstanceInformationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationFilter]
  }
  
  @scala.inline
  implicit class InstanceInformationFilterMutableBuilder[Self <: InstanceInformationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: InstanceInformationFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSet(value: InstanceInformationFilterValueSet): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetVarargs(value: InstanceInformationFilterValue*): Self = StObject.set(x, "valueSet", js.Array(value :_*))
  }
}
