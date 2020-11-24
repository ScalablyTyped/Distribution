package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetAttribute extends js.Object {
  
  /**
    * A facet attribute consists of either a definition or a reference. This structure contains the attribute definition. See Attribute References for more information.
    */
  var AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.native
  
  /**
    * An attribute reference that is associated with the attribute. See Attribute References for more information.
    */
  var AttributeReference: js.UndefOr[FacetAttributeReference] = js.native
  
  /**
    * The name of the facet attribute.
    */
  var Name: AttributeName = js.native
  
  /**
    * The required behavior of the FacetAttribute.
    */
  var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.native
}
object FacetAttribute {
  
  @scala.inline
  def apply(Name: AttributeName): FacetAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttribute]
  }
  
  @scala.inline
  implicit class FacetAttributeOps[Self <: FacetAttribute] (val x: Self) extends AnyVal {
    
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
    def setName(value: AttributeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeDefinition(value: FacetAttributeDefinition): Self = this.set("AttributeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeDefinition: Self = this.set("AttributeDefinition", js.undefined)
    
    @scala.inline
    def setAttributeReference(value: FacetAttributeReference): Self = this.set("AttributeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeReference: Self = this.set("AttributeReference", js.undefined)
    
    @scala.inline
    def setRequiredBehavior(value: RequiredAttributeBehavior): Self = this.set("RequiredBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredBehavior: Self = this.set("RequiredBehavior", js.undefined)
  }
}
