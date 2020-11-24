package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetTriggersRequest extends js.Object {
  
  /**
    * A list of trigger names, which may be the names returned from the ListTriggers operation.
    */
  var TriggerNames: TriggerNameList = js.native
}
object BatchGetTriggersRequest {
  
  @scala.inline
  def apply(TriggerNames: TriggerNameList): BatchGetTriggersRequest = {
    val __obj = js.Dynamic.literal(TriggerNames = TriggerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTriggersRequest]
  }
  
  @scala.inline
  implicit class BatchGetTriggersRequestOps[Self <: BatchGetTriggersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTriggerNamesVarargs(value: NameString*): Self = this.set("TriggerNames", js.Array(value :_*))
    
    @scala.inline
    def setTriggerNames(value: TriggerNameList): Self = this.set("TriggerNames", value.asInstanceOf[js.Any])
  }
}
