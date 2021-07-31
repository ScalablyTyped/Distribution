package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionState extends StObject {
  
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.undefined
  
  /**
    * Represents information about the version (or revision) of an action.
    */
  var currentRevision: js.UndefOr[ActionRevision] = js.undefined
  
  /**
    * A URL link for more information about the state of the action, such as a deployment group details page.
    */
  var entityUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * Represents information about the run of an action.
    */
  var latestExecution: js.UndefOr[ActionExecution] = js.undefined
  
  /**
    * A URL link for more information about the revision, such as a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.undefined
}
object ActionState {
  
  @scala.inline
  def apply(): ActionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionState]
  }
  
  @scala.inline
  implicit class ActionStateMutableBuilder[Self <: ActionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: ActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setCurrentRevision(value: ActionRevision): Self = StObject.set(x, "currentRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionUndefined: Self = StObject.set(x, "currentRevision", js.undefined)
    
    @scala.inline
    def setEntityUrl(value: Url): Self = StObject.set(x, "entityUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUrlUndefined: Self = StObject.set(x, "entityUrl", js.undefined)
    
    @scala.inline
    def setLatestExecution(value: ActionExecution): Self = StObject.set(x, "latestExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestExecutionUndefined: Self = StObject.set(x, "latestExecution", js.undefined)
    
    @scala.inline
    def setRevisionUrl(value: Url): Self = StObject.set(x, "revisionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUrlUndefined: Self = StObject.set(x, "revisionUrl", js.undefined)
  }
}
