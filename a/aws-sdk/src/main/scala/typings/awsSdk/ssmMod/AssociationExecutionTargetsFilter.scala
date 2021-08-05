package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationExecutionTargetsFilter extends StObject {
  
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionTargetsFilterKey
  
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionTargetsFilterValue
}
object AssociationExecutionTargetsFilter {
  
  inline def apply(Key: AssociationExecutionTargetsFilterKey, Value: AssociationExecutionTargetsFilterValue): AssociationExecutionTargetsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecutionTargetsFilter]
  }
  
  extension [Self <: AssociationExecutionTargetsFilter](x: Self) {
    
    inline def setKey(value: AssociationExecutionTargetsFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AssociationExecutionTargetsFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
