package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntityResponse extends StObject {
  
  /**
    * This stringified JSON object includes the details of the entity.
    */
  var Details: js.UndefOr[Json] = js.undefined
  
  /**
    * The ARN associated to the unique identifier for the change set referenced in this request.
    */
  var EntityArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the entity, in the format of EntityId@RevisionId.
    */
  var EntityIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The named type of the entity, in the format of EntityType@Version.
    */
  var EntityType: js.UndefOr[typings.awsSdk.marketplacecatalogMod.EntityType] = js.undefined
  
  /**
    * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.undefined
}
object DescribeEntityResponse {
  
  @scala.inline
  def apply(): DescribeEntityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityResponse]
  }
  
  @scala.inline
  implicit class DescribeEntityResponseMutableBuilder[Self <: DescribeEntityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Json): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setEntityArn(value: ARN): Self = StObject.set(x, "EntityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityArnUndefined: Self = StObject.set(x, "EntityArn", js.undefined)
    
    @scala.inline
    def setEntityIdentifier(value: Identifier): Self = StObject.set(x, "EntityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdentifierUndefined: Self = StObject.set(x, "EntityIdentifier", js.undefined)
    
    @scala.inline
    def setEntityType(value: EntityType): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "EntityType", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: StringValue): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
  }
}
