package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationExecutionFilter extends StObject {
  
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionFilterKey
  
  /**
    * The filter type specified in the request.
    */
  var Type: AssociationFilterOperatorType
  
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionFilterValue
}
object AssociationExecutionFilter {
  
  inline def apply(
    Key: AssociationExecutionFilterKey,
    Type: AssociationFilterOperatorType,
    Value: AssociationExecutionFilterValue
  ): AssociationExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecutionFilter]
  }
  
  extension [Self <: AssociationExecutionFilter](x: Self) {
    
    inline def setKey(value: AssociationExecutionFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssociationFilterOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AssociationExecutionFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
