package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationExecutionFilter extends StObject {
  
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionFilterKey = js.native
  
  /**
    * The filter type specified in the request.
    */
  var Type: AssociationFilterOperatorType = js.native
  
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionFilterValue = js.native
}
object AssociationExecutionFilter {
  
  @scala.inline
  def apply(
    Key: AssociationExecutionFilterKey,
    Type: AssociationFilterOperatorType,
    Value: AssociationExecutionFilterValue
  ): AssociationExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecutionFilter]
  }
  
  @scala.inline
  implicit class AssociationExecutionFilterMutableBuilder[Self <: AssociationExecutionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: AssociationExecutionFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AssociationFilterOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AssociationExecutionFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
