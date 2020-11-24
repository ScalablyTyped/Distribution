package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionState extends js.Object {
  
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.native
  
  /**
    * Represents information about the version (or revision) of an action.
    */
  var currentRevision: js.UndefOr[ActionRevision] = js.native
  
  /**
    * A URL link for more information about the state of the action, such as a deployment group details page.
    */
  var entityUrl: js.UndefOr[Url] = js.native
  
  /**
    * Represents information about the run of an action.
    */
  var latestExecution: js.UndefOr[ActionExecution] = js.native
  
  /**
    * A URL link for more information about the revision, such as a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.native
}
object ActionState {
  
  @scala.inline
  def apply(): ActionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionState]
  }
  
  @scala.inline
  implicit class ActionStateOps[Self <: ActionState] (val x: Self) extends AnyVal {
    
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
    def setActionName(value: ActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    
    @scala.inline
    def setCurrentRevision(value: ActionRevision): Self = this.set("currentRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentRevision: Self = this.set("currentRevision", js.undefined)
    
    @scala.inline
    def setEntityUrl(value: Url): Self = this.set("entityUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityUrl: Self = this.set("entityUrl", js.undefined)
    
    @scala.inline
    def setLatestExecution(value: ActionExecution): Self = this.set("latestExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestExecution: Self = this.set("latestExecution", js.undefined)
    
    @scala.inline
    def setRevisionUrl(value: Url): Self = this.set("revisionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionUrl: Self = this.set("revisionUrl", js.undefined)
  }
}
