package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRevisionResponse extends StObject {
  
  /**
    * The ARN for the revision.
    */
  var Arn: js.UndefOr[typings.awsSdk.dataexchangeMod.Arn] = js.undefined
  
  /**
    * An optional comment about the revision.
    */
  var Comment: js.UndefOr[stringMin0Max16384] = js.undefined
  
  /**
    * The date and time that the revision was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The unique identifier for the data set associated with this revision.
    */
  var DataSetId: js.UndefOr[Id] = js.undefined
  
  /**
    * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision tells AWS Data Exchange that changes to the assets in the revision are complete. After it's in this read-only state, you can publish the revision to your products. Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely identified by their ARN.
    */
  var Finalized: js.UndefOr[boolean] = js.undefined
  
  /**
    * The unique identifier for the revision.
    */
  var Id: js.UndefOr[typings.awsSdk.dataexchangeMod.Id] = js.undefined
  
  /**
    * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is returned when a revision owner is viewing the entitled copy of its owned revision.
    */
  var SourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The date and time that the revision was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
}
object UpdateRevisionResponse {
  
  @scala.inline
  def apply(): UpdateRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRevisionResponse]
  }
  
  @scala.inline
  implicit class UpdateRevisionResponseMutableBuilder[Self <: UpdateRevisionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setComment(value: stringMin0Max16384): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    @scala.inline
    def setFinalized(value: boolean): Self = StObject.set(x, "Finalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizedUndefined: Self = StObject.set(x, "Finalized", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
