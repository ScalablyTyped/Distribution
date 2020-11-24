package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationExecutionFilter extends js.Object {
  
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
  implicit class AssociationExecutionFilterOps[Self <: AssociationExecutionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: AssociationExecutionFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AssociationFilterOperatorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AssociationExecutionFilterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
