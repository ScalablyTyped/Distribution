package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFindingsRequest extends StObject {
  
  /**
    * A collection of attributes that specify which findings you want to update.
    */
  var Filters: AwsSecurityFindingFilters
  
  /**
    * The updated note for the finding.
    */
  var Note: js.UndefOr[NoteUpdate] = js.undefined
  
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[typings.awsSdk.securityhubMod.RecordState] = js.undefined
}
object UpdateFindingsRequest {
  
  inline def apply(Filters: AwsSecurityFindingFilters): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
  
  extension [Self <: UpdateFindingsRequest](x: Self) {
    
    inline def setFilters(value: AwsSecurityFindingFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setNote(value: NoteUpdate): Self = StObject.set(x, "Note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "Note", js.undefined)
    
    inline def setRecordState(value: RecordState): Self = StObject.set(x, "RecordState", value.asInstanceOf[js.Any])
    
    inline def setRecordStateUndefined: Self = StObject.set(x, "RecordState", js.undefined)
  }
}
