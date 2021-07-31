package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationFilter extends StObject {
  
  /**
    * The name of the filter.   InstanceId has been deprecated. 
    */
  var key: AssociationFilterKey
  
  /**
    * The filter value.
    */
  var value: AssociationFilterValue
}
object AssociationFilter {
  
  @scala.inline
  def apply(key: AssociationFilterKey, value: AssociationFilterValue): AssociationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationFilter]
  }
  
  @scala.inline
  implicit class AssociationFilterMutableBuilder[Self <: AssociationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: AssociationFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AssociationFilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
