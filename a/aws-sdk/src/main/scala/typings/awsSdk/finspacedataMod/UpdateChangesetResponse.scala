package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChangesetResponse extends StObject {
  
  /**
    * The unique identifier for the Changeset to update.
    */
  var changesetId: js.UndefOr[ChangesetId] = js.undefined
  
  /**
    * The unique identifier for the FinSpace Dataset in which the Changeset is created.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
}
object UpdateChangesetResponse {
  
  inline def apply(): UpdateChangesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChangesetResponse]
  }
  
  extension [Self <: UpdateChangesetResponse](x: Self) {
    
    inline def setChangesetId(value: ChangesetId): Self = StObject.set(x, "changesetId", value.asInstanceOf[js.Any])
    
    inline def setChangesetIdUndefined: Self = StObject.set(x, "changesetId", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
