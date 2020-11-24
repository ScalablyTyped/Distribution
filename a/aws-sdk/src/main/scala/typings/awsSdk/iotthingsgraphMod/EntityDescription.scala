package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityDescription extends js.Object {
  
  /**
    * The entity ARN.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time at which the entity was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The definition document of the entity.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  
  /**
    * The entity ID.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[EntityType] = js.native
}
object EntityDescription {
  
  @scala.inline
  def apply(): EntityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityDescription]
  }
  
  @scala.inline
  implicit class EntityDescriptionOps[Self <: EntityDescription] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setType(value: EntityType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
