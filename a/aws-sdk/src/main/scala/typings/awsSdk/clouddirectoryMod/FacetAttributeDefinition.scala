package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetAttributeDefinition extends js.Object {
  
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.native
  
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.native
  
  /**
    * Validation rules attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.native
  
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType = js.native
}
object FacetAttributeDefinition {
  
  @scala.inline
  def apply(Type: FacetAttributeType): FacetAttributeDefinition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttributeDefinition]
  }
  
  @scala.inline
  implicit class FacetAttributeDefinitionOps[Self <: FacetAttributeDefinition] (val x: Self) extends AnyVal {
    
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
    def setType(value: FacetAttributeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: TypedAttributeValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    
    @scala.inline
    def setIsImmutable(value: Bool): Self = this.set("IsImmutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsImmutable: Self = this.set("IsImmutable", js.undefined)
    
    @scala.inline
    def setRules(value: RuleMap): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
}
