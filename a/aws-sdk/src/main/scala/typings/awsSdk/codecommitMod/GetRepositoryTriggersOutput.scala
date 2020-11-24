package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryTriggersOutput extends js.Object {
  
  /**
    * The system-generated unique ID for the trigger.
    */
  var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.native
  
  /**
    * The JSON block of configuration information for each trigger.
    */
  var triggers: js.UndefOr[RepositoryTriggersList] = js.native
}
object GetRepositoryTriggersOutput {
  
  @scala.inline
  def apply(): GetRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryTriggersOutput]
  }
  
  @scala.inline
  implicit class GetRepositoryTriggersOutputOps[Self <: GetRepositoryTriggersOutput] (val x: Self) extends AnyVal {
    
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
    def setConfigurationId(value: RepositoryTriggersConfigurationId): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationId: Self = this.set("configurationId", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: RepositoryTrigger*): Self = this.set("triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: RepositoryTriggersList): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
  }
}
