package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTriggersResponse extends js.Object {
  
  /**
    * A continuation token, if not all the requested triggers have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * A list of triggers for the specified job.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
}
object GetTriggersResponse {
  
  @scala.inline
  def apply(): GetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggersResponse]
  }
  
  @scala.inline
  implicit class GetTriggersResponseOps[Self <: GetTriggersResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: Trigger*): Self = this.set("Triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: TriggerList): Self = this.set("Triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("Triggers", js.undefined)
  }
}
