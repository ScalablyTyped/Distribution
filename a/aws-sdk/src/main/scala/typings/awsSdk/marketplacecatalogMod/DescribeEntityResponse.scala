package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEntityResponse extends js.Object {
  
  /**
    * This stringified JSON object includes the details of the entity.
    */
  var Details: js.UndefOr[Json] = js.native
  
  /**
    * The ARN associated to the unique identifier for the change set referenced in this request.
    */
  var EntityArn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the entity, in the format of EntityId@RevisionId.
    */
  var EntityIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * The named type of the entity, in the format of EntityType@Version.
    */
  var EntityType: js.UndefOr[typings.awsSdk.marketplacecatalogMod.EntityType] = js.native
  
  /**
    * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.native
}
object DescribeEntityResponse {
  
  @scala.inline
  def apply(): DescribeEntityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityResponse]
  }
  
  @scala.inline
  implicit class DescribeEntityResponseOps[Self <: DescribeEntityResponse] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: Json): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setEntityArn(value: ARN): Self = this.set("EntityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityArn: Self = this.set("EntityArn", js.undefined)
    
    @scala.inline
    def setEntityIdentifier(value: Identifier): Self = this.set("EntityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityIdentifier: Self = this.set("EntityIdentifier", js.undefined)
    
    @scala.inline
    def setEntityType(value: EntityType): Self = this.set("EntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityType: Self = this.set("EntityType", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: StringValue): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
  }
}
