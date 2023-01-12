package typings.azureCoreHttp.typesLatestSrcSerializerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMapper
  extends StObject
     with Mapper {
  
  /**
    * Constraints to test the current value against
    */
  var constraints: js.UndefOr[MapperConstraints] = js.undefined
  
  /**
    * Default value when one is not explicitly provided
    */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Whether or not the current property is a constant
    */
  var isConstant: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the current property allows mull as a value
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the current property is readonly
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the current property is required
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name to use when serializing
    */
  var serializedName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the mapper
    */
  var `type`: MapperType
  
  /**
    * Name for the xml elements when serializing an array
    */
  var xmlElementName: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the current property should be serialized as an attribute of the parent xml element
    */
  var xmlIsAttribute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the current property should have a wrapping XML element
    */
  var xmlIsWrapped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name for the xml element
    */
  var xmlName: js.UndefOr[String] = js.undefined
  
  /**
    * Xml element namespace
    */
  var xmlNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * Xml element namespace prefix
    */
  var xmlNamespacePrefix: js.UndefOr[String] = js.undefined
}
object BaseMapper {
  
  inline def apply(`type`: MapperType): BaseMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseMapper] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: MapperConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setIsConstant(value: Boolean): Self = StObject.set(x, "isConstant", value.asInstanceOf[js.Any])
    
    inline def setIsConstantUndefined: Self = StObject.set(x, "isConstant", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSerializedName(value: String): Self = StObject.set(x, "serializedName", value.asInstanceOf[js.Any])
    
    inline def setSerializedNameUndefined: Self = StObject.set(x, "serializedName", js.undefined)
    
    inline def setType(value: MapperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXmlElementName(value: String): Self = StObject.set(x, "xmlElementName", value.asInstanceOf[js.Any])
    
    inline def setXmlElementNameUndefined: Self = StObject.set(x, "xmlElementName", js.undefined)
    
    inline def setXmlIsAttribute(value: Boolean): Self = StObject.set(x, "xmlIsAttribute", value.asInstanceOf[js.Any])
    
    inline def setXmlIsAttributeUndefined: Self = StObject.set(x, "xmlIsAttribute", js.undefined)
    
    inline def setXmlIsWrapped(value: Boolean): Self = StObject.set(x, "xmlIsWrapped", value.asInstanceOf[js.Any])
    
    inline def setXmlIsWrappedUndefined: Self = StObject.set(x, "xmlIsWrapped", js.undefined)
    
    inline def setXmlName(value: String): Self = StObject.set(x, "xmlName", value.asInstanceOf[js.Any])
    
    inline def setXmlNameUndefined: Self = StObject.set(x, "xmlName", js.undefined)
    
    inline def setXmlNamespace(value: String): Self = StObject.set(x, "xmlNamespace", value.asInstanceOf[js.Any])
    
    inline def setXmlNamespacePrefix(value: String): Self = StObject.set(x, "xmlNamespacePrefix", value.asInstanceOf[js.Any])
    
    inline def setXmlNamespacePrefixUndefined: Self = StObject.set(x, "xmlNamespacePrefix", js.undefined)
    
    inline def setXmlNamespaceUndefined: Self = StObject.set(x, "xmlNamespace", js.undefined)
  }
}
