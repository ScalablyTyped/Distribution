package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChangesetResponse extends StObject {
  
  /**
    * The unique identifier of the Changeset that is created.
    */
  var changesetId: js.UndefOr[ChangesetId] = js.undefined
  
  /**
    * The unique identifier for the FinSpace Dataset where the Changeset is created.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
}
object CreateChangesetResponse {
  
  inline def apply(): CreateChangesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChangesetResponse]
  }
  
  extension [Self <: CreateChangesetResponse](x: Self) {
    
    inline def setChangesetId(value: ChangesetId): Self = StObject.set(x, "changesetId", value.asInstanceOf[js.Any])
    
    inline def setChangesetIdUndefined: Self = StObject.set(x, "changesetId", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
