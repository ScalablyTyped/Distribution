package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentRevision extends js.Object {
  
  /**
    * The change identifier for the current revision.
    */
  var changeIdentifier: RevisionChangeIdentifier = js.native
  
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[Time] = js.native
  
  /**
    * The revision ID of the current version of an artifact.
    */
  var revision: Revision = js.native
  
  /**
    * The summary of the most recent revision of the artifact.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.native
}
object CurrentRevision {
  
  @scala.inline
  def apply(changeIdentifier: RevisionChangeIdentifier, revision: Revision): CurrentRevision = {
    val __obj = js.Dynamic.literal(changeIdentifier = changeIdentifier.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRevision]
  }
  
  @scala.inline
  implicit class CurrentRevisionOps[Self <: CurrentRevision] (val x: Self) extends AnyVal {
    
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
    def setChangeIdentifier(value: RevisionChangeIdentifier): Self = this.set("changeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Revision): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Time): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setRevisionSummary(value: RevisionSummary): Self = this.set("revisionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionSummary: Self = this.set("revisionSummary", js.undefined)
  }
}
