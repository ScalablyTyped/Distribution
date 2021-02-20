package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationExecutionTargetsFilter extends StObject {
  
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionTargetsFilterKey = js.native
  
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionTargetsFilterValue = js.native
}
object AssociationExecutionTargetsFilter {
  
  @scala.inline
  def apply(Key: AssociationExecutionTargetsFilterKey, Value: AssociationExecutionTargetsFilterValue): AssociationExecutionTargetsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecutionTargetsFilter]
  }
  
  @scala.inline
  implicit class AssociationExecutionTargetsFilterMutableBuilder[Self <: AssociationExecutionTargetsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: AssociationExecutionTargetsFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AssociationExecutionTargetsFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
