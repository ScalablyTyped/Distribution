package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationExecutionTargetsFilter extends js.Object {
  
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
  implicit class AssociationExecutionTargetsFilterOps[Self <: AssociationExecutionTargetsFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: AssociationExecutionTargetsFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AssociationExecutionTargetsFilterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
