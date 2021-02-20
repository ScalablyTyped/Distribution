package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentRevision extends StObject {
  
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
  implicit class CurrentRevisionMutableBuilder[Self <: CurrentRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeIdentifier(value: RevisionChangeIdentifier): Self = StObject.set(x, "changeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Time): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setRevision(value: Revision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionSummary(value: RevisionSummary): Self = StObject.set(x, "revisionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionSummaryUndefined: Self = StObject.set(x, "revisionSummary", js.undefined)
  }
}
