package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFacetRequest extends js.Object {
  
  /**
    * List of attributes that need to be updated in a given schema Facet. Each attribute is followed by AttributeAction, which specifies the type of update operation to perform. 
    */
  var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.native
  
  /**
    * The name of the facet.
    */
  var Name: FacetName = js.native
  
  /**
    * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
    */
  var ObjectType: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}
object UpdateFacetRequest {
  
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): UpdateFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFacetRequest]
  }
  
  @scala.inline
  implicit class UpdateFacetRequestOps[Self <: UpdateFacetRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: FacetName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUpdatesVarargs(value: FacetAttributeUpdate*): Self = this.set("AttributeUpdates", js.Array(value :_*))
    
    @scala.inline
    def setAttributeUpdates(value: FacetAttributeUpdateList): Self = this.set("AttributeUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeUpdates: Self = this.set("AttributeUpdates", js.undefined)
    
    @scala.inline
    def setObjectType(value: ObjectType): Self = this.set("ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("ObjectType", js.undefined)
  }
}
