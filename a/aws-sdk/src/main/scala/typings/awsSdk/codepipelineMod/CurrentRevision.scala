package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentRevision extends StObject {
  
  /**
    * The change identifier for the current revision.
    */
  var changeIdentifier: RevisionChangeIdentifier
  
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The revision ID of the current version of an artifact.
    */
  var revision: Revision
  
  /**
    * The summary of the most recent revision of the artifact.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
}
object CurrentRevision {
  
  inline def apply(changeIdentifier: RevisionChangeIdentifier, revision: Revision): CurrentRevision = {
    val __obj = js.Dynamic.literal(changeIdentifier = changeIdentifier.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRevision]
  }
  
  extension [Self <: CurrentRevision](x: Self) {
    
    inline def setChangeIdentifier(value: RevisionChangeIdentifier): Self = StObject.set(x, "changeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setRevision(value: Revision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionSummary(value: RevisionSummary): Self = StObject.set(x, "revisionSummary", value.asInstanceOf[js.Any])
    
    inline def setRevisionSummaryUndefined: Self = StObject.set(x, "revisionSummary", js.undefined)
  }
}
