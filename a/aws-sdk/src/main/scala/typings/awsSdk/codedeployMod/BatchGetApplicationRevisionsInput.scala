package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetApplicationRevisionsInput extends js.Object {
  
  /**
    * The name of an AWS CodeDeploy application about which to get revision information.
    */
  var applicationName: ApplicationName = js.native
  
  /**
    * An array of RevisionLocation objects that specify information to get about the application revisions, including type and location. The maximum number of RevisionLocation objects you can specify is 25.
    */
  var revisions: RevisionLocationList = js.native
}
object BatchGetApplicationRevisionsInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName, revisions: RevisionLocationList): BatchGetApplicationRevisionsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revisions = revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetApplicationRevisionsInput]
  }
  
  @scala.inline
  implicit class BatchGetApplicationRevisionsInputOps[Self <: BatchGetApplicationRevisionsInput] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionsVarargs(value: RevisionLocation*): Self = this.set("revisions", js.Array(value :_*))
    
    @scala.inline
    def setRevisions(value: RevisionLocationList): Self = this.set("revisions", value.asInstanceOf[js.Any])
  }
}
