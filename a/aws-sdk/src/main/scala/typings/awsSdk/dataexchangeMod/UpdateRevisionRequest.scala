package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRevisionRequest extends StObject {
  
  /**
    * An optional comment about the revision.
    */
  var Comment: js.UndefOr[stringMin0Max16384] = js.undefined
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string
  
  /**
    * Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this read-only state, you can publish the revision to your products.
    */
  var Finalized: js.UndefOr[boolean] = js.undefined
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string
}
object UpdateRevisionRequest {
  
  @scala.inline
  def apply(DataSetId: string, RevisionId: string): UpdateRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRevisionRequest]
  }
  
  @scala.inline
  implicit class UpdateRevisionRequestMutableBuilder[Self <: UpdateRevisionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: stringMin0Max16384): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalized(value: boolean): Self = StObject.set(x, "Finalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizedUndefined: Self = StObject.set(x, "Finalized", js.undefined)
    
    @scala.inline
    def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
