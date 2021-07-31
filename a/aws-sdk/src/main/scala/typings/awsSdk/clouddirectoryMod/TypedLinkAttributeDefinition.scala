package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedLinkAttributeDefinition extends StObject {
  
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined
  
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.undefined
  
  /**
    * The unique name of the typed link attribute.
    */
  var Name: AttributeName
  
  /**
    * The required behavior of the TypedLinkAttributeDefinition.
    */
  var RequiredBehavior: RequiredAttributeBehavior
  
  /**
    * Validation rules that are attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.undefined
  
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType
}
object TypedLinkAttributeDefinition {
  
  @scala.inline
  def apply(Name: AttributeName, RequiredBehavior: RequiredAttributeBehavior, Type: FacetAttributeType): TypedLinkAttributeDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequiredBehavior = RequiredBehavior.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeDefinition]
  }
  
  @scala.inline
  implicit class TypedLinkAttributeDefinitionMutableBuilder[Self <: TypedLinkAttributeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: TypedAttributeValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setIsImmutable(value: Bool): Self = StObject.set(x, "IsImmutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImmutableUndefined: Self = StObject.set(x, "IsImmutable", js.undefined)
    
    @scala.inline
    def setName(value: AttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredBehavior(value: RequiredAttributeBehavior): Self = StObject.set(x, "RequiredBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: RuleMap): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setType(value: FacetAttributeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
